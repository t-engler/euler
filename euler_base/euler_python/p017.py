digits_one = len("one")
digits_two = len("two")
digits_three = len("three")
digits_four = len("four")
digits_five = len("five")
digits_six = len("six")
digits_seven = len("seven")
digits_eight = len("eight")
digits_nine = len("nine")
digits_ten = len("ten")
digits_eleven = len("eleven")
digits_twelve = len("twelve")
digits_thirteen = len("thirteen")
digits_fourteen = len("fourteen")
digits_fifteen = len("fifteen")
digits_sixteen = len("sixteen")
digits_seventeen = len("seventeen")
digits_eighteen = len("eighteen")
digits_nineteen = len("nineteen")
digits_twenty = len("twenty")
digits_thirty = len("thirty")
digits_forty = len("forty")
digits_fifty = len("fifty")
digits_sixty = len("sixty")
digits_seventy = len("seventy")
digits_eighty = len("eighty")
digits_ninety = len("ninety")
digits_hundred = len("hundred")
digits_and = len("and")


def get_number_for_digit(digit: int) -> int:
    match digit:
        case 1:
            return digits_one
        case 2:
            return digits_two
        case 3:
            return digits_three
        case 4:
            return digits_four
        case 5:
            return digits_five
        case 6:
            return digits_six
        case 7:
            return digits_seven
        case 8:
            return digits_eight
        case 9:
            return digits_nine
        case _:
            return 0


def get_number_of_letters(number: int) -> int:
    number_digits: int = 0
    hundred_digit: int = 0
    ten_digit: int = 0
    digit: int = 0

    if number > 99:
        hundred_digit = int(number / 100)
        number -= hundred_digit * 100

    if number > 9:
        ten_digit = int(number / 10)
        number -= ten_digit * 10

    digit = number

    if hundred_digit > 0:
        number_digits += get_number_for_digit(hundred_digit)
        number_digits += digits_hundred

    if hundred_digit > 0 and (ten_digit > 0 or digit > 0):
        number_digits += digits_and

    if ten_digit == 1:
        ten_digit_and_digit = (ten_digit * 10) + digit
        match ten_digit_and_digit:
            case 10:
                number_digits += digits_ten
            case 11:
                number_digits += digits_eleven
            case 12:
                number_digits += digits_twelve
            case 13:
                number_digits += digits_thirteen
            case 14:
                number_digits += digits_fourteen
            case 15:
                number_digits += digits_fifteen
            case 16:
                number_digits += digits_sixteen
            case 17:
                number_digits += digits_seventeen
            case 18:
                number_digits += digits_eighteen
            case 19:
                number_digits += digits_nineteen
    elif ten_digit > 1:
        match ten_digit:
            case 2:
                number_digits += digits_twenty
            case 3:
                number_digits += digits_thirty
            case 4:
                number_digits += digits_forty
            case 5:
                number_digits += digits_fifty
            case 6:
                number_digits += digits_sixty
            case 7:
                number_digits += digits_seventy
            case 8:
                number_digits += digits_eighty
            case 9:
                number_digits += digits_ninety

    if ten_digit != 1 and digit > 0:
        number_digits += get_number_for_digit(digit)

    return number_digits


total_digits: int = 0

for current_number in range(1, 1000):
    total_digits += get_number_of_letters(current_number)

total_digits += len("one thousand".replace(" ", ""))

print(get_number_of_letters(342))
print(get_number_of_letters(115))
print(total_digits)
