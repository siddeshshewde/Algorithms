class SelectionSort:
    """
    Selection Sort
    >>> uses the index than a element for swapping

    >>> selection_sort.ascending()

        Enter list:  0 5 4 9 7 6 3 2 1 8
        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    >>> selection_sort.descending()

        Enter list:  0 5 4 9 7 6 3 2 1 8
        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    """

    def __init__(self, arr=[1, 5, 9, 7, 3, 4, 6, 8, 2, 0]) -> None:
        self.arr = arr
        self.size = len(self.arr)

    def ascending(self):
        for i in range(self.size):
            idx = i
            for j in range(i + 1, self.size):
                if self.arr[idx] > self.arr[j]:
                    idx = j
            self.arr[idx], self.arr[i] = self.arr[i], self.arr[idx]
        return self.arr

    def descending(self):
        for i in range(self.size):
            idx = i
            for j in range(i + 1, self.size):
                if self.arr[idx] < self.arr[j]:
                    idx = j
            self.arr[idx], self.arr[i] = self.arr[i], self.arr[idx]
        return self.arr


if __name__ == "__main__":
    try:
        arr = list(map(int, input("Enter list: ").strip().split()))
        if arr:
            selection_sort = SelectionSort(arr)
        else:
            selection_sort = SelectionSort()
        print(selection_sort.ascending())
        print(selection_sort.descending())

    except NameError and ValueError:
        print("Incorrect Input")
