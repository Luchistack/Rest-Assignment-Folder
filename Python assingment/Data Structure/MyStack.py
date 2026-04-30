class MyStack:
    def __init__(self):
        self.stack = []

    def push(self, value):
        self.stack.append(value)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return "Stack is empty"

    def peek(self, value):
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def is_empty(self):
        return self.stack == []




stack = MyStack()
stack.push(5)
stack.push(6)
stack.push(7)


print(stack.peek(-1))
print(stack.pop())
