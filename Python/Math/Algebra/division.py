def division(a, b):
    """
    Division of two numbers
    https://en.wikipedia.org/wiki/Division_(mathematics)

    >>> division(2, 2)
    1.0
    
    >>> division(2, -2)
    -1.0

    >>> division(17, 70)
    0.24285714285714285

    """
    return a / b

if __name__ == "__main__":
    a = 5
    b = 6
    print(division(a, b))