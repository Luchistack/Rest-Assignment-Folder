class Dictionary:

    def __init__(self, key, value):
        self.key = key
        self.value = value

class MyDictionary:

    def __init__(self):
        self.dictionary_entries = []

    def put(self, key, value):
        
        for entry in self.dictionary_entries:
            
            if entry.key == key:
                entry.value = value
                return

        self.dictionary_entries.append(Dictionary(key, value))

    def get(self, key):

        for entry in self.dictionary_entries:

            if entry.key == key:
                return entry.value

        return None

    def remove(self, key):

        for entry in self.dictionary_entries:

            if entry.key == key:
                self.dictionary_entries.remove(entry)
                return

    def display(self):

        for entry in self.dictionary_entries:

            print(entry.key, "-->", entry.value)
