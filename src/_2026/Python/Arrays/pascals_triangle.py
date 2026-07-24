def generate(num_rows: int) -> list[list[int]]:
    d: list[list[int]] = [[] for _ in range(num_rows)]

    for i in range(1, num_rows + 1):
        row = i - 1
        for col in range(0, i):
            if col == 0 or col == row:
                d[row].insert(col, 1)
            else:
                d[row].insert(col, d[row - 1][col - 1] + d[row - 1][col + 1 - 1])
    return d


print(generate(5))
