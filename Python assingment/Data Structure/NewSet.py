class NewSet:
    def __init__(self):
        self.set = []

    def add(self, value):
        if value not in self.set:
            self.set.append(value)

    def contains(self, value):
        return value in self.set



set = NewSet()
set.add(1)
set.add(2)
set.add(3)

print(set.contains(4))