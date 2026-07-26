def max_profit(prices: list[int]) -> int:
    profit = 0
    buy = prices[0]

    for price in range(len(prices)):
        if prices[price] < buy:
            buy = prices[price]
        elif prices[price] - buy > profit:
            profit = prices[price] - buy

    return profit

print(max_profit([7, 1, 5, 3, 6, 4]))
