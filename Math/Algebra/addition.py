

def addition(a, b):
    """Additon of two numbers
    
    >>> addition(2, 2)
    4
    
    >>> addition(2, -2)
    0
    """
    return a + b

if __name__ == "__main__":
    a = 5
    b = 6
    print(f"The sum of {a} + {b} is {addition(a, b)}")