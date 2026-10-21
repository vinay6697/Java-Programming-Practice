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

5 Add and Display Car Objects in a TreeSet

Write a Java program to store Car objects in a TreeSet<Car> and display the cars in ascending order of their cost. The Car class must implement Comparable<Car> to define the natural ordering based on cost.

Test Cases:

Test Case 1:
Input:
5
500000
200000
800000
300000
600000

Expected Output:
Cars sorted by cost:
[cost=200000, cost=300000, cost=500000, cost=600000, cost=800000]

Test Case 2:
Input:
4
300000
100000
300000
200000

Expected Output:
Cars sorted by cost:
[cost=100000, cost=200000, cost=300000]

Test Case 3:
Input:
3
500000
500000
500000

Expected Output:
Cars sorted by cost:
[cost=500000]

Test Case 4:
Input:
5
900000
100000
700000
200000
400000

Expected Output:
Cars sorted by cost:
[cost=100000, cost=200000, cost=400000, cost=700000, cost=900000]


---------------------------------------------------------------------------------------------------------------------
6 Add and Display Student Objects Sorted by Name

Write a Java program to store Student objects in a TreeSet<Student> and display the students in ascending alphabetical order of their names. The Student class must implement Comparable<Student> to define the natural ordering based on the name.

Test Cases:

Test Case 1:
Input:
5
101
Vinay
102
Sanjay
103
Anu
104
Rahul
105
Kiran

Expected Output:
Students sorted by name:
[103 Anu, 105 Kiran, 102 Sanjay, 101 Vinay, 104 Rahul]

Test Case 2:
Input:
4
201
Ravi
202
Amit
203
Priya
204
Neha

Expected Output:
Students sorted by name:
[202 Amit, 204 Neha, 203 Priya, 201 Ravi]

Test Case 3:
Input:
4
301
Rahul
302
Amit
303
Rahul
304
Sneha

Expected Output:
Students sorted by name:
[302 Amit, 301 Rahul, 304 Sneha]

Test Case 4:
Input:
5
401
Zoya
402
Arun
403
Meena
404
Bharath
405
Deepak

Expected Output:
Students sorted by name:
[402 Arun, 404 Bharath, 405 Deepak, 403 Meena, 401 Zoya]

---------------------------------------------------------------------------------------------------------------------
7.  Write a Java program to store Employee objects in a TreeSet<Employee> and display the employees in ascending order of their salary. The Employee class must implement Comparable<Employee> to define the natural ordering based on salary.

Each Employee object contains the following attributes:

int id

String name

double salary

Note: If two employees have the same salary, the TreeSet should treat them as duplicates and store only one employee.

Test Cases:

Test Case 1:
Input:
5
101 Vinay 50000
102 Rahul 30000
103 Sneha 70000
104 Priya 20000
105 Arun 40000

Expected Output:
Employees sorted by salary:
[ Employee{id=104, name='Priya', salary=20000.0}, 
  Employee{id=102, name='Rahul', salary=30000.0}, 
  Employee{id=105, name='Arun', salary=40000.0}, 
  Employee{id=101, name='Vinay', salary=50000.0}, 
  Employee{id=103, name='Sneha', salary=70000.0}
]


Test Case 2:
Input:
4
101 Vinay 30000
102 Rahul 10000
103 Sneha 30000
104 Priya 20000

Expected Output:
Employees sorted by salary:
[ Employee{id=102, name='Rahul', salary=10000.0},
  Employee{id=104, name='Priya', salary=20000.0}, 
  Employee{id=101, name='Vinay', salary=30000.0}
]


Test Case 3:
Input:
3
101 Vinay 50000
102 Rahul 50000
103 Sneha 50000

Expected Output:
Employees sorted by salary:
[Employee{id=101, name='Vinay', salary=50000.0}]


Test Case 4:
Input:
5
101 Vinay 90000
102 Rahul 10000
103 Sneha 70000
104 Priya 20000
105 Arun 40000

Expected Output:
Employees sorted by salary:
[ Employee{id=102, name='Rahul', salary=10000.0},  
  Employee{id=104, name='Priya', salary=20000.0}, 
  Employee{id=105, name='Arun', salary=40000.0}, 
  Employee{id=103, name='Sneha', salary=70000.0}, 
  Employee{id=101, name='Vinay', salary=90000.0}
]

---------------------------------------------------------------------------------------------------------------------
8. Question: Sort Student Objects Using Comparator

Write a Java program to store Student objects in a TreeSet<Student> and allow the user to choose the sorting criteria at runtime.

The Student class contains the following attributes:
- int age
- String name

