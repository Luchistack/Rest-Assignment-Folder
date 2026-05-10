#Method = is_empty, push, pop, peek, size, contains, remove, all

class MyQueue:
    def __init__(self):

        self.queue = []

    def is_empty(self):

        return len(self.queue) == 0

    def push(self, name):
        return self.queue.append(name)


    def peek(self):
        if self.is_empty():
            return None
        return self.queue[0]

    def pop(self):
        if self.is_empty():
            return None
        return self.queue.pop(0)


    def size(self):
        return len(self.queue)

    def contains(self, name):
        return name in self.queue

    def remove(self, name):
        return self.queue.remove(name)

    def all(self):
        return self.queue.copy()
