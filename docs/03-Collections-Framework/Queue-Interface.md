ARRAYDEQUE PRACTICE QUESTIONS

1.Write a Java program to store a sequence of integers in an ArrayDeque and display all the elements in the order they were inserted.

Test Case 1:
Input: 1 2 3 4 5
Output: 1 2 3 4 5

Test Case 2:
Input: 10 20 30
Output: 10 20 30

Test Case 3:
Input: 7 14 21 28
Output: 7 14 21 28

--------------------------------------------------------------------------------------------------------------

2.Write a Java program to add a string at the beginning and another string at the end of an ArrayDeque. Display the resulting deque.

Test Case 1:
Input: Start, End
Output: [Start, End]

Test Case 2:
Input: Front, Back
Output: [Front, Back]

Test Case 3:
Input: First, Last
Output: [First, Last]

--------------------------------------------------------------------------------------------------------------

3.Write a Java program to read a sequence of characters from the user and arrange them in an ArrayDeque by adding characters alternately at the front and the rear. Display the final deque.

Test Case 1:
Input: a b c d e
Output: [c, a, b, d, e]

Test Case 2:
Input: 1 2 3 4
Output: [3, 1, 2, 4]

Test Case 3:
Input: p q r
Output: [q, p, r]


--------------------------------------------------------------------------------------------------------------

4.Write a Java program to store integers in an ArrayDeque, remove one element from the beginning and one from the end, and display the removed elements. Then display the elements currently at the beginning and end of the deque.

Test Case 1:
Input: 10 20 30
Output:
Removed from front: 10
Removed from rear: 30
Front element: 20
Rear element: 20

Test Case 2:
Input: 5 15 25 35
Output:
Removed from front: 5
Removed from rear: 35
Front element: 15
Rear element: 25

Test Case 3:
Input: 100 200 300 400 500
Output:
Removed from front: 100
Removed from rear: 500
Front element: 200
Rear element: 400

--------------------------------------------------------------------------------------------------------------

5. Reverse a List Using ArrayDeque

Question:
Write a Java program that accepts a list of integers, uses an ArrayDeque to reverse the list, and displays the reversed sequence.

Test Case 1:
Input: 1 2 3 4 5
Output: 5 4 3 2 1

Test Case 2:
Input: 10 20 30
Output: 30 20 10

Test Case 3:
Input: 7 14 21 28
Output: 28 21 14 7

--------------------------------------------------------------------------------------------------------------

6. Simulate Browser Forward and Back Navigation

Write a Java program to simulate a web browser's back and forward navigation using two ArrayDeque<String> collections. The program should allow the user to visit web pages, move to the previously visited page, and move forward to a page they had left. Display the current page after each operation.

Test Case 1:

Input:
Visit google.com
Visit youtube.com
Visit github.com
Go Back
Go Back
Go Forward

Output:
Current Page: google.com
Current Page: youtube.com
Current Page: github.com
Current Page: youtube.com
Current Page: google.com
Current Page: youtube.com


Test Case 2:

Input:
Visit amazon.com
Visit flipkart.com
Visit wikipedia.org
Go Back
Visit linkedin.com
Go Forward

Output:
Current Page: amazon.com
Current Page: flipkart.com
Current Page: wikipedia.org
Current Page: flipkart.com
Current Page: linkedin.com
No forward page available
Current Page: linkedin.com


Test Case 3:

Input:
Visit java.com
Visit oracle.com
Go Back
Go Back
Go Forward
Go Forward
Go Forward

Output:
Current Page: java.com
Current Page: oracle.com
Current Page: java.com
No previous page available
Current Page: java.com
Current Page: oracle.com
No forward page available
Current Page: oracle.com

--------------------------------------------------------------------------------------------------------------

Priority queue Questions

1. Display Elements in Priority Order

Question:
Write a Java program to create a PriorityQueue of integers. Read integers from the user, insert them into the queue, and display the elements in priority order by repeatedly polling the queue.

Test Case 1:

Input:
10 20 15 5 30

Output:
5 10 15 20 30

Test Case 2:

Input:
40 10 30 20

Output:
10 20 30 40

Test Case 3:

Input:
8 3 8 1 5

Output:
1 3 5 8 8

--------------------------------------------------------------------------------------------------------------

2.Write a Java program to demonstrate how Java's PriorityQueue behaves like a min-heap by default. Read integers from the user, insert them            	into a PriorityQueue, and display the elements in ascending order by repeatedly removing them from the queue.

Test Case 1:

Input:
100 50 20 70 10

Output:
10 20 50 70 100


Test Case 2:

Input:
45 15 35 5 25

Output:
5 15 25 35 45


Test Case 3:

Input:
8 3 12 1 6

Output:
1 3 6 8 12

--------------------------------------------------------------------------------------------------------------

3.Write a Java program to create a PriorityQueue of strings. Read a set of strings from the user, insert them into the queue, and display the 	strings in the order in which they are removed from the queue.

Test Case 1:

Input:
banana apple orange grape

Output:
apple
banana
grape
orange


Test Case 2:

Input:
dog cat elephant tiger

Output:
cat
dog
elephant
tiger


Test Case 3:

Input:
mango cherry apple banana

Output:
apple
banana
cherry
mango

--------------------------------------------------------------------------------------------------------------
4.Write a Java program to create a PriorityQueue of integers. Read integers from the user and insert them into the queue. Use peek() to retrieve  	and display the head element without removing it. Display the queue's head element again to demonstrate that peek() does not remove the 	element.

Test Case 1:

Input:
30 10 20 5 15

Output:
Head element: 5
Head element after peek(): 5


Test Case 2:

Input:
40 25 60 10

Output:
Head element: 10
Head element after peek(): 10


Test Case 3:

Input:
8 3 12 1 6

Output:
Head element: 1
Head element after peek(): 1

--------------------------------------------------------------------------------------------------------------

5.Write a Java program to create a PriorityQueue of integers using a custom Comparator that gives the largest element the highest priority. Insert integers into the queue and display them in descending order without removing any elements from the original PriorityQueue.

Test Case 1:

Input:
10 40 20 50 30

Output:
50 40 30 20 10

Test Case 2:

Input:
5 15 25 35

Output:
35 25 15 5

Test Case 3:

Input:
100 10 75 50 25

Output:
100 75 50 25 10

--------------------------------------------------------------------------------------------------------------

11. Task and TaskDriver
Create a Task class with the fields name and priority. Write a Java program that uses a PriorityQueue<Task> with a custom Comparator to process the highest-priority task first, where a lower priority number represents a higher priority. Read task details from the user, insert the tasks into the queue, and process them in priority order.

Test Case 1:

Input:
5
Walking 5
Eating 3
Working 5
Meeting 1
Cardio 2

Output:
Meeting - Priority: 1
Cardio - Priority: 2
Eating - Priority: 3
Walking - Priority: 5
Working - Priority: 5


Test Case 2:

Input:
4
Shopping 4
Assignment 1
Cooking 3
Exercise 2

Output:
Assignment - Priority: 1
Exercise - Priority: 2
Cooking - Priority: 3
Shopping - Priority: 4


Test Case 3:
x
Input:
3
TaskA 3
TaskB 1
TaskC 2

Output:
TaskB - Priority: 1
TaskC - Priority: 2
TaskA - Priority: 3

--------------------------------------------------------------------------------------------------------------

