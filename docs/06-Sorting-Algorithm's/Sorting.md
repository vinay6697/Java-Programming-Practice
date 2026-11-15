Sorting Algorithm's

----------------------------------------------------------------------------------------------
1. BubbleSort
JAVA PROGRAM TO SORT AN ARRAY USING BUBBLE SORT

QUESTION:
Write a Java program to sort the given array elements in ascending order using the Bubble Sort algorithm.

EXPLANATION:
Bubble Sort is a sorting algorithm that compares two adjacent elements in an array.

1. Compare the first element with the next element.
2. If the first element is greater than the second element, swap their positions.
3. Continue comparing adjacent elements until the end of the array.
4. After each pass, the largest unsorted element moves to its correct position at the end.
5. Repeat the process until the entire array is sorted in ascending order.

EXAMPLE:

Input:
5
5 3 8 1 2

Output:
1 2 3 5 8


TEST CASES:

Test Case 1:
Input:
5
5 3 8 1 2

Output:
1 2 3 5 8


Test Case 2:
Input:
6
10 5 3 8 2 1

Output:
1 2 3 5 8 10


Test Case 3:
Input:
5
1 2 3 4 5

Output:
1 2 3 4 5


Test Case 4:
Input:
5
9 7 5 3 1

Output:
1 3 5 7 9


Test Case 5:
Input:
7
4 2 4 1 3 2 1

Output:
1 1 2 2 3 4 4


CONSTRAINTS:
1. 1 <= N <= 1000
2. Array elements can be positive, negative or zero.
3. Duplicate elements are allowed.

----------------------------------------------------------------------------------------------

2. Insertion Sort

Write a Java program to sort the given integer array in ascending order using the Insertion Sort algorithm.

Explanation:
Insertion Sort is a sorting algorithm that builds a sorted array one element at a time.

1. Start iterating from the second element (index 1).
2. Store the current element in a variable called key.
3. Compare the key with the elements before it.
4. If the previous element is greater than the key, shift that element one position to the right.
5. Continue comparing until the correct position for the key is found.
6. Insert the key into its correct position.
7. Repeat the process until the entire array is sorted.

## Example:

Input:
Array = {7, 3, 8, 2, 6}

Output:
Array = {2, 3, 6, 7, 8}

Test Cases:

Test Case 1:
Input: 7 3 8 2 6
Expected Output: 2 3 6 7 8

Test Case 2:
Input: 5 4 3 2 1
Expected Output: 1 2 3 4 5

Test Case 3:
Input: 1 2 3 4 5
Expected Output: 1 2 3 4 5

Test Case 4:
Input: 10 5 10 2 5
Expected Output: 2 5 5 10 10

Test Case 5:
Input: -5 3 -2 0 8 -10
Expected Output: -10 -5 -2 0 3 8

Constraints:
1. Array must contain at least one element.
2. Array can contain positive numbers, negative numbers, and duplicate elements.
3. Sort the array in ascending order.
4. Solve the problem using the Insertion Sort algorithm.
5. Do not use built-in sorting methods such as Arrays.sort().

----------------------------------------------------------------------------------------------

3. Selection Sort

Write a Java program to sort the given integer array in ascending order using the Selection Sort algorithm.

Explanation:
Selection Sort is a sorting algorithm that repeatedly finds the smallest element from the unsorted portion of the array and places it at the beginning of that portion.

1. Start iterating from index 0.
2. Assume the current index contains the smallest element.
3. Store the current index in a variable called minIndex.
4. Compare the current minimum element with all the remaining elements.
5. If a smaller element is found, update minIndex.
6. After completing the inner loop, swap the smallest element with the element at the current index.
7. Repeat the process until the entire array is sorted.

 Example:

Input:
Array = {6, 3, 8, 2, 7}

Output:
Array = {2, 3, 6, 7, 8}

Test Cases:

Test Case 1:
Input: 6 3 8 2 7
Expected Output: 2 3 6 7 8

Test Case 2:
Input: 5 4 3 2 1
Expected Output: 1 2 3 4 5

Test Case 3:
Input: 1 2 3 4 5
Expected Output: 1 2 3 4 5

Test Case 4:
Input: 10 5 10 2 5
Expected Output: 2 5 5 10 10

Test Case 5:
Input: -5 3 -2 0 8 -10
Expected Output: -10 -5 -2 0 3 8

Constraints:
1. Array must contain at least one element.
2. Array can contain positive numbers, negative numbers, and duplicate elements.
3. Sort the array in ascending order.
4. Solve the problem using the Selection Sort algorithm.
5. Do not use built-in sorting methods such as Arrays.sort().

----------------------------------------------------------------------------------------------