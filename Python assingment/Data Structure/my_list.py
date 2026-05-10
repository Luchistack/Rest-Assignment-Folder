class MyList:
    def __init__(self):
        self.items = []

    def add(self, value):
        self.items.append(value)

    def get(self, index):
        return self.items[index]

    def size(self):
        return len(self.items)

    def display(self):

        print(self.items)
