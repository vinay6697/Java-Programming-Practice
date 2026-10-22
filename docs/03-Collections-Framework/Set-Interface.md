Collection Framework in SET interface

====================================================================
1 : Write a Java program to find the common elements between two LinkedHashSet<Integer> objects.

Test Cases:

Test Case 1:
Input:
First LinkedHashSet:
[10, 20, 30, 40, 50]

Second LinkedHashSet:
[30, 40, 50, 60, 70]

Expected Output:
Common elements:
[30, 40, 50]

Test Case 2:
Input:
First LinkedHashSet:
[5, 10, 15, 20, 25]

Second LinkedHashSet:
[1, 2, 3, 4, 5]

Expected Output:
Common elements:
[5]

Test Case 3:
Input:
First LinkedHashSet:
[100, 200, 300, 400, 500]

Second LinkedHashSet:
[10, 20, 30, 40, 50]

Expected Output:
No common elements found

Note:
- Use LinkedHashSet<Integer> to store the elements.
- Create a method named findCommonElements() that accepts two LinkedHashSet<Integer> objects and returns a LinkedHashSet<Integer>.
- Preserve the insertion order of common elements according to the first set.
- Do not modify the original sets.
- Display an appropriate message when no common elements are found.

---------------------------------------------------------------------------------------------------------------------
2 : Preserve Order of Characters

Given a String with duplicate characters, write a Java program to remove duplicate characters using LinkedHashSet while preserving their original order.

Example:
Input:
banana

Expected Output:
Original String: banana
String after removing duplicates: ban

Test Cases:

Test Case 1:
Input:
banana

Expected Output:
Original String: banana
String after removing duplicates: ban

Test Case 2:
Input:
programming

Expected Output:
Original String: programming
String after removing duplicates: progamin

Test Case 3:
Input:
hello world

Expected Output:
Original String: hello world
String after removing duplicates: helo wrd

Note:
- Use LinkedHashSet<Character> to store unique characters.
- Preserve the original insertion order of characters.
- Treat uppercase and lowercase characters as different.
- Preserve spaces and other characters.
- Do not use HashSet.
- Implement the logic using a loop.

---------------------------------------------------------------------------------------------------------------------
3 : Reverse Order with LinkedHashSet

Write a Java program to store integer elements in a LinkedHashSet and print the elements in reverse insertion order without using List.

Test Cases:

Test Case 1:
Input:
LinkedHashSet:
[10, 20, 30, 40, 50]

Expected Output:
Elements in insertion order:
[10, 20, 30, 40, 50]

Elements in reverse insertion order:
[50, 40, 30, 20, 10]

Test Case 2:
Input:
LinkedHashSet:
[5, 15, 25, 35, 45]

Expected Output:
Elements in insertion order:
[5, 15, 25, 35, 45]

Elements in reverse insertion order:
[45, 35, 25, 15, 5]

Test Case 3:
Input:
LinkedHashSet:
[100, 200, 300, 200, 400]

Expected Output:
Elements in insertion order:
[100, 200, 300, 400]

Elements in reverse insertion order:
[400, 300, 200, 100]

Note:
- Use LinkedHashSet<Integer> to store the elements.
- Do not use List, ArrayList, or LinkedList.
- Do not insert the elements into another collection just to reverse their order.
- Preserve the original insertion order in the LinkedHashSet.
- Duplicate elements must be stored only once.
- Print the elements in reverse insertion order.

---------------------------------------------------------------------------------------------------------------------
 4 : Add and Display Unique Words

Write a Java program to read a sentence from the user and store each word in a LinkedHashSet<String>. Display the unique words in the order they appeared in the sentence.

Test Cases:

Test Case 1:
Input:
Java is easy and Java is powerful

Expected Output:
Original sentence:
Java is easy and Java is powerful

Unique words in insertion order:
[Java, is, easy, and, powerful]

Test Case 2:
Input:
apple banana apple orange banana mango

Expected Output:
Original sentence:
apple banana apple orange banana mango

Unique words in insertion order:
[apple, banana, orange, mango]

Test Case 3:
Input:
cat dog cat bird dog fish

Expected Output:
Original sentence:
cat dog cat bird dog fish

Unique words in insertion order:
[cat, dog, bird, fish]

Note:
- Use LinkedHashSet<String> to store the words.
- Read the complete sentence from the user.
- Split the sentence into individual words.
- Store each word in the LinkedHashSet.
- Duplicate words must appear only once.
- Preserve the original order of the first occurrence of each word.
- Treat uppercase and lowercase words as different.

---------------------------------------------------------------------------------------------------------------------

