import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


    public class TestQueue {

        @Test
        void testThatQueue_IsEmptyInitially(){

            LuchiQueue queue = new LuchiQueue();
            assertTrue(queue.isEmpty());
        }

        @Test
        void testThatPushMakesQueue_NotEmpty(){

            LuchiQueue queue = new LuchiQueue();

            queue.push(4);

            assertFalse(queue.isEmpty());

        }

        @Test
        void testQueuePeekReturns_FirstElement(){

            LuchiQueue queue = new LuchiQueue();

            queue.push(6);
            queue.push(8);
            queue.push(12);
            queue.push(35);

            assertEquals(6, queue.peek());

        }
        @Test
        void testPopRemovesFirstElement(){
            LuchiQueue queue = new LuchiQueue();
            queue.push(6);
            assertEquals(6, queue.pop());

        }
        @Test
        void testThatQueueSizeCanBeChecked(){

            LuchiQueue queue = new LuchiQueue();

            queue.push(6);
            queue.push(8);
            queue.push(12);
            queue.push(35);

            assertEquals(4, queue.size());

        }

        @Test
        void testThatQueueCanBeCleared(){

            LuchiQueue queue = new LuchiQueue();

            queue.push(6);
            queue.push(8);
            queue.push(12);
            queue.push(35);

            queue.clear();

            assertEquals(0, queue.size());

        }

    }


