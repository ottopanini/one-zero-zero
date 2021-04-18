/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Initialization of primitive data type variables - including default values
*/

public class FooBar {
    public static void main(String[] args) {

        int p;  // p is an uninitialized local variable here

        boolean myBoolean = true;

        // If/Else statement satisfies compiler's full initialization check
        if (myBoolean) {
            p = 1;
        } else {
            p = 2;
        }

        System.out.println("p is " + p);  // p is now fully initialized
    }
}