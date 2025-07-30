Linear Search goes through each element of the array one by one until it finds the target or reaches the end. It doesn’t require the array to be sorted. It's simple but slow for large arrays.

    Time Complexity:

        Best: O(1) (if the element is first)

        Worst: O(n)

    Space Complexity: O(1)

    ✅ Works on unsorted arrays
**************************************************************************
    2.binary search..
    Binary Search works by repeatedly dividing a sorted array into halves and checking the middle element. It's much faster than linear search, but only works on sorted arrays.

    Time Complexity:

        Best: O(1) (if middle is the target)

        Worst/Average: O(log n)

    Space Complexity: O(1) for iterative, O(log n) for recursive

    ❗ Requires sorted array
******************************************************************
    3.buuble sort :
      Bubble Sort compares adjacent elements and swaps them if they’re in the wrong order. It repeats until the array is sorted. It's easy to understand but inefficient for large data.

    Time Complexity:

        Best: O(n) (if already sorted, with optimization)

        Average/Worst: O(n²)

    Space Complexity: O(1)

    ✅ Stable sort
    *********************************************************************
    4.insertion sort:
    Insertion Sort builds the sorted array one item at a time, by comparing and shifting larger values to the right. It’s good for small or nearly sorted arrays.

    Time Complexity:

        Best: O(n)

        Average/Worst: O(n²)

    Space Complexity: O(1)

    ✅ Stable sort
    **********************************************************************
    5.selection sort :
    Selection Sort selects the minimum element from the unsorted part and places it at the beginning. It always goes through the unsorted part to find the smallest, so it's slower than others.

    Time Complexity:

        Best/Average/Worst: O(n²)

    Space Complexity: O(1)

    ❌ Not stable by default
    *********************************************************************