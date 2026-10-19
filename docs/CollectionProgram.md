1. Create a test class and do the following:

(a) Create a non-generic ArrayList with three Student objects and display the names of all the students.

(b) Create a generic ArrayList of Student type with three Student objects and display the names and ages of all the objects.

Student

| id--> int

| name-> String

| age-> int

---------------------------------------------------------------------------------------------------------------------
2. Design a class for the following diagram:

Employee
    id     -> int
    name   -> String
    salary -> double

Create a test class and do the following:

(a) Create a non-generic ArrayList with three Employee objects and display all the employee names in reverse order using ListIterator.

(b) Create a generic ArrayList of Employee type with three Employee objects and display the name and salary of all the objects.

---------------------------------------------------------------------------------------------------------------------
3. Design a class for the following diagram:

Items
    itemId  -> int
    name    -> String
    cost    -> double
    rating  -> double


Create a test class and do the following:

(a) Create a non-generic ArrayList with  Item objects and display all the items whose cost is even (using get() and index).

(b) Create a generic ArrayList with three Item objects and display all the items whose rating is more than 3.5 (using enhanced for loop).


---------------------------------------------------------------------------------------------------------------------
4. Design a class for the following diagram:

Students
    name
    class
    marks

    getName()
    setName()
    displayMarks()


Create a Driver class and do the following:

(a) Create a non-generic ArrayList, add 5 Student objects, and display all the Student objects whose marks are above 90.

(b)   Create a generic ArrayList, add 5 Student objects, and display all the Student objects whose name is short (less than 5 characters).

---------------------------------------------------------------------------------------------------------------------

5 Search a Student Object Using contains() and indexOf()

Design a Student class with the following properties:

Student
    id   -> int
    name -> String
    age  -> int

Create a parameterized constructor, getters, setters, and override the equals() method to compare two Student objects based on their id, name, and age.

Create a test class and do the following:

(a) Create an ArrayList of Student type and add five Student objects. Create a keyElement as a Student object and search for it using the contains() method. Display whether the student object exists in the list or not.

(b) Create an ArrayList of Student type and add five Student objects. Create a keyElement as a Student object and search for it using the indexOf() method. Display the index of the student object if it exists; otherwise, display an appropriate message.

Note:
1. The keyElement must be a Student object, not an integer or String.
2. The keyElement may be a different object from the Student object already present in the list, but its field values can match.
3. Use the overridden equals() method to compare Student objects.
4. Observe how many times equals() is called during each search.
---------------------------------------------------------------------------------------------------------------------
6 Design a class for the following diagram:

Pigeon
    bird  -> String
    age   -> int


Create a Driver class and do the following:

(a) Create an ArrayList object and add 5 Pigeon objects into the ArrayList.

(b) Get a Pigeon object from the user and check whether it is present in the ArrayList. If it is present, print the index position of the Pigeon object.

---------------------------------------------------------------------------------------------------------------------
7 Search a Student Object in an ArrayList Using ID

Question:

Design a Student class with the following properties:

Student
    id   -> int
    name -> String
    age  -> int

Create a parameterized constructor, getters, setters, and override the toString() method to display the student details.

Create a Driver class and do the following:

(a) Create a generic ArrayList of Student type and add five Student objects to the ArrayList.

(b) Accept a student ID from the user using the Scanner class.

(c) Search for the Student object in the ArrayList whose ID matches the ID entered by the user.

(d) If the student is found, display the complete details of the student. Otherwise, display an appropriate message indicating that the student does not exist.

Example Input:

Enter student ID: 333

Expected Output:

Student found:
ID: 333
Name: Martin
Age: 23

Test Cases:

1. Input: 333
   Expected Output: Display the details of the student whose ID is 333.

2. Input: 111
   Expected Output: Display the details of the student whose ID is 111.

3. Input: 999
   Expected Output: Student not found.

4. Input: 555
   Expected Output: Display the details of the student whose ID is 555.

Requirement:

Use an ArrayList and the ID entered by the user to search for the matching Student object. Do not use a Map or database.

---------------------------------------------------------------------------------------------------------------------
8. Design a class for the following diagram:

Employee
    id   -> int
    name -> String
    age  -> int

Create an ArrayList containing 5 Employee objects with the above-mentioned attributes, with IDs being the unique attributes (i.e., 1, 2, 3, 4, 5).

By using the ID as a key element, obtain the ID from the user and search for the employee in the list.

If present, print the object details (i.e., ID, name, age); otherwise, print a suitable message.

---------------------------------------------------------------------------------------------------------------------
9. Question: Bottle ArrayList

Design a class named Bottle with the following attributes:
- brand
- size
- color

