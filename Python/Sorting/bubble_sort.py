class BubbleSort:
    """
    Bubble sort for a list of elements.

    bubble_sort = BubbleSort([5,6,10,2,3])

    >>> ascending_sort = bubble_sort.ascending()
    [2,3,5,6,10]

    >>> descending_sort = bubble_sort.descending()
    [10,6,5,3,2]

    """

    def __init__(self, arr=[13, 24, 21, 7, 8, 4]):
        self.arr = arr
        self.arr_length = len(self.arr)

    def ascending(self) -> list:
        for i in range(self.arr_length):
            for j in range(i + 1, self.arr_length):
                if self.arr[i] > self.arr[j]:
                    self.arr[i], self.arr[j] = self.arr[j], self.arr[i]

        return self.arr

    def descending(self) -> list:
        for i in range(self.arr_length):
            for j in range(i + 1, self.arr_length):
                if self.arr[i] < self.arr[j]:
                    self.arr[i], self.arr[j] = self.arr[j], self.arr[i]

        return self.arr


if __name__ == "__main__":
    input_arr = list(map(int, input().strip().split()))

    if not input_arr:
        bubble_sort = BubbleSort()
    else:
        bubble_sort = BubbleSort(arr=input_arr)
    print(bubble_sort.ascending())
    print(bubble_sort.descending())
