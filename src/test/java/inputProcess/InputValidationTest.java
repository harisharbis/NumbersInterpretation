/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputProcess;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haris
 */
public class InputValidationTest {
    
    public InputValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserInput method, of class InputValidation.
     */
   

    /**
     * Test of splitInput method, of class InputValidation.
     */
    @Test
    public void testSplitInput() {
        System.out.println("splitInput");
        String userInput = "210  57";
        String[] expResult={"210","57"};
        String[] result = InputValidation.splitInput(userInput);
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of isNumeric method, of class InputValidation.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String[] string = {"200", "3k"};
        boolean expResult = false;
        boolean result = InputValidation.isNumeric(string);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testIsNumeric2() {
        System.out.println("isNumeric");
        String[] string = {"200","300"};
        boolean expResult = true;
        boolean result = InputValidation.isNumeric(string);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of digitCheck method, of class InputValidation.
     */
    @Test
    public void testDigitCheck() {
        System.out.println("digitCheck");
        String[] stringArray = {"200","5245","222"};
        boolean expResult = false;
        boolean result = InputValidation.digitCheck(stringArray);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of concatString method, of class InputValidation.
     */
    @Test
    public void testConcatString() {
        System.out.println("concatString");
        String[] stringArray = {"210","57","68","924"};
        String expResult = "2105768924";
        String result = InputValidation.concatString(stringArray);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkForGreekNumber method, of class InputValidation.
     */
    @Test
    public void testCheckForGreekNumber() {
        System.out.println("checkForGreekNumber");
        String input = "210576892423";
        boolean expResult = false;
        boolean result = InputValidation.checkForGreekNumber(input);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testCheckForGreekNumber2() {
        System.out.println("checkForGreekNumber");
        String input = "2105768924";
        boolean expResult = true;
        boolean result = InputValidation.checkForGreekNumber(input);
        assertEquals(expResult, result);
        
    }
}
