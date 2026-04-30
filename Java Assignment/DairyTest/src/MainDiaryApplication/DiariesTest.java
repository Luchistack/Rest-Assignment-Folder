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
        
        assertNotNull("My Day", diaries.add(title, password));
    }
    
    @Test
    void testThatDiaryCanFindUsername(){

        Diaries diaries = new Diaries();


        diaries.add("My Day", "1234");

        Diary foundDiary = diaries.findByUsername("My Day");

        assertNotNull(foundDiary);
        assertEquals("My Day", diaries.getUsername());
        
    }

    @Test
    void testThatDiaryCanDelete(){

        Diaries diaries = new Diaries();

        diaries.add("My Day", "1234");

        diaries.delete("My Day");

        assertNotNull(diaries.findByUsername("My Day"));


    }

}
