def sum_of_digits(digit: int) -> int:
    digit_string = str(digit)
    list_of_number = list(map(int, digit_string.strip()))
    return sum(list_of_number)


print(sum_of_digits(2**1000))