The Student class must not implement Comparable. Instead, create separate Comparator implementations to define the sorting logic.

Requirements:
1. Read the number of students from the user.
2. Read the age and name of each student.
3. Display a menu asking the user to choose the sorting criteria:
   1. Sort by Age in Ascending Order
   2. Sort by Name in Alphabetical Order
4. Use the selected Comparator to create the TreeSet<Student>.
5. Display the students in the selected sorting order.

Test Cases:

Test Case 1: Sort by Age

Input:
5
21 Vinay
19 Rahul
23 Sneha
20 Priya
22 Arun
1

Expected Output:
Students sorted by age:
19 Rahul
20 Priya
21 Vinay
22 Arun
23 Sneha


Test Case 2: Sort by Name

Input:
5
21 Vinay
19 Rahul
23 Sneha
20 Priya
22 Arun
2

Expected Output:
Students sorted by name:
22 Arun
20 Priya
19 Rahul
23 Sneha
21 Vinay


Test Case 3: Students with the Same Age

Input:
4
20 Vinay
18 Rahul
20 Sneha
19 Priya
1

Expected Output:
Students sorted by age:
18 Rahul
19 Priya
20 Sneha
20 Vinay


Test Case 4: Students with Names in Alphabetical Order Already

Input:
3
18 Arun
20 Priya
22 Vinay
2

Expected Output:
Students sorted by name:
18 Arun
20 Priya
22 Vinay


Test Case 5: Invalid Choice

Input:
2
20 Vinay
21 Rahul
5

Expected Output:
Invalid sorting choice!
---------------------------------------------------------------------------------------------------------------------
9. Question: Sort Employee Objects Using Comparator

Write a Java program to store Employee objects in a TreeSet<Employee> and allow the user to choose the sorting criteria at runtime.

The Employee class contains the following attributes:
- int id
- String name
- Double salary

The Employee class must not implement Comparable<Employee>. Instead, create separate Comparator<Employee> implementations to define the sorting logic.

Requirements:
1. Read the number of employees from the user.
2. Read the ID, name, and salary of each employee.
3. Display a menu asking the user to choose the sorting criteria:
   1. Sort by Name in Alphabetical Order
   2. Sort by Salary in Ascending Order
4. Use the selected Comparator to create the TreeSet<Employee>.
5. Display the employees in the selected sorting order.

Test Cases:

Test Case 1: Sort by Name

Input:
5
101 Vinay 50000
102 Rahul 30000
103 Sneha 70000
104 Priya 20000
105 Arun 40000
1

Expected Output:
Employees sorted by name:
105 Arun 40000.0
102 Rahul 30000.0
104 Priya 20000.0
103 Sneha 70000.0
101 Vinay 50000.0


Test Case 2: Sort by Salary

Input:
5
101 Vinay 50000
102 Rahul 30000
103 Sneha 70000
104 Priya 20000
105 Arun 40000
2

Expected Output:
Employees sorted by salary:
104 Priya 20000.0
102 Rahul 30000.0
105 Arun 40000.0
101 Vinay 50000.0
103 Sneha 70000.0


Test Case 3: Two Employees with the Same Salary

Input:
4
101 Vinay 30000
102 Rahul 20000
103 Sneha 30000
104 Priya 40000
2

Expected Output:
Employees sorted by salary:
102 Rahul 20000.0
101 Vinay 30000.0
103 Sneha 30000.0
104 Priya 40000.0


Test Case 4: Two Employees with the Same Name

Input:
4
101 Rahul 50000
102 Vinay 30000
103 Rahul 40000
104 Arun 20000
1

Expected Output:
Employees sorted by name:
104 Arun 20000.0
101 Rahul 50000.0
103 Rahul 40000.0
102 Vinay 30000.0


Test Case 5: Invalid Sorting Choice

Input:
2
101 Vinay 50000
102 Rahul 30000
5

Expected Output:
Invalid sorting choice!

---------------------------------------------------------------------------------------------------------------------
Assignment Questions
1.Sort Book Objects Using Comparator with Multiple Sorting Criteria

Write a Java program to store Book objects in a TreeSet<Book> and allow the user to choose the sorting criteria at runtime.

The Book class contains the following attributes:

- String title
- int year
- Double rating

The Book class must not implement Comparable<Book>. Instead, create separate Comparator\<Book> implementations to define the sorting logic.

Sorting Rules:

- First, sort by year in ascending order.
- If the year is the same, sort by rating in descending order.
- If both year and rating are the same, sort by title in alphabetical order.

Sorting Rules:
1. Sort by year in ascending order.
2. If the year is the same, sort by rating in descending order.
3. If both year and rating are the same, sort by title in alphabetical order.

