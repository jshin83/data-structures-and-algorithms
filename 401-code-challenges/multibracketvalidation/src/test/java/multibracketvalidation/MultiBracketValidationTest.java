/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package multibracketvalidation;

import org.junit.Test;
import static org.junit.Assert.*;

public class  MultiBracketValidationTest {

    @Test (expected = IllegalArgumentException.class)
    public void emptyList() {
        //list is empty, throws error
        MultiBracketValidation.multiBracketValidation("");
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullList() {
        //list is null, throws error
        MultiBracketValidation.multiBracketValidation(null);
    }

    @Test
    public void oneLengthInput() {
        assertFalse("String with length of 1 should return false",
                MultiBracketValidation.multiBracketValidation("p"));
    }

    @Test
    public void happyPath() {
        assertTrue("Brackets are paired correctly, should return true",
                MultiBracketValidation.multiBracketValidation("[({ff})]feaij")
        );
    }

    @Test
    public void sadPath() {
        assertFalse("Brackets are not paired correctly, should return false",
                MultiBracketValidation.multiBracketValidation("fejf[}fejai{}")
        );
    }

    @Test
    public void noBracket() {
        assertTrue("String without brackets returns true and prints message to user",
                MultiBracketValidation.multiBracketValidation("fefaefafieoafjeo"));
    }
}
