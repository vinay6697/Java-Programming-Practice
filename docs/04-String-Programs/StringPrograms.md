1. Write a Java program to find the length of a given String without using the built-in length() method.

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

4. Write a Java program to fetch and display the first and last characters of a given String.

Explanation:

1. Take a String as input from the user.
2. Retrieve the first character of the String.
3. Retrieve the last character of the String.
4. Display both the first and last characters.
5. Do not use the built-in length() method.

Test Cases:

Test Case 1
Input: "Java"
Expected Output:
First Character: J
Last Character: a

Test Case 2
Input: "Programming"
Expected Output:
First Character: P
Last Character: g

Test Case 3
Input: "Hello"
Expected Output:
First Character: H
Last Character: o

Test Case 4
Input: "12345"
Expected Output:
First Character: 1
Last Character: 5

Test Case 5
Input: "A"
Expected Output:
First Character: A
Last Character: A

----------------------------------------------------------------------------------------------

5. Write a Java program to convert a given String into a character array without using the built-in toCharArray() method.

Explanation:

1. Take a String as input from the user.
2. Create a character array to store the characters of the String.
3. Traverse each character of the String using a loop.
4. Retrieve each character using the charAt() method.
5. Store each character into the corresponding position of the character array.
6. Display the resulting character array.

Test Cases:

Test Case 1
Input: "Java"
Expected Output: J a v a

Test Case 2
Input: "Hello"
Expected Output: H e l l o

Test Case 3
Input: "Programming"
Expected Output: P r o g r a m m i n g

Test Case 4
Input: "12345"
Expected Output: 1 2 3 4 5

Test Case 5
Input: "A"
Expected Output: A

----------------------------------------------------------------------------------------------
6.Write a Java program to find the total number of vowels present in a given String.

The vowels are a, e, i, o, u. The program should count both uppercase and lowercase vowels.

Example:

Input:
Enter a String: Hello World

Output:
Number of vowels: 3

Explanation:

The given String is "Hello World".

Characters present in the String:

H → Not a vowel
e → Vowel
l → Not a vowel
l → Not a vowel
o → Vowel
W → Not a vowel
o → Vowel
r → Not a vowel
l → Not a vowel
d → Not a vowel

Total number of vowels = 3.

Test Cases:

Test Case 1:
Input: "Hello World"
Expected Output: 3

Test Case 2:
Input: "Java Programming"
Expected Output: 5

Test Case 3:
Input: "AEIOU"
Expected Output: 5

Test Case 4:
Input: "bcdfgh"
Expected Output: 0

Test Case 5:
Input: "Education"
Expected Output: 5

----------------------------------------------------------------------------------------------
7. Write a Java program to find and print the total number of vowels and consonants present in a given String.

Vowels: a, e, i, o, u.

All other English alphabet characters (a-z) that are not vowels should be considered consonants.

The program should handle both uppercase and lowercase letters.

Example:

Input:
Enter a String: Hello World

Output:
Number of vowels: 3
Number of consonants: 7

Explanation:

The given String is "Hello World".

Character-wise classification:

H → Consonant
e → Vowel
l → Consonant
l → Consonant
o → Vowel
W → Consonant
o → Vowel
r → Consonant
l → Consonant
d → Consonant

Total number of vowels = 3.
Total number of consonants = 7.

Note: Spaces, digits and special characters should not be counted as vowels or consonants.

Test Cases:

Test Case 1:
Input: "Hello World"
Expected Output:
Vowels: 3
Consonants: 7

Test Case 2:
Input: "Java Programming"
Expected Output:
Vowels: 5
Consonants: 10

Test Case 3:
Input: "AEIOU"
Expected Output:
Vowels: 5
Consonants: 0

Test Case 4:
Input: "bcdfgh"
Expected Output:
Vowels: 0
Consonants: 6

Test Case 5:
Input: "Java123@#$"
Expected Output:
Vowels: 2
Consonants: 2

----------------------------------------------------------------------------------------------

8.Write a Java program to find and print the total number of spaces present in a given String.

A space is defined as a blank space character (' '). The program should count all spaces between words, including consecutive spaces.

Example:

