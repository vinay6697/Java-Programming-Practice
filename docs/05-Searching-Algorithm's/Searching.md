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