/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing import statements
*/

// A single-type-import declaration
import garden.vegetable.*;

// most specific import wins
import nursery.vegetable.VineVegetable;

public class TestImport {
    public static void main(String[] args) {

        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import
        // statement
        VineVegetable.main(args);
        garden.vegetable.VineVegetable.main(args);
    }
}