Create a Test class that contains an LinkedList of 5 Bottle objects.

Design a method that accepts an LinkedList of Bottle objects and a key index from the user. The method should print the details of the Bottle object present at the index entered by the user.

Requirements:
1. Create a Bottle class with brand, size, and color attributes.
2. Create an LinkedList containing 5 Bottle objects.
3. Accept a key index from the user.
4. Pass the LinkedList and the key index to a method.
5. Display the details of the Bottle object present at the specified index.
6. If the index is invalid, display an appropriate error message.

Test Cases:

Test Case 1:
Input:
Key Index: 0

Expected Output:
Display the details of the first Bottle object in the ArrayList.

Test Case 2:
Input:
Key Index: 2

Expected Output:
Display the details of the third Bottle object in the ArrayList.

Test Case 3:
Input:
Key Index: 4

Expected Output:
Display the details of the fifth Bottle object in the ArrayList.

Test Case 4:
Input:
Key Index: 5

Expected Output:
Invalid index!

Test Case 5:
Input:
Key Index: -1

Expected Output:
Invalid index!

---------------------------------------------------------------------------------------------------------------------
10. Question: Remove an Employee Object from an ArrayList

Design an Employee class with the following attributes:
- id
- name
- salary

Create a Test class that contains an ArrayList of 5 Employee objects.

Write a program to remove an Employee object from the ArrayList based on an Employee object provided by the user.

Requirements:
1. Create an Employee class with id, name, and salary attributes.
2. Create an ArrayList containing 5 Employee objects.
3. Display all Employee objects before removal.
4. Accept the Employee details to be removed from the user.
5. Create an Employee object using the details entered by the user.
6. Remove the matching Employee object from the ArrayList.
7. Display an appropriate message indicating whether the Employee object was removed successfully.
8. Display all Employee objects after the removal operation.

Test Cases:

Test Case 1: Remove an Existing Employee

Initial Employee List:
Employee(id=101, name="Ravi", salary=30000)
Employee(id=102, name="Priya", salary=35000)
Employee(id=103, name="Kiran", salary=40000)
Employee(id=104, name="Sneha", salary=45000)
Employee(id=105, name="Arun", salary=50000)

Input:
id = 103
name = Kiran
salary = 40000

Expected Output:
Employee removed successfully.

Remaining Employees:
101 Ravi 30000
102 Priya 35000
104 Sneha 45000
105 Arun 50000

Test Case 2: Remove Another Existing Employee

Input:
id = 101
name = Ravi
salary = 30000

Expected Output:
Employee removed successfully.

Remaining Employees:
102 Priya 35000
103 Kiran 40000
104 Sneha 45000
105 Arun 50000

Test Case 3: Remove a Non-Existing Employee

Input:
id = 999
name = Rahul
salary = 60000

Expected Output:
Employee not found.

The original Employee list should remain unchanged.

Test Case 4: Employee ID Matches but Name Does Not Match

Input:
id = 103
name = Rahul
salary = 40000

Expected Output:
Employee not found.

Assumption:
An Employee object matches another Employee object only when all three attributes (id, name, and salary) are equal.

Test Case 5: Employee ID and Name Match but Salary Does Not Match

Input:
id = 103
name = Kiran
salary = 45000

Expected Output:
Employee not found.
---------------------------------------------------------------------------------------------------------------------
11 Question: Employee LinkedList Removal

Design a class named Employee with the following attributes:
- id
- name
- salary

Create a Test class that contains an LinkedList of 6 Employee objects.

Design a method that accepts an LinkedList of Employee objects and an employee ID entered by the user. The method should remove the employee with the specified ID.

Requirements:
1. Create an Employee class with id, name, and salary attributes.
2. Create an LinkedList containing 6 Employee objects.
3. Accept an employee ID from the user.
4. Pass the LinkedList and employee ID to a method and remove the matching employee.
5. Display the remaining employees. If no employee matches the given ID, display an appropriate message.
6. Ensure that removing an employee does not cause ConcurrentModificationException.

Test Cases:

Test Case 1:
Input:
Employee ID: 103

Expected Output:
Remove the employee with ID 103 and display the remaining employees.

Test Case 2:
Input:
Employee ID: 110

Expected Output:
Display an appropriate message indicating that no employee with ID 110 exists.

Note:
- The employee ID is unique.
---------------------------------------------------------------------------------------------------------------------
12 Question: Shoe ArrayList Update

Design a class named Shoe with the following attributes:
- pid
- price
- color

Create a Test class that contains an ArrayList of 5 Shoe objects.

