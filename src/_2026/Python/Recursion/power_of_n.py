def power_of(x: float, n: int):
    if n == 1:
        return x
    return float(x * power_of(x, n - 1))

print(power_of(2, 10))
