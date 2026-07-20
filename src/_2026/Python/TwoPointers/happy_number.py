def is_happy_number(n: int) -> bool:
    slow = n
    fast = sum_of_square_of_each_digit(n)

    while fast != 1 and slow != fast:
        slow = sum_of_square_of_each_digit(slow)
        fast = sum_of_square_of_each_digit(sum_of_square_of_each_digit(fast))

    return fast == 1


def sum_of_square_of_each_digit(n: int) -> int:
    total: int = 0

    while n > 0:
        d = n % 10
        n //= 10
        total += d * d

    return total
