package MainDiaryApplication;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.*;

public class DiariesTest {

    @Test
    void testThatDiariesCanAdd(){

        Diaries diaries = new Diaries();

        String title = "My Day";
        String password = "Luchi111";


        diaries.add(title, password);

        assertNotNull("My Day",diaries.findByUsername(title));
    }
    
    @Test
    void testThatDiaryCanFindUsername(){

        Diaries diaries = new Diaries();


        diaries.add("My Day", "1234");

        Diary foundDiary = diaries.findByUsername("My Day");

        assertNotNull(foundDiary);
        assertEquals("My Day", foundDiary.getUsername());
        
    }

    @Test
    void testThatDiaryCanDelete(){

        Diaries diaries = new Diaries();
        diaries.add("Luchi", "1234");

        diaries.delete("Luchi");

        assertNull(diaries.findByUsername("Luchi"));


    }
    @Test
    void testThatMultipleDiariesCanBeAdded(){


        Diaries diaries = new Diaries();

        diaries.add("Luchi", "1234");
        diaries.add("Bola", "1456");
        diaries.add("Ene", "5555");

        assertNotNull(diaries.findByUsername("Luchi"));
        assertNotNull(diaries.findByUsername("Bola"));
        assertNotNull(diaries.findByUsername("Ene"));

    }
    @Test
   void testThatSearchingForNoneExistingDiaryReturnsNull(){


        Diaries diaries = new Diaries();

        assertNull(diaries.findByUsername("out"));
    }
    @Test
    void testThatDeletingUnknowDiaryDoesNorCrash(){


        Diaries diaries = new Diaries();

        diaries.delete("unknown");

        assertNull(diaries.findByUsername("unknown"));

    }
    @Test
    void testThatDeletedDiaryCannotBeFound(){

        Diaries diaries = new Diaries();

        diaries.add("Faith", "1234");

        diaries.delete("Faith");

        assertNull(diaries.findByUsername("Faith"));
    }

}
