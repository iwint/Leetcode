def generate(num_rows: int) -> list[int]:
    rows = []
    for i in range(num_rows + 1):
        cols = []
        for col in range(0, i + 1):
            if col == 0 or col == i:
                cols.append(1)
            else:
                cols.append(rows[-1][col - 1] + rows[-1][col])
        rows.append(cols)
    return rows
    # return rows[-1]


print(generate(6))
