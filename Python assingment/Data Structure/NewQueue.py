class NewQueue:
    def __init__(self):
        self.queue = []

    def enqueue(self, value):
       self.queue.append(value)

    def is_empty(self):
        return len(self.queue) == 0

    def dequeue(self):
        if self.is_empty():
            raise IndexError('Queue is empty')
        return self.queue.pop(0)




queue = NewQueue()

queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)

print(queue.dequeue())

