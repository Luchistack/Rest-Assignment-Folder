from unittest import TestCase

from my_map import MyDictionary

class CUstomMap(TestCase):

    def test_put_adds_new_entry(self):
    
        my_dict = MyDictionary()

        my_dict.put("name", "Faith")

        self.assertEqual("Faith", my_dict.get("name"))

    def test_put_updates_existing_key(self):

        my_dict = MyDictionary()

        my_dict.put("name", "Faith")
        my_dict.put("name", "Oluchi")

        self.assertEqual("Oluchi", my_dict.get("name"))

    def test_get_returns_none_for_missing_key(self):

        my_dict = MyDictionary()

        self.assertIsNone(my_dict.get("age"))

    def test_remove_delete_entry(self):

        my_dict = MyDictionary()

        my_dict.put("name", "Faith") 

        my_dict.remove("name")  

        self.assertIsNone(my_dict.get("name"))    