Test Case 1: Different Years

Input:
5
Java 		2020 	4.5
Spring 		2022 	4.8
Python 		2018 	4.7
Hibernate 	2019 	4.2
SQL 		2021 	4.3

Expected Output:
Books sorted by year, rating, and title:
Python    		2018    4.7
Hibernate       2019    4.2
Java    		2020    4.5
SQL    			2021    4.3
Spring    		2022    4.8


Test Case 2: Same Year, Different Ratings

Input:
4
Java 	  2020 	4.5
Spring 	  2020 	4.8
Python 	  2020 	4.2
Hibernate 2020 	4.9

Expected Output:
Books sorted by year, rating, and title:
Hibernate    	2020    4.9
Spring    		2020    4.8
Java    		2020    4.5
Python   		2020    4.2


Test Case 3: Same Year and Same Rating

Input:
4
Java 	2020 4.5
Spring 	2020 4.5
Python 	2020 4.5
C++ 	2020 4.5

Expected Output:
Books sorted by year, rating, and title:
C++    	   2020    4.5
Java       2020    4.5
Python     2020    4.5
Spring     2020    4.5


Test Case 4: Same Year, Different Ratings, and Duplicate Titles

Input:
5
Java 	2020 4.5
Java 	2020 4.8
Python 	2020 4.2
Java 	2020 4.9
C++ 	2020 4.5

Expected Output:
Books sorted by year, rating, and title:
Java    	2020    4.9
Java    	2020    4.8
C++    	    2020    4.5
Java    	2020    4.5
Python      2020    4.2


Test Case 5: Different Years with Equal Ratings

Input:
4
Java 	  2020 4.5
Spring 	  2018 4.5
Python 	  2020 4.5
Hibernate 2018 4.5

Expected Output:
Books sorted by year, rating, and title:
Hibernate   	2018    4.5
Spring    		2018    4.5
Java    		2020    4.5
Python    		2020    4.5


Test Case 6: All Books Have the Same Year, Rating, and Title

Input:
3
Java 2020 4.5
Java 2020 4.5
Java 2020 4.5

Expected Output:
Books sorted by year, rating, and title:
Java    2020    4.5

Note:
TreeSet considers books duplicates when the Comparator returns 0. Therefore, books with the same year, rating, and title are stored only once.
---------------------------------------------------------------------------------------------------------------------
2. Question: Sort Event Objects Using Comparator

Write a Java program to store Event objects in a TreeSet<Event> and sort the events in ascending order of their duration. If two events have the same duration, sort them alphabetically by their title.

The Event class contains the following attributes:
- String title
- int startTime
- int endTime

The duration of an event is calculated as endTime - startTime. Use Comparator<Event> to define the sorting logic.

Test Case 1: Different Durations

Input:
5
Java 	9 12
Python  10 15
Meeting 14 16
Lunch   12 13
Workshop 9 17

Expected Output:
Events sorted by duration:
Lunch        1
Meeting      2
Java         3
Python       5
Workshop     8


Test Case 2: Same Duration

Input:
4
Java 	9  12
Python 	10 13
Meeting 14 17
Workshop 9 12

Expected Output:
Events sorted by duration:
Java         3
Meeting      3
Python       3
Workshop     3


Test Case 3: Same Duration with Different Titles

Input:
5
Zebra 	9 	12
Apple 	10 	13
Mango 	14 	17
Banana 	8 	11
Orange 	15 	18

Expected Output:
Events sorted by duration:
Apple        3
Banana       3
Mango        3
Orange       3
Zebra        3


Test Case 4: Different Durations and Repeated Titles

Input:
4
Meeting 	9  12
Meeting 	10 14
Workshop 	8  12
Training 	9  11

Expected Output:
Events sorted by duration:
Training     2
Meeting      3
Meeting      4
Workshop     4


Test Case 5: All Events Have the Same Duration and Title

Input:
3
Meeting 9  12
Meeting 14 17
Meeting 18 21

Expected Output:
Events sorted by duration:
Meeting      3


Test Case 6: Events with Different Start Times and End Times

Input:
5
Coding 8 11
Reading 10 12
Gaming 14 18
Exercise 7 8
Cooking 18 21

Expected Output:
Events sorted by duration:
Exercise     1
Reading      2
Coding       3
Cooking      3
Gaming       4


Note:
TreeSet treats two Event objects as duplicates when the Comparator returns 0. Therefore, events with the same duration and title will be stored only once, even if their start times and end times are different.

---------------------------------------------------------------------------------------------------------------------

