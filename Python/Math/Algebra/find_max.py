def find_max(numbers):
    """
    Finding the max number in a given range/list

    >>> find_max([1, 7, 8, 17, 19, 34, 55])
    55
    
    >>> find_max([17, 72, 28, 137, 119, 374, 595])
    595

    >>> find_max([127, 722, 218, 1317, 1129, 32, 59])
    1317

    """
    max_number = numbers[0]
    for x in numbers:
        if x > max_number:
            max_number = x
    return max_number

if __name__ == "__main__":
    print(find_max([2, 4, 9, 7, 19, 94, 5]))  # 94