Input:
Enter a String: Java is a programming language

Output:
Number of spaces: 4

Explanation:

The given String is "Java is a programming language".

There are spaces between the following words:

1. Java and is
2. is and a
3. a and programming
4. programming and language

Total number of spaces = 4.

Test Cases:

Test Case 1:
Input: "Java is a programming language"
Expected Output: 4

Test Case 2:
Input: "Hello World"
Expected Output: 1

Test Case 3:
Input: "Java  Programming"
Expected Output: 2

Test Case 4:
Input: "HelloWorld"
Expected Output: 0

Test Case 5:
Input: "  Java is  easy  "
Expected Output: 6

----------------------------------------------------------------------------------------------

10. WAJP to find the count of characters having even ASCII values in the given String.

Question:
Write a Java program to accept a String from the user and count the number of characters whose ASCII values are even.

Explanation:
1. Read a String from the user.
2. Traverse each character in the String using a loop.
3. Find the ASCII value of each character.
4. Check whether the ASCII value is divisible by 2 using the modulus (%) operator.
5. If the ASCII value is even, increment the count.
6. Finally, print the total count of characters having even ASCII values.

Test Cases:

Test Case 1:
Input: ABCD
Output: 2

Test Case 2:
Input: HELLO
Output: 2

Test Case 3:
Input: JAVA
Output: 2

Test Case 4:
Input: abc
Output: 1

Test Case 5:
Input: 12345
Output: 2

Note:
- Consider uppercase letters, lowercase letters and digits.
- Ignore spaces in the String.
- ASCII values divisible by 2 are considered even.

----------------------------------------------------------------------------------------------

11. Write a Java program to convert all lowercase characters in a given string into uppercase characters.

The program should convert only lowercase alphabets (a-z) into their corresponding uppercase alphabets (A-Z). All other characters, including uppercase letters, digits, spaces, and special characters, should remain unchanged.

EXPLANATION:
1. Read a string from the user.
2. Traverse each character of the string using a loop.
3. Check whether the character is between 'a' and 'z'.
4. If the character is lowercase, convert it into its corresponding uppercase character.
5. If the character is not lowercase, leave it unchanged.
6. Print the resulting string.

TEST CASES:

Test Case 1:
Input: hello
Output: HELLO

Test Case 2:
Input: java programming
Output: JAVA PROGRAMMING

Test Case 3:
Input: Hello World
Output: HELLO WORLD

Test Case 4:
Input: java123
Output: JAVA123

Test Case 5:
Input: hello@123
Output: HELLO@123

EXPECTED OUTPUT:
The program should convert all lowercase characters in the given string into uppercase characters while keeping all other characters unchanged.

----------------------------------------------------------------------------------------------
12. Write a Java program to convert all uppercase characters in a given string into lowercase characters.

The program should convert only uppercase alphabets (A-Z) into their corresponding lowercase alphabets (a-z). All other characters, including lowercase letters, digits, spaces, and special characters, should remain unchanged.

EXPLANATION:
1. Read a string from the user.
2. Traverse each character of the string using a loop.
3. Check whether the character is between 'A' and 'Z'.
4. If the character is uppercase, convert it into its corresponding lowercase character.
5. If the character is not uppercase, leave it unchanged.
6. Print the resulting string.

TEST CASES:

Test Case 1:
Input: HELLO
Output: hello

Test Case 2:
Input: JAVA PROGRAMMING
Output: java programming

Test Case 3:
Input: Hello World
Output: hello world

Test Case 4:
Input: JAVA123
Output: java123

Test Case 5:
Input: HELLO@123
Output: hello@123

EXPECTED OUTPUT:
The program should convert all uppercase characters in the given string into lowercase characters while keeping all other characters unchanged.

----------------------------------------------------------------------------------------------

13. Write a Java program to find the frequency of each character present in the given String.

The program should count how many times each character occurs and display each character along with its frequency.

EXPLANATION:

Frequency of a character means the total number of times that character appears in a given String.

Example:

Input:
programming

Output:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1

REQUIREMENTS:

