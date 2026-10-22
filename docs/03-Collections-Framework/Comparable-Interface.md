1 Add and Display Car Objects in a TreeSet

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
2 Add and Display Student Objects Sorted by Name

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
3.  Write a Java program to store Employee objects in a TreeSet<Employee> and display the employees in ascending order of their salary. The Employee class must implement Comparable<Employee> to define the natural ordering based on salary.

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
4. Question: Sort Book Objects Using Comparable

Write a Java program to store Book objects in a TreeSet<Book> and sort the books using the Comparable<Book> interface.

The Book class contains the following attributes:

String title
String author
int pages

Sorting Rules:

1. Sort books by the number of pages in ascending order.

Test Case 1: Different Page Counts

Input:
4
250 Java_Basics James
180 Python_Guide David
320 C_Programming Dennis
400 Advanced_Java James

Expected Output:
Books sorted by pages and title:
180 Python_Guide David
250 Java_Basics James
320 C_Programming Dennis
400 Advanced_Java James


Test Case 2: Same Page Count, Different Titles

Input:
4
200 Java_Basics James
200 Python_Guide David
200 C_Programming Dennis
300 Spring_Boot Martin

Expected Output:
Books sorted by pages and title:
200 C_Programming Dennis
200 Java_Basics James
200 Python_Guide David
300 Spring_Boot Martin


Test Case 3: Mixed Page Counts with Duplicate Page Counts

Input:
5
250 Java_Basics James
180 Python_Guide David
250 Advanced_Java Martin
320 C_Programming Dennis
180 Spring_Boot Martin

Expected Output:
Books sorted by pages and title:
180 Python_Guide David
180 Spring_Boot Martin
250 Advanced_Java Martin
250 Java_Basics James
320 C_Programming Dennis


Test Case 4: Same Author and Same Page Count

Input:
4
250 Java_Basics James
250 Python_Guide James
250 C_Programming James
180 Database_Basics David

Expected Output:
Books sorted by pages and title:
180 Database_Basics David
250 C_Programming James
250 Java_Basics James
250 Python_Guide James


Test Case 5: Duplicate Titles and Page Counts

Input:
4
250 Java_Basics James
250 Java_Basics David
180 Python_Guide Martin
180 Python_Guide David

Expected Output:
Books sorted by pages and title:
180 Python_Guide Martin
250 Java_Basics James

---------------------------------------------------------------------------------------------------------------------
Assignment 
---------------------------------------------------------------------------------------------------------------------
1 : Sort Book Objects Using Comparable

Write a Java program to store Book objects in a TreeSet<Book> and sort them using the Comparable<Book> interface.

The Book class contains the following attributes:

String title
String author
int pages

Constructor:
Book(int pages, String title, String author)

Test Case 1: Different Authors

Input:
4
250 Java_Basics James
180 Python_Guide David
320 C_Programming Dennis
400 Advanced_Java Martin

Expected Output:
Books sorted by author, pages, and title:
180 Python_Guide David
320 C_Programming Dennis
250 Java_Basics James
400 Advanced_Java Martin


Test Case 2: Same Author, Different Page Counts

Input:
4
400 Advanced_Java James
250 Java_Basics James
300 Spring_Boot James
200 Hibernate_Guide David

Expected Output:
Books sorted by author, pages, and title:
200 Hibernate_Guide David
250 Java_Basics James
300 Spring_Boot James
400 Advanced_Java James


Test Case 3: Same Author and Page Count, Different Titles

Input:
4
250 Java_Basics James
250 Python_Guide James
250 C_Programming James
180 Database_Basics David

Expected Output:
Books sorted by author, pages, and title:
180 Database_Basics David
250 C_Programming James
250 Java_Basics James
250 Python_Guide James


Test Case 4: Multiple Authors with Repeated Page Counts

Input:
5
250 Java_Basics James
180 Python_Guide David
250 Advanced_Java James
320 C_Programming Dennis
180 Spring_Boot David

Expected Output:
Books sorted by author, pages, and title:
180 Python_Guide David
180 Spring_Boot David
320 C_Programming Dennis
250 Advanced_Java James
250 Java_Basics James


Test Case 5: Duplicate Books

Input:
4
250 Java_Basics James
250 Java_Basics James
180 Python_Guide David
180 Python_Guide David

Expected Output:
Books sorted by author, pages, and title:
180 Python_Guide David
250 Java_Basics James


