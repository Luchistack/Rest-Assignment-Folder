import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LuchiStackTest {

        @Test
        void testThatQueue_IsEmptyInitially(){

            LuchiStack stack = new LuchiStack();
            assertTrue(stack.isEmpty());
        }

        @Test
        void testThatPushMakesStack_NotEmpty(){

            LuchiStack stack = new LuchiStack();

            stack.push(10);

            assertFalse(stack.isEmpty());

        }

        @Test
        void testStackPeekReturns_LastElement(){

            LuchiStack stack = new LuchiStack();

            stack.push(6);
            stack.push(8);
            stack.push(12);
            stack.push(35);

            assertEquals(35, stack.peek());

        }
        @Test
        void testPopRemovesLastElement(){

            LuchiStack stack = new LuchiStack();

            stack.push(6);
            stack.push(8);
            stack.push(12);
            stack.push(35);

            assertEquals(35, stack.pop());
            assertEquals(3, stack.size());

        }
        @Test
        void testThatStackizeCanBeChecked(){

            LuchiStack stack = new LuchiStack();

            stack.push(6);
            stack.push(8);
            stack.push(12);
            stack.push(35);

            assertEquals(4, stack.size());

        }

        @Test
        void testThatStackCanBeCleared(){

            LuchiStack stack = new LuchiStack();

            stack.push(6);
            stack.push(8);
            stack.push(12);
            stack.push(35);

            stack.clear();
            assertEquals(0, stack.size());

        }

}
