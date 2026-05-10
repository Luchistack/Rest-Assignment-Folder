from unittest import TestCase

from my_list import MyList

class TestMyList(TestCase):
    
    def test_add_and_get(self):

        my_list = MyList()

        my_list.add(20)
        my_list.add(10)

        self.assertEqual(my_list.get(0), 20)
        self.assertEqual(my_list.get(1), 10)

    def test_size(self):

        my_list = MyList()

        my_list.add(10)

        my_list.add(20)

        my_list.add(30)

        self.assertEqual(3, my_list.size())


    def test_display_does_not_crash(self):

        my_list = MyList()

        my_list.add(5)

        my_list.add(15)

        my_list.display()

        self.assertTrue(True)


if __name__ == "__main__":
    unittest.main()