1. Accept a String as input.
2. Identify each character in the String.
3. Count the occurrences of every character.
4. Display each character only once along with its frequency.
5. Avoid counting the same character multiple times.
6. Treat uppercase and lowercase characters as different.
7. Count spaces as characters.

TEST CASES:

TEST CASE 1:

Input:
programming

Expected Output:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1

TEST CASE 2:

Input:
banana

Expected Output:
b = 1
a = 3
n = 2

TEST CASE 3:

Input:
hello

Expected Output:
h = 1
e = 1
l = 2
o = 1

TEST CASE 4:

Input:
aabbccdd

Expected Output:
a = 2
b = 2
c = 2
d = 2

TEST CASE 5:

Input:
Java Programming

Expected Output:
J = 1
a = 3
v = 1
  = 1
P = 1
r = 2
o = 1
g = 2
m = 2
i = 1
n = 1

----------------------------------------------------------------------------------------------

14 . Write a Java program to accept two numeric Strings from the user, convert them into integers, and find their sum.

Explanation:

1. Read two Strings from the user using Scanner.
2. Pass both Strings to a separate method named `isSum()`.
3. Use Integer.parseInt() to convert the Strings into integer values.
4. Add both integer values using the `+` operator.
5. Display the final summation.

Example:

Input:
First String: "100"
Second String: "200"

Output:
Sum of 100 and 200 is: 300

Test Cases:

Test Case 1:
Input:
s1 = "100"
s2 = "200"
Output:
300

Test Case 2:
Input:
s1 = "50"
s2 = "75"
Output:
125

Test Case 3:
Input:
s1 = "0"
s2 = "100"
Output:
100

Test Case 4:
Input:
s1 = "-25"
s2 = "50"
Output:
25

Test Case 5:
Input:
s1 = "1000"
s2 = "2000"
Output:
3000

----------------------------------------------------------------------------------------------

15. Write a Java program to accept a String from the user and convert the first half of the String into uppercase and the second half into lowercase.

Test Cases:

Test Case 1: Even Length
Input:
str = "JAVA"
Output:
JAva

Test Case 2: Even Length
Input:
str = "HELLOWORLD"
Output:
HELLOworld

Test Case 3: Odd Length
Input:
str = "ABCDEFGHI"
Output:
ABCDEfghi

Test Case 4: Odd Length
Input:
str = "welcome"
Output:
WELCme

Test Case 5: Odd Length
Input:
str = "programming"
Output:
PROGRAming

----------------------------------------------------------------------------------------------

16 .Given a string containing a sentence, find and return the total number of words present in that sentence. A word is defined as a sequence of non-space characters separated by one or more spaces. The sentence may contain leading spaces, trailing spaces, or multiple consecutive spaces between words.

Explanation

The input consists of a sentence that may contain words separated by spaces. The objective is to determine how many individual words are present in the given sentence, regardless of the number of spaces between them. Spaces at the beginning or end of the sentence should not be considered as words, and multiple consecutive spaces should be treated as a single separator.

Constraints:

1. The input string may contain uppercase letters, lowercase letters, digits, and spaces.
2. The sentence may contain leading spaces or trailing spaces.
3. Multiple consecutive spaces may occur between words.
4. The string may be empty.
5. The string length can range from 0 to 1000 characters.

Test Cases:

Test Case 1:
Input: "Java is a powerful language"
Output: 5

Test Case 2:
Input: "Hello World"
Output: 2

Test Case 3:
Input: "  Java   is    easy  "
Output: 3

Test Case 4:
Input: "Programming"
Output: 1

Test Case 5:
Input: ""
Output: 0

----------------------------------------------------------------------------------------------

17. Given a string containing multiple words, convert the first character of every word to uppercase while keeping all the remaining characters unchanged. Return the modified string without altering the original spacing between words.

Explanation:

The input string may contain multiple words separated by spaces. Each word may begin with a lowercase letter, uppercase letter, digit, or special character. The objective is to ensure that the first character of every word is uppercase whenever it is a lowercase English letter. All other characters in the string must remain unchanged. The original spacing, including leading spaces, trailing spaces, and multiple consecutive spaces, must be preserved.

Constraints:

