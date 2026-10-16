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