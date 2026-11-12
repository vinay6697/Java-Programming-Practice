Searching Algorithms

----------------------------------------------------------------------------------------------
1. WAJP to implement Linear Search in an Array.

Question:
Write a Java program to search for a given element in an array using the Linear Search technique.

Explanation:
1. Read the size of the array from the user.
2. Read the array elements.
3. Read the element that needs to be searched (key).
4. Traverse the array from the first index to the last index using a loop.
5. Compare each array element with the key.
6. If the element matches the key, print its position and stop searching.
7. If the element is not found after traversing the entire array, print "Element not found".

Test Cases:

Test Case 1:
Input:
Array: 10 20 30 40 50
Key: 30
Output:
Element found at index 2

Test Case 2:
Input:
Array: 5 15 25 35 45
Key: 5
Output:
Element found at index 0

Test Case 3:
Input:
Array: 11 22 33 44 55
Key: 55
Output:
Element found at index 4

Test Case 4:
Input:
Array: 2 4 6 8 10
Key: 7
Output:
Element not found

Test Case 5:
Input:
Array: 10 20 30 20 40
Key: 20
Output:
Element found at index 1

Note:
- Linear Search checks each element one by one.
- It works on both sorted and unsorted arrays.
- Best Case Time Complexity: O(1)
- Worst Case Time Complexity: O(n)
- Space Complexity: O(1)
----------------------------------------------------------------------------------------------

2. WAJP to implement Binary Search in an Array.

Write a Java program to search for a given element in a sorted array using the Binary Search algorithm.

Explanation:
1. Read the size of the array from the user.
2. Read the array elements in sorted order (ascending order).
3. Read the element that needs to be searched (key).
4. Initialize two variables:
   - low = 0
   - high = array.length - 1
5. Calculate the middle index using:
   mid = low + (high - low) / 2
6. Compare the middle element with the key:
   - If arr[mid] == key, the element is found.
   - If key is greater than arr[mid], search the right half by updating low = mid + 1.
   - If key is smaller than arr[mid], search the left half by updating high = mid - 1.
7. Repeat the process until the element is found or low becomes greater than high.
8. If the element is not found, print "Element not found".

Test Cases:

Test Case 1:
Input:
Array: 10 20 30 40 50
Key: 30
Output:
Element found at index 2

Test Case 2:
Input:
Array: 5 10 15 20 25 30
Key: 5
Output:
Element found at index 0

Test Case 3:
Input:
Array: 10 20 30 40 50 60
Key: 60
Output:
Element found at index 5

Test Case 4:
Input:
Array: 2 4 6 8 10 12
Key: 7
Output:
Element not found

Test Case 5:
Input:
Array: 10 20 20 30 40 50
Key: 20
Output:
Element found at index 2

Note:
- Binary Search works only on sorted arrays.
- It repeatedly divides the search range into two halves.
- Best Case Time Complexity: O(1)
- Average Case Time Complexity: O(log n)
- Worst Case Time Complexity: O(log n)
- Space Complexity (Iterative): O(1)