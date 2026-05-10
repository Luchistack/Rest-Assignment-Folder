package seekerApp.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seekerApp.models.Complexion;
import seekerApp.models.Gender;
import seekerApp.models.Seeker;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeekerRepositoryImplTest {

    private SeekerRepository seekerRepository;

    @BeforeEach
    void setUp(){
        seekerRepository = new SeekerRepositoryImpl();
    }

    private Seeker buildSeeker(String name, Gender gender){

        Seeker seeker = new Seeker();
        seeker.setName(name);
        seeker.setGender(gender);
        seeker.setDateOfBirth(LocalDate.of(1995, 6, 15));
        seeker.setCurrentLocation("Lagos");
        seeker.setHeightInCM(170);
        seeker.setComplexion(Complexion.DARK);
        return seeker;
    }
    @Test
    void testSave_assignsIdToNewSeeker() {
        Seeker seeker = buildSeeker("Ada", Gender.FEMALE);

        Seeker saved = seekerRepository.save(seeker);

        assertNotNull(saved, "Saved Seeker should not be null");
        assertEquals(1, saved.getId(), "Saved Seeker should have an id greater than 0");
    }
    @Test
    void testSave_assignsUniqueIdsToMultipleSeekers() {
        Seeker first  = seekerRepository.save(buildSeeker("Ada",   Gender.FEMALE));
        Seeker second = seekerRepository.save(buildSeeker("Emeka", Gender.MALE));

        assertNotEquals(first.getId(), second.getId(),
                "Two different Seekers must not share the same id");
    }
    @Test
    void testSave_newSeeker_increasesCount() {
        assertEquals(0, seekerRepository.count(), "Repository should start empty");

        seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        assertEquals(1, seekerRepository.count(), "Count should be 1 after saving one Seeker");
    }
    @Test
    void testSave_existingSeeker_updatesStoredData() {
        // First, create the Seeker (id assigned by repository)
        Seeker saved = seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        // Change some fields on the returned object
        saved.setName("Ada Updated");
        saved.setCurrentLocation("Abuja");

        // Pass the modified Seeker back to save() — it carries the id now
        Seeker updated = seekerRepository.save(saved);

        assertNotNull(updated, "save() should return the updated Seeker");
        assertEquals("Ada Updated", seekerRepository.findById(saved.getId()).getName(),
                "Name should reflect the update");
        assertEquals("Abuja", seekerRepository.findById(saved.getId()).getCurrentLocation(),
                "Location should reflect the update");
    }
    @Test
    void testSave_existingSeeker_doesNotIncreaseCount() {
        Seeker saved = seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        saved.setName("Ada v2");
        seekerRepository.save(saved); // update

        assertEquals(1, seekerRepository.count(),
                "Count should remain 1 after updating via save()");
    }

    @Test
    void testSave_existingSeeker_oldDataIsNoLongerStored() {
        Seeker saved = seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));
        int id = saved.getId();

        saved.setName("NewName");
        seekerRepository.save(saved);

        assertEquals("NewName", seekerRepository.findById(id).getName(),
                "findById() should return the updated name, not the old one");
    }
    @Test
    void testFindById_returnsSavedSeeker() {
        Seeker saved = seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        Seeker found = seekerRepository.findById(saved.getId());

        assertNotNull(found, "Should find the Seeker that was saved");
        assertEquals(saved.getId(),   found.getId(),   "Id should match");
        assertEquals(saved.getName(), found.getName(), "Name should match");
    }
    @Test
    void testFindById_returnsNullForNonExistentId() {
        Seeker found = seekerRepository.findById(999);

        assertNull(found, "Should return null when no Seeker has the given id");
    }
    @Test
    void testFindAll_returnsEmptyListWhenNoSeekersExist() {
        List<Seeker> all = seekerRepository.findAll();

        assertNotNull(all,        "findAll() should never return null");
        assertTrue(all.isEmpty(), "List should be empty when no Seekers have been saved");
    }
    @Test
    void testFindAll_returnsAllSavedSeekers() {
        seekerRepository.save(buildSeeker("Ada",   Gender.FEMALE));
        seekerRepository.save(buildSeeker("Emeka", Gender.MALE));
        seekerRepository.save(buildSeeker("Zara",  Gender.FEMALE));

        List<Seeker> all = seekerRepository.findAll();

        assertEquals(3, all.size(), "findAll() should return every saved Seeker");
        }
    @Test
    void testFindAll_returnsDefensiveCopy() {
        seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        List<Seeker> all = seekerRepository.findAll();
        all.clear(); // clear the returned list

        assertEquals(1, seekerRepository.count(),
                "Clearing the returned list should NOT affect the repository");
    }
    @Test
    void testDeleteById_removesSeeker() {
        Seeker saved = seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        seekerRepository.deleteById(saved.getId());

        assertNull(seekerRepository.findById(saved.getId()),
                "Deleted Seeker should no longer be retrievable");
    }

    @Test
    void testDeleteById_decreasesCount() {
        Seeker saved = seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));
        seekerRepository.save(buildSeeker("Emeka", Gender.MALE));

        seekerRepository.deleteById(saved.getId());

        assertEquals(1, seekerRepository.count(),
                "Count should drop to 1 after deleting one of two Seekers");
    }

    @Test
    void testDeleteById_doesNothingForNonExistentId() {
        seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));

        assertDoesNotThrow(() -> seekerRepository.deleteById(999),
                "deleteById() should not throw when the id does not exist");

        assertEquals(1, seekerRepository.count(),
                "Existing Seekers should be unaffected by a delete of a non-existent id");
    }
    @Test
    void testDeleteAll_removesAllSeekers() {
        seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));
        seekerRepository.save(buildSeeker("Emeka", Gender.MALE));
        seekerRepository.save(buildSeeker("Zara", Gender.FEMALE));

        seekerRepository.deleteAll();

        assertEquals(0, seekerRepository.count(),
                "Count should be 0 after deleteAll()");
        assertTrue(seekerRepository.findAll().isEmpty(),
                "findAll() should return an empty list after deleteAll()");
    }
    @Test
    void testDeleteAll_onEmptyRepository_doesNotThrow() {
        assertDoesNotThrow(() -> seekerRepository.deleteAll(),
                "deleteAll() should not throw when repository is already empty");
        assertEquals(0, seekerRepository.count(),
                "Count should remain 0 after deleteAll() on empty repository");
    }

    @Test
    void testDeleteAll_thenSave_stillWorks() {
        seekerRepository.save(buildSeeker("Ada", Gender.FEMALE));
        seekerRepository.deleteAll();

        Seeker savedAgain = seekerRepository.save(buildSeeker("New Seeker", Gender.MALE));

        assertNotNull(savedAgain, "save() should still work after deleteAll()");
        assertTrue(savedAgain.getId() > 0, "Saved Seeker should still receive a valid id");
        assertEquals(1, seekerRepository.count(),
                "Count should be 1 after saving one Seeker post-deleteAll()");
    }
    @Test
    void testCount_isZeroForEmptyRepository() {
        assertEquals(0, seekerRepository.count(), "A new repository must have a count of 0");
    }

    @Test
    void testCount_reflectsNumberOfSavedSeekers() {
        seekerRepository.save(buildSeeker("Ada",   Gender.FEMALE));
        seekerRepository.save(buildSeeker("Emeka", Gender.MALE));
        seekerRepository.save(buildSeeker("Zara",  Gender.FEMALE));

        assertEquals(3, seekerRepository.count(), "Count must equal the number of saved Seekers");
    }







}
