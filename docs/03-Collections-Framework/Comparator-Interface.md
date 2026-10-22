1. Question: Sort Student Objects Using Comparator

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
2. Question: Sort Employee Objects Using Comparator

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
====================================================================
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
3. Question: Sort Product Objects Using Comparator

Write a Java program to store Product objects in a TreeSet<Product> and sort the products based on their discount and price using a custom Comparator<Product>.

The Product class contains the following attributes:

int id
String name
int price
Double discount

Sorting Rules:
1. Sort products by discount in descending order.
2. If two products have the same discount, sort them by price in ascending order.

Test Case 1: Different Discounts

Input:
5
101 Mobile 20000 10.0
102 Laptop 60000 15.0
103 Headphones 2000 5.0
104 Tablet 15000 20.0
105 Smartwatch 5000 12.0

Expected Output:
Products sorted by discount and price:
104 Tablet        15000    20.0
102 Laptop        60000    15.0
105 Smartwatch    5000     12.0
101 Mobile        20000    10.0
103 Headphones    2000     5.0


Test Case 2: Same Discount, Different Prices

Input:
4
101 Mobile 20000 10.0
102 Headphones 2000 10.0
103 Keyboard 1500 10.0
104 Monitor 12000 10.0

Expected Output:
Products sorted by discount and price:
103 Keyboard      1500     10.0
102 Headphones    2000     10.0
104 Monitor       12000    10.0
101 Mobile        20000    10.0


Test Case 3: Same Discount and Same Price

Input:
4
101 Mobile 20000 10.0
102 Laptop 20000 10.0
103 Tablet 15000 15.0
104 Monitor 15000 15.0

Expected Output:
Products sorted by discount and price:
103 Tablet        15000    15.0
104 Monitor       15000    15.0
101 Mobile        20000    10.0


Test Case 4: Different Discounts and Prices

Input:
5
101 Phone 30000 15.0
102 Camera 25000 20.0
103 Speaker 5000 15.0
104 Laptop 70000 25.0
105 Mouse 1000 20.0

Expected Output:
Products sorted by discount and price:
104 Laptop        70000    25.0
105 Mouse         1000     20.0
102 Camera        25000    20.0
103 Speaker       5000     15.0
101 Phone         30000    15.0


Test Case 5: All Products Have the Same Discount

Input:
3
101 Mobile 10000 5.0
102 Laptop 50000 5.0
103 Mouse 1000 5.0

Expected Output:
Products sorted by discount and price:
103 Mouse         1000     5.0
101 Mobile        10000    5.0
102 Laptop        50000    5.0


Test Case 6: All Products Have the Same Discount and Price

Input:
3
101 Mobile 10000 10.0
102 Laptop 10000 10.0
103 Tablet 10000 10.0

Expected Output:
Products sorted by discount and price:
101 Mobile       10000    10.0


Note:
TreeSet considers two products duplicates when the Comparator returns 0. Therefore, if two products have the same discount and price, only one will be stored, even if their IDs and names are different.

---------------------------------------------------------------------------------------------------------------------
4. Question: Sort Task Objects Using Comparator

Write a Java program to store Task objects in a TreeSet<Task> and sort the tasks using a custom Comparator<Task>.

The Task class contains the following attributes:

String name
int deadline
int priority

Sorting Rules:
1. Sort tasks by deadline in ascending order.
2. If two tasks have the same deadline, sort them by priority in descending order.

Test Case 1: Different Deadlines

Input:
5
3 2 Assignment
1 3 Project
5 1 Testing
2 4 Development
4 2 Documentation

Expected Output:
Tasks sorted by deadline and priority:
1 3 Project
2 4 Development
3 2 Assignment
4 2 Documentation
5 1 Testing


Test Case 2: Same Deadline, Different Priorities

Input:
4
2 1 Assignment
2 5 Project
2 3 Testing
2 4 Development

Expected Output:
Tasks sorted by deadline and priority:
2 5 Project
2 4 Development
2 3 Testing
2 1 Assignment


Test Case 3: Different Deadlines and Priorities

Input:
5
4 2 Coding
1 1 Planning
3 5 Testing
1 4 Design
3 2 Deployment

Expected Output:
Tasks sorted by deadline and priority:
1 4 Design
1 1 Planning
3 5 Testing
3 2 Deployment
4 2 Coding


Test Case 4: Same Deadline and Same Priority

Input:
4
2 3 Assignment
2 3 Project
2 3 Testing
1 2 Planning

Expected Output:
Tasks sorted by deadline and priority:
1 2 Planning
2 3 Assignment


Test Case 5: All Tasks Have the Same Deadline

Input:
5
3 2 Coding
3 5 Testing
3 1 Deployment
3 4 Design
3 3 Documentation

Expected Output:
Tasks sorted by deadline and priority:
3 5 Testing
3 4 Design
3 3 Documentation
3 2 Coding
3 1 Deployment


Test Case 6: All Tasks Have the Same Deadline and Priority

Input:
3
2 4 Assignment
2 4 Project
2 4 Testing

Expected Output:
Tasks sorted by deadline and priority:
2 4 Assignment


Note:
TreeSet considers two Task objects duplicates when the Comparator returns 0. Therefore, if two tasks have the same deadline and priority, only one will be stored, even if their names are different.

---------------------------------------------------------------------------------------------------------------------