1. The string length can range from 0 to 1000 characters.
2. The string may contain uppercase letters, lowercase letters, digits, and special characters.
3. The string may contain leading spaces or trailing spaces.
4. Multiple consecutive spaces may occur between words.
5. Only the first character of each word should be converted to uppercase.
6. All characters other than the first character of each word must remain unchanged.
7. If the first character of a word is already uppercase, it should remain unchanged.

Test Cases:

Test Case 1:
Input: "java is easy"
Output: "Java Is Easy"

Test Case 2:
Input: "apple banana orange"
Output: "Apple Banana Orange"

Test Case 3:
Input: "  java   is   good  "
Output: "  Java   Is   Good  "

Test Case 4:
Input: "JAVA developer"
Output: "JAVA Developer"

Test Case 5:
Input: "123 hello world"
Output: "123 Hello World"

Test Case 6:
Input: "a z"
Output: "A Z"

Test Case 7:
Input: ""
Output: ""

Test Case 8:
Input: "hello@world java-programming"
Output: "Hello@world Java-programming"

----------------------------------------------------------------------------------------------

18 . Given a string containing multiple words separated by spaces, convert the last word of the string into uppercase without modifying the other 	words.

The string may contain multiple words, and the last word should be identified based on its position in the string.

Explanation:
A sentence consists of multiple words separated by spaces. The task is to identify the last word in the given sentence and convert all the characters of that word into uppercase letters.

The remaining words in the sentence must retain their original case.

The program should return or print the modified sentence with only the last word converted into uppercase.

Constraints:
1. The string may contain multiple words separated by spaces.
2. The string contains at least one word.
3. The words may contain both uppercase and lowercase English letters.
4. The last word must be converted entirely into uppercase.
5. All other words must remain unchanged.
6. The string may contain a mixture of uppercase and lowercase characters.

Test Cases:

Test Case 1:
Input: Java is a programming language
Output: Java is a programming LANGUAGE

Test Case 2:
Input: hello world
Output: hello WORLD

Test Case 3:
Input: I love coding
Output: I love CODING

Test Case 4:
Input: java programming
Output: java PROGRAMMING

Test Case 5:
Input: Welcome to the world of Java
Output: Welcome to the world of JAVA

---------------------------------------------------------------------------------------------

19. Given a string, reverse the entire string and print the reversed string.

The order of all characters in the string must be reversed, such that the last character of the original string becomes the first character of the reversed string and the first character becomes the last.

Explanation:
A string is a sequence of characters arranged in a particular order. Reversing a string means changing the order of its characters from the end to the beginning.

The task is to produce a new string in which all the characters of the given string appear in reverse order. The characters themselves must remain unchanged, and only their positions should be reversed.

Constraints:
1. The input must contain at least one character.
2. The string may contain uppercase and lowercase English letters.
3. The string may contain digits or special characters.
4. The original characters must not be modified or removed.
5. The output must contain all the characters of the original string in reverse order.

Test Cases:

Test Case 1:
Input: Java
Output: avaJ

Test Case 2:
Input: Hello
Output: olleH

Test Case 3:
Input: Programming
Output: gnimmargorP

Test Case 4:
Input: 12345
Output: 54321

Test Case 5:
Input: Java@123
Output: 321@avaJ

---------------------------------------------------------------------------------------------

20. Reverse Words in a String

Explanation:
Given a string containing multiple words separated by spaces, rearrange the words in reverse order while keeping the characters of each individual word unchanged.

The order of the words should be reversed, but the spelling of each word should remain the same.

Example:
Input: Tom And Jerry
Output: Jerry And Tom

Constraints:
1. The string may contain multiple words separated by spaces.
2. Each word must retain its original character order.
3. The order of words must be reversed.
4. Words are separated by spaces.
5. The input string may contain at least one word.

Test Cases:

Test Case 1:
Input: Tom And Jerry
Output: Jerry And Tom

Test Case 2:
Input: Java Is Powerful
Output: Powerful Is Java

Test Case 3:
Input: I Love Programming
Output: Programming Love I

Test Case 4:
Input: Hello World
Output: World Hello

Test Case 5:
Input: Spring Boot Java Developer
Output: Developer Java Boot Spring

---------------------------------------------------------------------------------------------