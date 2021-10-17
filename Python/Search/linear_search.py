def linear_search(arr, target) -> str:
    """
    Linear Search Algorithm

    status = linear_search(arr, target)

    >>> Enter list: 4 5 3 7 2 0 4 62 21
        Enter target: 62

        Found

    >>> Enter list: 4 5 3 7 2 0 4 62 21
        Enter target: 300

        Not Found

    >>> Enter list: 4,5,3,7 2 0 4 62 21
        Enter target: 62

        There is value error in input. Please re-enter values.

    >>> Enter list: 4 5 3 7 2 0 4 62 21
        Enter target: 62 4

        There is value error in input. Please re-enter values.


    """
    flag = False
    for i in range(len(arr)):
        if target == arr[i]:
            flag = True
            break

    if not flag == False:
        return "Found"

    return "Not Found"


if __name__ == "__main__":
    try:
        arr = list(map(int, input("Enter list: ").strip().split()))
        target_x = int(input("Enter target: ").strip())
        status = linear_search(arr, target_x)
        print(status)

    except ValueError or NameError:
        print("There is value error in input. Please re-enter values. ")
