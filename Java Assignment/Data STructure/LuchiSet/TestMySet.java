
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestMySet{

    @Test
    void testThatMySetIsEmpty(){

    LuchiSet set = new LuchiSet();

    assertTrue(set.isEmpty());

    }

    @Test
    void testThatMySetIsNotEmpty(){
        LuchiSet set = new LuchiSet();

    set.push("faith");

    assertFalse(set.isEmpty());
    }

    @Test

    void testThatMySetCanAdd() {

        LuchiSet set = new LuchiSet();

        set.push("Luchi");
        set.push("James");

        assertFalse(set.isEmpty());
    }

    @Test
    void testThatSetContainsAValue(){

        LuchiSet set = new LuchiSet();

        set.push("Luchi");
        set.push("James");
        set.push("Mich");
        set.push("Favor");

        assertTrue(set.contains("Mich"));

    }

    @Test
    void testThatSetCanRemoveAValue(){

        LuchiSet set = new LuchiSet();

        set.push("Luchi");
        set.push("James");
        set.push("Mich");
        set.push("Favor");

        assertTrue(set.remove("Mich"));
        assertEquals(3, set.size());

    }
    @Test
    void testThatSetCanClearAllValue(){

        LuchiSet set = new LuchiSet();

        set.push("Luchi");
        set.push("James");
        set.push("Mich");
        set.push("Favor");

        set.clear();
        assertEquals(0, set.size());

    }
    @Test
    void testThatSetCanCheckTotalSizeOflValuesInIt(){

        LuchiSet set = new LuchiSet();

        set.push("Luchi");
        set.push("James");
        set.push("Mich");
        set.push("Favor");

        assertEquals(4, set.size());

    }




}

