def add_plus_one(digits: list[int]) -> list[int]:
    last_digit = digits[len(digits) - 1] + 1
    if last_digit < 10:
        digits[len(digits) - 1] = last_digit
        return digits

    remainder = last_digit - digits[len(digits) - 1]

    for i in range(len(digits) - 1, -1, -1):
        total = remainder + digits[i]
        d = total % 10
        digits[i] = d
        remainder = int(total / 10)

    if remainder > 0:
        digits.insert(0, remainder)

    return digits


print(add_plus_one([0, 1, 1, 2]))
