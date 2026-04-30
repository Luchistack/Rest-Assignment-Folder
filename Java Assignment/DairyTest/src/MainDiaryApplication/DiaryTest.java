package MainDiaryApplication;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class DiaryTest {

    @Test
    void testThatDiaryCanBeUnlocked() {

        Diary diary = new Diary("My Day", "1234");

        diary.unlockDiary("1234");

        assertFalse(diary.isLocked());

    }
    @Test
    void testThatDiaryIsLocked(){

        Diary diary = new Diary("My Day", "12345");

        assertTrue(diary.isLocked());

    }
    @Test
    void testThatDiaryCanCreateEntry(){

        Diary diary = new Diary("My Story", "12345");

        diary.unlockDiary("12345");
        diary.createEntry("My Story", "Today was a day, i cant forget, i wrote my first OOP CODE");

        assertEquals(1, diary.getEntryCount());

    }
    @Test
    void testThatDiaryCanDeleteEntry(){

        Diary diary = new Diary("My Story", "12345");

        diary.unlockDiary("12345");
        diary.createEntry("My Story", "Today was a day, i cant forget, i wrote my first OOP CODE");

        diary.deleteEntry(1);

        assertNull(diary.findEntryById(1));

    }
    @Test
    void testThatDiaryCanFindEntry(){

        Diary diary = new Diary("My Story", "12345");

        diary.unlockDiary("12345");
        diary.createEntry("My Story", "Today was a day, i cant forget, i wrote my first OOP CODE");

        Entry entry = diary.findEntryById(1);

        assertNotNull(entry);
        assertEquals("My Story", entry.getTitle());


    }
    @Test
    void testThatLockedDiaryCannotCreateEntry(){

        Diary diary = new Diary("My Story", "12345");

        diary.createEntry("My Story", "12345");

        assertEquals(0, diary.getEntryCount());
    }
    
    @Test
    void testThatDiaryCanUpdateEntry(){

        Diary diary = new Diary("My Story", "1234");

        diary.unlockDiary("1234");
        diary.createEntry("My Story", "Today was a day, i cant forget, i wrote my first OOP CODE");

        diary.updateEntry(1, "My Story", "Today was a day, i cant forget, i wrote my first OOP CODEm And it felt so good");

        Entry entry = diary.findEntryById(1);

        assertEquals("My Story", entry.getTitle());
        assertEquals("Today was a day, i cant forget, i wrote my first OOP CODEm And it felt so good", entry.getBody());
    }
}
