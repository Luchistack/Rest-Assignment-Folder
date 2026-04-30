class NewStack:
    def __init__(self):
        self.stack = []

    def pop(self):
        if self.is_empty():
            return "Stack is empty"
        return self.stack.pop()

    def push(self, value):
        return self.stack.append(value)

    def is_empty(self):
        return len(self.stack) == 0

    def peek(self):
        if self.is_empty():
            return "Stack is empty"
        return self.stack[-1]

    def contains(self, value):
        if value in self.stack:
            return True
        return False


stack = NewStack()

print(stack.is_empty())

stack.push(1)
stack.push(2)
stack.push(3)

print(stack.pop())
print(stack.peek())
print(stack.is_empty())
print(stack.contains(2))