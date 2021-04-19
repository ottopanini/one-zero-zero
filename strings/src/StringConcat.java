/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Concatenation Operator
*/

public class StringConcat {
    public static void main(String[] args) {
        String helloString = "hello";
        String worldString = "world";

        // firstString will be “hello world”, concats 3 literals..
        String firstString = helloString + " " + worldString;
        System.out.println("firstString = " + firstString);
    }
}