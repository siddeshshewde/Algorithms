def binary_search(arr, target) -> str:

    """
    Binary Search

    a list of elements should be sorted for binary search

    >>> result = binary_search(arr,target_x)

    >>> Enter the list: 5 4 6 1 9 4 3 1 9 7 36 5 31 54 9 32 64 12 6 45642
        Enter the target: 2
        Not Found

    >>> Enter the list: 5 4 6 1 9 4 3 1 9 7 36 5 31 54 9 32 64 12 6 45642
        Enter the target: 9
        Found

    >>> Enter the list: 5 4 6 1 9 4 3 1 9 7 36 5 31 54 9 32 64 12 6 45642, 25
        There is value error in input. Please re-enter values.

    """
    arr = sorted(arr)
    high = len(arr) - 1
    low = 0
    mid = 0
    found = False

    while low <= high:

        mid = int((low + high) / 2)

        if target == arr[mid]:
            found = True
            break

        elif arr[mid] > target:
            high = mid - 1

        else:
            low = mid + 1

    if found == False:
        return "Not Found"

    return "Found"


if __name__ == "__main__":
    try:
        arr = list(map(int, input("Enter the list: ").strip().split()))
        target_x = int(input("Enter the target: ").strip())
        result = binary_search(arr, target_x)
        print(result)
    except ValueError or NameError:
        print("There is value error in input. Please re-enter values. ")
