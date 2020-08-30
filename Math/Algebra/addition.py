def addition(a, b):
    """
    Additon of two numbers
    https://en.wikipedia.org/wiki/Addition

    >>> addition(2, 2)
    4
    
    >>> addition(2, -2)
    0

    >>> addition(17, 70)
    87

    """
    return a + b

if __name__ == "__main__":
    a = 5
    b = 6
    print(addition(a, b))