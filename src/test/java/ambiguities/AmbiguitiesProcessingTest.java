/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambiguities;

import java.util.ArrayList;
import java.util.List;
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
public class AmbiguitiesProcessingTest {

    public AmbiguitiesProcessingTest() {
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
     * Test of ambiguityFilter method, of class AmbiguitiesProcessing.
     */
    @Test
    public void testAmbiguityFilter() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"200", "14"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();

        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("2");
        expResult.add("200");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter2() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"200"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("200");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter3() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"200", "624"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("200");

        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter4() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"200", "4"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("20");
        expResult.add("200");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter5() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"000"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("000");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter6() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"720", "5"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("72");
        expResult.add("720");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter7() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"710", "5"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("710");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter8() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"759"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("70059");
        expResult.add("759");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter9() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"504"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("5004");
        expResult.add("504");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter10() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"057"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("0507");
        expResult.add("057");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter11() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"050", "7"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("05");
        expResult.add("050");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter12() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"00"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("00");

        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    @Test
    public void testAmbiguityFilter13() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"56"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("506");
        expResult.add("56");

        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }  
    @Test
    public void testAmbiguityFilter14() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"50","6"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("5");
        expResult.add("50");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }
     @Test
    public void testAmbiguityFilter15() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"10","6"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("10");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }
     @Test
    public void testAmbiguityFilter16() {
        System.out.println("ambiguityFilter");
        String[] userInputElements = {"50","7"};
        List<String> possibleCombosFromCurrentElement = new ArrayList<>();
        int i = 0;
        AmbiguitiesProcessing instance = new AmbiguitiesProcessing();
        List<String> expResult = new ArrayList<>();
        expResult.add("5");
        expResult.add("50");
        List<String> result = instance.ambiguityFilter(userInputElements, possibleCombosFromCurrentElement, i);
        assertEquals(expResult, result);

    }

    /**
     * Test of processEachInputElement method, of class AmbiguitiesProcessing.
     */
   
    /**
     * Test of extractPossibleCombinations method, of class
     * AmbiguitiesProcessing.
     */
  

}
