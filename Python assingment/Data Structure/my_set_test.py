from unittest import TestCase
from my_set import MySet

class TestMySet(TestCase):
    
    def test_add_and_contains(self):

        new_set = MySet()

        new_set.add(10)
        new_set.add(20)


        self.assertTrue(new_set.contains(10))
        self.assertTrue(new_set.contains(20))
        self.assertFalse(new_set.contains(50))

    def test_no_duplicates(self):

        new_set = MySet()

        new_set.add(20)
        new_set.add(20)
        new_set.add(20)

        self.assertEqual(len(new_set.show()), 1)


    def test_remove(self):

        new_set = MySet()

        new_set.add(10)
        new_set.add(20)

        new_set.remove(10)

        self.assertFalse(new_set.contains(10))
        self.assertTrue(new_set.contains(20))

    def test_is_empty(self):

        new_set = MySet()

        self.assertTrue(new_set.is_empty())

        new_set.add(5)

        self.assertFalse(new_set.is_empty())


    def test_clear(self):

        new_set = MySet()

        new_set.add(10)
        new_set.add(20)

        new_set.clear()

        self.assertTrue(new_set.is_empty())


if __name__ == "__main__":
    unittest.main()
