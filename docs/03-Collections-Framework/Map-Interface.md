HashMap Questions
 1.  Store Person Objects as Keys in a HashMap

Create a Person class with the following properties:

int id
String name
double salary

Requirements:

1. Override the equals() and hashCode() methods in the Person class using all three properties: id, name, and salary.
2. Create a HashMap<Person, Integer>.
3. Create Person objects and insert them into the HashMap with integer values.
4. Display all Person objects and their corresponding integer values using keySet() and an enhanced for loop.
5. Observe how HashMap handles duplicate keys and Person objects with different properties.

Test Case 1: Different Person Objects

Input:
Person p1 = new Person(1, "Alex", 25000);
Person p2 = new Person(3, "George", 35000);
Person p3 = new Person(1, "Martha", 30000);

hm.put(p1, 111);
hm.put(p2, 222);
hm.put(p3, 333);

Expected Output:
==================
Alex (1, 25000.0)    --> 111
George (3, 35000.0)  --> 222
Martha (1, 30000.0)  --> 333

Note: The output order may vary because HashMap does not guarantee iteration order.


Test Case 2: Insert the Same Person Object Twice

Input:
Person p1 = new Person(1, "Alex", 25000);
Person p2 = new Person(3, "George", 35000);
Person p3 = new Person(1, "Martha", 30000);

hm.put(p1, 111);
hm.put(p2, 222);
hm.put(p3, 333);
hm.put(p3, 333);

Expected Output:
==================
Alex (1, 25000.0)    --> 111
George (3, 35000.0)  --> 222
Martha (1, 30000.0)  --> 333

Note: Inserting the same object again with the same value does not create another entry. The HashMap contains three entries.


Test Case 3: Insert an Equal Person Object with a Different Value

Input:
Person p1 = new Person(1, "Alex", 25000);
Person p2 = new Person(3, "George", 35000);
Person p3 = new Person(1, "Martha", 30000);
Person p4 = new Person(1, "Martha", 30000);

hm.put(p1, 111);
hm.put(p2, 222);
hm.put(p3, 333);
hm.put(p4, 444);

Expected Output:
==================
Alex (1, 25000.0)    --> 111
George (3, 35000.0)  --> 222
Martha (1, 30000.0)  --> 444

Note: Since p3 and p4 have identical property values, equals() should return true and hashCode() should return the same value. Therefore, inserting p4 replaces the value associated with p3 from 333 to 444. The HashMap contains three entries.

---------------------------------------------------------------------------------------------------------------------
2. Store Passport Objects in a HashMap Using entrySet() and Iterator

Create a class named Passport with the following properties:

String name
String pid

Requirements:

1. Create a Passport class with a constructor to initialize name and pid.
2. Override equals() and hashCode() using both name and pid.
3. Do not override the toString() method in the Passport class.
4. Create a HashMap<Passport, String> where Passport objects are keys and gender is the value.
5. Insert Passport objects into the HashMap.
6. Use entrySet() and Iterator to traverse the HashMap.
7. Print the passport ID, name, and gender of each entry.
8. Observe how HashMap handles Passport objects that have the same name and pid.

Test Case 1: Four Different Passport Objects

Input:
4
vinay vin1343 male
sanjay san1344 male
darshan dar1345 male
akshay aks1346 male

Expected Output:
vin1343 vinay    male
san1344 sanjay   male
dar1345 darshan  male
aks1346 akshay   male

Note: The output order may vary because HashMap does not guarantee iteration order.


Test Case 2: Different Names with the Same Passport ID

Input:
6
vinay vin1343 male
sanjay san1344 male
darshan dar1345 male
akshay aks1346 male
darshana dar1345 female
akshaya aks1346 female

Expected Output:
vin1343 vinay       male
san1344 sanjay      male
dar1345 darshan     male
aks1346 akshay      male
dar1345 darshana    female
aks1346 akshaya     female

Note: Passport objects with the same pid but different names are different keys because equals() compares both name and pid.


Test Case 3: Same Name and Same Passport ID with Different Gender Values

Input:
4
vinay vin1343 male
sanjay san1344 male
vinay vin1343 female
darshan dar1345 male

Expected Output:
vin1343 vinay    female
san1344 sanjay   male
dar1345 darshan  male

Note: The second Passport object with name vinay and pid vin1343 replaces the value associated with the first equal key. The HashMap contains three entries.


Test Case 4: Same Name with Different Passport IDs

Input:
4
vinay vin1343 male
vinay vin5678 male
sanjay san1344 male
darshan dar1345 male

Expected Output:
vin1343 vinay    male
vin5678 vinay    male
san1344 sanjay   male
dar1345 darshan  male

Note: Passport objects with the same name but different passport IDs are treated as different keys.


Test Case 5: Insert the Same Passport Object Multiple Times

Input:
4
vinay vin1343 male
sanjay san1344 male
darshan dar1345 male
vinay vin1343 male

Expected Output:
vin1343 vinay    male
san1344 sanjay   male
dar1345 darshan  male

Note: Inserting the same Passport object again does not create a duplicate entry. The HashMap contains three entries.

Important:
Use entrySet() and Iterator<Map.Entry<Passport, String>> to traverse the entries. Since toString() is not overridden, print passport.pid and passport.name explicitly instead of printing the Passport object directly.
---------------------------------------------------------------------------------------------------------------------

LinkedHashMap Questions

1) Question: Store Student Objects in a TreeMap

Create a Student class with the following properties:

int rollNo
String name

Requirements:

1. Create a constructor to initialize rollNo and name.
2. Create a TreeMap<Integer, Student> where the key is the student's roll number and the value is the Student object.
3. Insert 5 Student objects into the TreeMap.
4. Use an enhanced for-each loop with entrySet() to display all student details.
5. Display the entries in ascending order of roll numbers.

Test Case 1: Roll Numbers Inserted in Random Order

Input:
5
103 Rahul
101 Amit
105 Priya
102 Sneha
104 Kiran

Expected Output:
Student Details:
101 Amit
102 Sneha
103 Rahul
104 Kiran
105 Priya


Test Case 2: Roll Numbers Inserted in Descending Order

Input:
5
105 Kiran
104 Priya
103 Rahul
102 Sneha
101 Amit

Expected Output:
Student Details:
101 Amit
102 Sneha
103 Rahul
104 Priya
105 Kiran


Test Case 3: Non-Consecutive Roll Numbers

Input:
5
205 George
110 Alex
350 Martha
125 Sanjay
275 Darshan

Expected Output:
Student Details:
110 Alex
125 Sanjay
205 George
275 Darshan
350 Martha

Note:
Use TreeMap<Integer, Student> to store Student objects. TreeMap automatically sorts entries by the integer keys in ascending order. If the same roll number is inserted more than once, the latest Student value replaces the previous value for that key.
---------------------------------------------------------------------------------------------------------------------
