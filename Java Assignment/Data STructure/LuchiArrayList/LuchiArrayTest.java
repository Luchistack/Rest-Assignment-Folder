import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LuchiArrayTest {

    @Test
    void testThatList_IsEmptyInitially(){

        LuchiArrayList list = new LuchiArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    void testThatAddMakesList_NotEmpty(){

        LuchiArrayList list = new LuchiArrayList();

        list.add(4);

        assertFalse(list.isEmpty());

    }

    @Test
    void testListGetReturns_IndexElement(){

        LuchiArrayList list = new LuchiArrayList();

        list.add(6);
        list.add(8);
        list.add(12);
        list.add(35);

        assertEquals(6, list.get(0));

    }
    @Test
    void testRemoveRemovesElementFromListIndex(){

        LuchiArrayList list = new LuchiArrayList();

        list.add(6);
        list.add(8);
        list.add(12);
        list.add(35);

        list.remove(2);
        assertEquals(3, list.size());

    }
//    @Test
//    void testThatListSizeCanBeChecked(){
//
//        LuchiArrayList list = new LuchiArrayList();
//
//        list.add(6);
//        list.add(8);
//        list.add(12);
//        list.add(35);
//
//        assertEquals(4, list.size());
//
//    }
//
//    @Test
//    void testThatQueueCanBeCleared(){
//
//        LuchiArrayList list = new LuchiArrayList();
//
//        queue.push(6);
//        queue.push(8);
//        queue.push(12);
//        queue.push(35);
//
//        queue.clear();
//
//        assertEquals(0, queue.size());
//
//    }

}


