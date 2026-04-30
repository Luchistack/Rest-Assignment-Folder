numbers = [1, 2, 3, 4, 5]
# first = set(numbers)
# second = {1, 5, 6}
#
# print(first | second)
# print(first & second)
# print(first - second)
# print(first ^ second)
#
# if 1 in first:
#  print("yes")


class MySet:
    def __init__(self):
        self.data = []

    def add(self, value):
        if value not in self.data:
            self.data.append(value)

    def remove(self, value):
        if value in self.data:
            self.data.remove(value)


    def contains(self, value):
        return value in self.data

    def show(self):
        return self.data



number = MySet()
number.add(1)
number.add(2)
number.add(1)

print(number.show())

