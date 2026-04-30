import jupiter.assertion.asserTrue;

import MySet;

public class TestMySet{

    @Test
    void testThatMySetIsEmpthy(){

    Myset set = new Myset();

    assertTrue(set.isEmpty());

    }

    @Test
    void testThatMySetIsNotEmpty(){
    Myset set = new Myset();

    set.push("faith");

    assertFalse(set.isEmpty);
    }

    @Test

    void testThatMySetCanAdd(){

    Myset set = new Myset();

    set.push("Luchi")
    set.push("James")

    assertFalse(set.isEmpty());
    assertTrue(set.push());



}





}