Note:
The Book class must implement Comparable<Book> and override compareTo(Book b). TreeSet uses the compareTo() return value to determine the sorting order and whether two books are duplicates. If author, pages, and title are all equal, compareTo() returns 0, so only one copy is stored.

---------------------------------------------------------------------------------------------------------------------

2. Question: Sort Bottle Objects Using Comparable

Write a Java program to store Bottle objects in a TreeSet<Bottle> and sort them using the Comparable<Bottle> interface.

The Bottle class contains the following attributes:

String brand
int capacity

Constructor:
Bottle(String brand, int capacity)

Sorting Rules:

1. Sort bottles by brand name in ascending alphabetical order.
2. If two bottles have the same brand, sort them by capacity in ascending order.

Test Case 1: Different Brands

Input:
4
Milton 1000
Cello 750
Aquafina 500
Bisleri 1000

Expected Output:
Bottles sorted by brand and capacity:
Aquafina 500
Bisleri 1000
Cello 750
Milton 1000


Test Case 2: Same Brand, Different Capacities

Input:
4
Milton 1000
Milton 500
Milton 750
Milton 1500

Expected Output:
Bottles sorted by brand and capacity:
Milton 500
Milton 750
Milton 1000
Milton 1500


Test Case 3: Multiple Brands with Different Capacities

Input:
5
Cello 1000
Milton 500
Cello 500
Milton 1000
Bisleri 750

Expected Output:
Bottles sorted by brand and capacity:
Bisleri 750
Cello 500
Cello 1000
Milton 500
Milton 1000


Test Case 4: Same Brand and Same Capacity

Input:
4
Milton 1000
Milton 1000
Cello 750
Cello 750

Expected Output:
Bottles sorted by brand and capacity:
Cello 750
Milton 1000


Test Case 5: Same Capacity, Different Brands

Input:
5
Milton 750
Cello 750
Bisleri 750
Aquafina 750
Milton 500

Expected Output:
Bottles sorted by brand and capacity:
Aquafina 750
Bisleri 750
Cello 750
Milton 500
Milton 750

---------------------------------------------------------------------------------------------------------------------

3. Sort Movie Objects Using Comparable

Write a Java program to store Movie objects in a TreeSet<Movie> and sort them using the Comparable<Movie> interface.

The Movie class contains the following attributes:

String name
int year
double rating

Constructor:
Movie(String name, int year, double rating)

Sorting Rules:

1. Sort movies by release year in ascending order.
2. If two movies have the same release year, sort them by movie name in ascending alphabetical order.
3. The rating should be displayed but must not affect the sorting order.

Test Case 1: Different Release Years

Input:
4
Inception 2010 8.8
Titanic 1997 7.9
Avatar 2009 7.9
Interstellar 2014 8.7

Expected Output:
Movies sorted by year and name:
1997 Titanic    7.9
2009 Avatar     7.9
2010 Inception  8.8
2014 Interstellar    8.7


Test Case 2: Same Year, Different Movie Names

Input:
4
Zootopia 2016 8.0
Deadpool 2016 8.0
Arrival 2016 7.9
LaLaLand 2016 8.0

Expected Output:
Movies sorted by year and name:
2016 Arrival    7.9
2016 Deadpool   8.0
2016 LaLaLand   8.0
2016 Zootopia   8.0


Test Case 3: Mixed Years and Names

Input:
5
Joker 2019 8.4
Dune 2021 8.0
Avengers 2019 8.4
Batman 2022 7.8
Dune 2021 8.0

Expected Output:
Movies sorted by year and name:
2019 Avengers   8.4
2019 Joker      8.4
2021 Dune       8.0
2022 Batman     7.8


Test Case 4: Same Year and Same Movie Name, Different Ratings

Input:
4
Avatar 2009 7.9
Avatar 2009 8.2
Titanic 1997 7.9
Inception 2010 8.8

Expected Output:
Movies sorted by year and name:
1997 Titanic    7.9
2009 Avatar     7.9
2010 Inception  8.8


Test Case 5: Same Rating, Different Years and Names

Input:
5
Titanic 1997 8.0
Avatar 2009 8.0
Inception 2010 8.0
Batman 2022 8.0
Joker 2019 8.0

Expected Output:
Movies sorted by year and name:
1997 Titanic    8.0
2009 Avatar     8.0
2010 Inception  8.0
2019 Joker      8.0
2022 Batman     8.0


