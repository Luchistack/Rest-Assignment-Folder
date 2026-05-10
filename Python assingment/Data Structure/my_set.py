

class MySet:
    def __init__(self):
        self.data = []

    def is_empty(self):
        return len(self.data) == 0

    def add(self, value):
       
         if value not in self.data:

            self.data.append(value)

    def remove(self, value):

        if value in self.data:

            self.data.remove(value)


    def contains(self, value):
        return value in self.data

    def show(self):

        return self.data.copy()

    def clear(self):

        self.data = []



