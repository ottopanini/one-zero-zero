/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Local Variable Type Inference
*/

import com.WordyCompanyName.ALongPackageName.AClassWithAVeryLongName;

public class VarTest {
    public static void main(String[] args) {
        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);
    }
}