Note:
The Movie class must implement Comparable<Movie> and override compareTo(Movie m). TreeSet uses the comparison result to determine sorting order and uniqueness. If two movies have the same year and name, compareTo() returns 0, so only one will be stored, even if their ratings differ. The rating does not affect sorting or uniqueness.

---------------------------------------------------------------------------------------------------------------------
4 . Sort Pen Objects Using Comparable

Write a Java program to store Pen objects in a TreeSet<Pen> and sort them using the Comparable<Pen> interface.

The Pen class contains the following attributes:

String brand
double price

Constructor:
Pen(String brand, double price)

Sorting Rules:

1. Sort pens by price in ascending order.
2. If two pens have the same price, sort them by brand name in ascending alphabetical order.

Test Case 1: Different Prices

Input:
4
Parker 50.0
Reynolds 25.0
Cello 15.0
Pilot 40.0

Expected Output:
Pens sorted by price and brand:
Cello 15.0
Reynolds 25.0
Pilot 40.0
Parker 50.0


Test Case 2: Same Price, Different Brands

Input:
4
Parker 30.0
Cello 30.0
Pilot 30.0
Reynolds 30.0

Expected Output:
Pens sorted by price and brand:
Cello 30.0
Parker 30.0
Pilot 30.0
Reynolds 30.0


Test Case 3: Mixed Prices and Repeated Prices

Input:
5
Parker 50.0
Cello 20.0
Pilot 50.0
Reynolds 20.0
Flair 35.0

Expected Output:
Pens sorted by price and brand:
Cello 20.0
Reynolds 20.0
Flair 35.0
Parker 50.0
Pilot 50.0


Test Case 4: Same Brand and Same Price

Input:
4
Parker 50.0
Parker 50.0
Cello 20.0
Cello 20.0

Expected Output:
Pens sorted by price and brand:
Cello 20.0
Parker 50.0


Test Case 5: Same Brand, Different Prices

Input:
5
Parker 40.0
Parker 20.0
Parker 60.0
Cello 30.0
Cello 10.0

Expected Output:
Pens sorted by price and brand:
Cello 10.0
Parker 20.0
Cello 30.0
Parker 40.0
Parker 60.0


Note:
The Pen class must implement Comparable<Pen> and override compareTo(Pen p). TreeSet uses compareTo() to determine sorting order and uniqueness. If two pens have the same price and brand, compareTo() returns 0, so only one pen will be stored. If the prices are equal but the brands differ, both pens will be stored in alphabetical order of their brands.

---------------------------------------------------------------------------------------------------------------------
5. Sort Student Objects Using Comparable

Write a Java program to store Student objects in a TreeSet<Student> and sort them using the Comparable<Student> interface.

The Student class contains the following attributes:

String name
int rollNo
int grade

Constructor:
Student(int rollNo, String name, int grade)

Sorting Rules:

1. Sort students by roll number in ascending order.
2. The name and grade should be displayed but must not affect the sorting order.

Test Case 1: Different Roll Numbers

Input:
4
103 Rahul 85
101 Amit 90
104 Priya 78
102 Sneha 88

Expected Output:
Students sorted by roll number:
101 Amit 90
102 Sneha 88
103 Rahul 85
104 Priya 78


Test Case 2: Roll Numbers in Descending Input Order

Input:
5
105 Kiran 75
104 Priya 82
103 Rahul 85
102 Sneha 88
101 Amit 90

Expected Output:
Students sorted by roll number:
101 Amit 90
102 Sneha 88
103 Rahul 85
104 Priya 82
105 Kiran 75


Test Case 3: Same Grade, Different Roll Numbers

Input:
4
104 Priya 85
101 Amit 85
103 Rahul 85
102 Sneha 85

Expected Output:
Students sorted by roll number:
101 Amit 85
102 Sneha 85
103 Rahul 85
104 Priya 85


Test Case 4: Same Roll Number, Different Names and Grades

Input:
4
102 Sneha 88
101 Amit 90
102 Rahul 75
103 Priya 82

Expected Output:
Students sorted by roll number:
101 Amit 90
102 Sneha 88
103 Priya 82


Test Case 5: All Students Have the Same Roll Number

Input:
3
101 Amit 90
101 Rahul 75
101 Priya 82

Expected Output:
Students sorted by roll number:
101 Amit 90
