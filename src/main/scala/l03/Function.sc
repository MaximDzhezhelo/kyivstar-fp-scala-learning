def sum(x: Int, y: Int) = x + y
def sub(x: Int, y: Int) = x - y
def mul(x: Int, y: Int) = x * y
def div(x: Int, y: Int) = x / y


sum(3, 2)

sum(10, sum(2, 1))

2.*(2)
2 + 2

def calc(a: Int, b: Int, op: (Int, Int) => Int) = op(a, b)

val sumF = (x: Int, y: Int) => x + y

calc(4, 5, sumF)
calc(4, 5, sub)
calc(4, 5, _+_)

// формальный параметр это тот который указан в сигнатуре, фактический тот который передаем

