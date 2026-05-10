from unittest import TestCase

from my_stack import MyStack


class TestMyStack(TestCase):

    def test_that_stack_initial_state_is_empty(self):
        stack = MyStack()

        self.assertTrue(stack.is_empty())

    def test_that_my_stack_is_not_empty(self):
        stack = MyStack()

        stack.push("James")

        self.assertFalse(stack.is_empty())

    def test_that_push_adds_element(self):
        stack = MyStack()

        stack.push("james")

        self.assertEqual("james", stack.peek())

    def test_that_pop_removes_element(self):
        stack = MyStack()

        stack.push("james")
        stack.push("Esther")

        self.assertEqual("Esther", stack.pop())

    def test_that_size_of_stack_can_be_checked(self):
        stack = MyStack()

        stack.push("james")
        stack.push("hope")
        stack.push("Angel")

        self.assertEqual(3, stack.size())

    def test_that_stack_can_check_if_an_object_exist(self):
        stack = MyStack()

        stack.push("james")
        stack.push("hope")
        stack.push("Angel")

        self.assertTrue(stack.contains("hope"))

    def test_that_stack_can_remove_an_object_from_collection(self):
        stack = MyStack()

        stack.push("james")
        stack.push("hope")
        stack.push("Angel")

        stack.remove("Angel")

        self.assertFalse(stack.contains("Angel"))

    def test_that_stack_can_display__all_object_in_collection(self):
        stack = MyStack()

        stack.push("james")
        stack.push("hope")
        stack.push("Angel")

        self.assertEqual(["james", "hope", "Angel"], stack.all())


