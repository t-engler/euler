def collatz(start_value: int) -> int:
    current_value: int = start_value
    iteration: int = 1

    while current_value > 1:
        if current_value % 2 == 0:
            current_value = int(current_value / 2)
        else:
            current_value = (3 * current_value) + 1
        iteration += 1

    return iteration


largest_collatz: int = 1
index_collatz: int = 1
for start in range(1, 1_000_001):
    if start % 100_000 == 0:
        print(start)
    current_collatz = collatz(start)
    if current_collatz > largest_collatz:
        largest_collatz = current_collatz
        index_collatz = start


print(index_collatz)
