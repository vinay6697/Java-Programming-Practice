1. Java Program to Find the Length of a String Without Using length() Method

Question:

Write a Java program to find the length of a given String without using the built-in length() method.

Explanation:

1. Take a String as input from the user.
2. Find the number of characters present in the String without using the length() method.
3. Use a looping mechanism to traverse the String.
4. Maintain a counter variable and increment it for every character.
5. Display the total number of characters as the length of the String.

Test Cases:

Test Case 1
Input: Java
Expected Output: Length: 4

Test Case 2
Input: Hello World
Expected Output: Length: 11

Test Case 3
Input: Programming
Expected Output: Length: 11

Test Case 4
Input: 1234567890
Expected Output: Length: 10

Test Case 5
Input: Empty String
Expected Output: Length: 0

----------------------------------------------------------------------------------------------

2. Write a Java program to compare two given Strings and check whether they are equal or not without using the built-in equals() method.

Explanation:

1. Take two Strings as input from the user.
2. Compare the lengths of both Strings.
3. If the lengths are different, the Strings are not equal.
4. If the lengths are equal, compare each character of both Strings.
5. If all characters are matching, the Strings are equal.
6. Otherwise, the Strings are not equal.

Test Cases:

Test Case 1
Input:
String 1: Java
String 2: Java
Expected Output: Strings are Equal

Test Case 2
Input:
String 1: Java
String 2: Python
Expected Output: Strings are Not Equal

Test Case 3
Input:
String 1: Hello
String 2: hello
Expected Output: Strings are Not Equal

Test Case 4
Input:
String 1: Programming
String 2: Programming
Expected Output: Strings are Equal

Test Case 5
Input:
String 1: Java123
String 2: Java124
Expected Output: Strings are Not Equal

----------------------------------------------------------------------------------------------

3.Write a Java program to convert a given String containing numeric characters into an integer without using the built-in Integer.parseInt() method.

Explanation:

1. Take a String containing numeric characters as input from the user.
2. Initialize an integer variable to store the converted number.
3. Traverse each character of the String.
4. Convert each character into its corresponding numeric value by subtracting the character '0'.
5. Multiply the existing result by 10 and add the converted digit.
6. Repeat this process until all characters are processed.
7. Display the final integer value.

Test Cases:

Test Case 1
Input: "1234"
Expected Output: 1234

Test Case 2
Input: "567"
Expected Output: 567

Test Case 3
Input: "98765"
Expected Output: 98765

Test Case 4
Input: "1000"
Expected Output: 1000

Test Case 5
Input: "0"
Expected Output: 0

----------------------------------------------------------------------------------------------