Design a method that accepts an ArrayList of Shoe objects and a pid as a key element. 
The method should remove the details of the Shoe object matching the given pid and return the updated ArrayList.

Requirements:
1. Create a Shoe class with pid, price, and color attributes.
2. Create an ArrayList containing 5 Shoe objects.
3. Accept a pid from the user.
4. Pass the ArrayList and pid to a method to update the matching Shoe object's details.
5. Return the updated ArrayList from the method.
6. If no Shoe object matches the given pid, display an appropriate message.

Test Cases:

Test Case 1:
Input:
PID: 101
New Price: 2500.0
New Color: Black

Expected Output:
Update the Shoe object with pid 101 to price 2500.0 and color Black. Display the updated ArrayList.

Test Case 2:
Input:
PID: 103
New Price: 1800.0
New Color: White

Expected Output:
Update the Shoe object with pid 103 to price 1800.0 and color White. Display the updated ArrayList.

Test Case 3:
Input:
PID: 105
New Price: 3200.0
New Color: Blue

Expected Output:
Update the Shoe object with pid 105 to price 3200.0 and color Blue. Display the updated ArrayList.

Test Case 4:
Input:
PID: 110
New Price: 1500.0
New Color: Red

Expected Output:
Display an appropriate message indicating that no Shoe object with pid 110 exists. The ArrayList should remain unchanged.

Note:
- The pid is unique for each Shoe object.
- The method must return the updated LinkedList.

---------------------------------------------------------------------------------------------------------------------

13 Question: Student LinkedList Sorting

Design a class named Student with the following attributes:
- sid
- name
- age

Create a Test class that contains a LinkedList of 5 Student objects.

Design a method that accepts a LinkedList of Student objects and sorts the Student objects in ascending alphabetical order based on their names.

Requirements:
1. Create a Student class with sid, name, and age attributes.
2. Create a LinkedList containing 5 Student objects.
3. Pass the LinkedList to a method that sorts the Student objects based on their names in ascending alphabetical order.
4. Return the sorted LinkedList from the method.
5. Display the Student objects before and after sorting.

Test Cases:

Test Case 1:
Input Student Names:
Rahul, Arjun, Priya, Kiran, Sneha

Expected Output:
Arjun, Kiran, Priya, Rahul, Sneha

Test Case 2:
Input Student Names:
Zoya, Aman, Bhavya, Deepak, Charan

Expected Output:
Aman, Bhavya, Charan, Deepak, Zoya

Test Case 3:
Input Student Names:
Meena, Anil, Meena, Karthik, Bala

Expected Output:
Anil, Bala, Karthik, Meena, Meena

Test Case 4:
Input Student Names:
Vijay, vijay, Ajay, ajay, Rohan

Expected Output:
Sort the Student objects alphabetically by name, using a consistent case-sensitive or case-insensitive ordering.

Note:
- Use LinkedList to store the Student objects.
- Sort the objects based on the name field, not the sid or age.
- You may use Comparable or Comparator to define the sorting logic.
- Preserve each Student object's sid and age while sorting.

---------------------------------------------------------------------------------------------------------------------

14. Question: Batman List Sorting

Design a class named Batman with the following attributes:
- name
- strikeRate
- noOfHundreds

Create a Test class and perform the following operations:

Requirements:
1. Create a Batman class with name, strikeRate, and noOfHundreds attributes.
2. Create a List containing 5 Batman objects.
3. Display all Batman objects in ascending order of their strikeRate.
4. Display the details of all Batman objects before and after sorting.

Test Cases:

Test Case 1:
Input:
Batman details:
Virat, 95.5, 80
Rohit, 92.0, 50
Sachin, 86.2, 100
Gill, 98.5, 10
Dhoni, 87.5, 10

Expected Output:
Display all Batman objects sorted in ascending order of strikeRate:
Sachin, 86.2, 100
Dhoni, 87.5, 10
Rohit, 92.0, 50
Virat, 95.5, 80
Gill, 98.5, 10

Test Case 2:
Input:
Batman details:
PlayerA, 75.0, 5
PlayerB, 60.5, 2
PlayerC, 88.0, 15
PlayerD, 70.0, 8
PlayerE, 55.5, 1

Expected Output:
Display all Batman objects sorted in ascending order of strikeRate:
PlayerE, 55.5, 1
PlayerB, 60.5, 2
PlayerD, 70.0, 8
PlayerA, 75.0, 5
PlayerC, 88.0, 15

Note:
- Use a List to store the Batman objects.
- Sort the objects based on strikeRate in ascending order.
- You may use Comparable or Comparator to implement the sorting logic.

---------------------------------------------------------------------------------------------------------------------
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


