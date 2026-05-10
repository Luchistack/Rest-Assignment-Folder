#Method = is_empty, push, pop, peek, size, contains, remove, all

class MyStack:
    def __init__(self):

        self.stack = []

    def is_empty(self):

        return len(self.stack) == 0

    def push(self, name):
        return self.stack.append(name)


    def peek(self):
        return self.stack[-1]

    def pop(self):
        return self.stack.pop()


    def size(self):
        return len(self.stack)

    def contains(self, name):
        return name in self.stack

    def remove(self, name):
        return self.stack.remove(name)

    def all(self):
        return self.stack
