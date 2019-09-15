/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputProcess;

import static com.numbersInterpretation.NaturalNumbersInterpretation.scanner;
import java.util.Scanner;

/**
 *
 * @author Haris
 */
public class InputValidation {

    public static String getUserInput() {
       
        System.out.println("Give a valid phone number");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static String[] splitInput(String userInput) {
        String[] userInputArray = userInput.split("\\s+");
        return userInputArray;
    }

    public static boolean isNumeric(String[] string) {
        for (String arrayElement : string) {
            try {
                Integer.parseInt(arrayElement);
            } catch (NumberFormatException numberException) {
                System.out.println(arrayElement + " contains characters and can't be processed");
                return false;
            }
        }
        return true;
    }

    public static boolean digitCheck(String[] stringArray) {
        for (String arrayElement : stringArray) {
            if (arrayElement.length() > 3) {
                System.out.println("You cant have more than 3 digits in a row without space");
                return false;
            }
        }
        return true;
    }

    public static String concatString(String[] stringArray) {

        String emptyString = "";
        for (String string : stringArray) {
            emptyString = emptyString.concat(string);
        }
        return emptyString;
    }

    public static boolean checkForGreekNumber(String input) {
        if (input.length() != 10 && input.length() != 14) {
            return false;
        } else if (input.length() == 10 && (input.startsWith("2") || input.startsWith("69"))) {
            return true;
        } else if (input.length() == 14 && (input.startsWith("00302") || input.startsWith("003069"))) {
            return true;
        } else {
            return false;
        }
    }
}
