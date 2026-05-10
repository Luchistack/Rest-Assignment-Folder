from unittest import TestCase

from my_queue import MyQueue


class TestMyQueue(TestCase):

    def test_that_stack_initial_state_is_empty(self):

        queue = MyQueue()

        self.assertTrue(queue.is_empty())

    def test_that_my_stack_is_not_empty(self):

        queue = MyQueue()

        queue.push("James")

        self.assertFalse(queue.is_empty())

    def test_that_push_adds_element(self):

        queue = MyQueue()

        queue.push("james")
      
        self.assertEqual("james", queue.peek())

    def test_that_pop_removes_element(self):

        queue = MyQueue()

        queue.push("james")
        queue.push("hope")

        self.assertEqual("james", queue.pop())

    def test_that_size_of_stack_can_be_checked(self):

        queue = MyQueue()

        queue.push("james")
        queue.push("hope")
        queue.push("Angel")

        self.assertEqual(3, queue.size())

    def test_that_stack_can_check_if_an_object_exist(self):

        queue = MyQueue()

        queue.push("james")
        queue.push("hope")
        queue.push("Angel")

        self.assertTrue(queue.contains("hope"))

    def test_that_stack_can_remove_an_object_from_collection(self):

        queue = MyQueue()

        queue.push("james")
        queue.push("hope")
        queue.push("Angel")

        queue.remove("Angel")

        self.assertFalse(queue.contains("Angel"))

    def test_that_stack_can_display__all_object_in_collection(self):

        queue = MyQueue()

        queue.push("james")
        queue.push("hope")
        queue.push("Angel")

        self.assertEqual(["james", "hope", "Angel"], queue.all())

