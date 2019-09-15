/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.numbersInterpretation;

import ambiguities.AmbiguitiesProcessing;
import inputProcess.InputValidation;
import java.util.List;
import java.util.Scanner;
import utils.Output;

/**
 *
 * @author Haris
 */
public class NaturalNumbersInterpretation {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = false;
        while (flag == false) {
            String input = InputValidation.getUserInput();//get user's input
            String[] formatinput = InputValidation.splitInput(input);//split the user's input using space to divide the elements
            //At this point the program checks if the input contains character or has more than 3 digits in a row without space 
            //and if one condition is true restarts
            if (InputValidation.isNumeric(formatinput) == true && InputValidation.digitCheck(formatinput) == true) {
                //if it passes the check above it checks for area code and restarts if it identifies that the current input can't be a phone number
                String concatString = InputValidation.concatString(formatinput);
                System.out.println("The phone number you entered is " + concatString);
                if (InputValidation.checkForGreekNumber(concatString) == false) {
                    System.out.println(concatString + " does not match a Greek phone number");
                    continue;
                }
            } else {
                continue;
            }
            //at this point it is confirmed that the user gave a valid greek phone number without 4 digits in a row and without characters
            //create an instance to access the methods of AmbiguitiesProcessing class
            AmbiguitiesProcessing ambiguitiesObject = new AmbiguitiesProcessing();
            //On this point the program will analyze each element of the String[] that the user gave as input and 
            //store the result of each element analysis on a List<String> and then store each List on another List in order
            // to extract all the different combinations in the next step
            List<List<String>> combinationStorage = ambiguitiesObject.processEachInputElement(formatinput);
            //On this point the program extracts every possible different combination using the Guava Library cartesianProduct method 
            List<List<String>> combinationsAfterAmbiguities = ambiguitiesObject.extractPossibleCombinations(combinationStorage);
           //will concat the results of all the possible combinations in order to print them in the next step
            List<String> finalList = Output.concatElementsFromEachList(combinationsAfterAmbiguities);
            //final output of the program ,will print all the different interpretations of the given input
            System.out.println("The number you typed can be analyzed as: ");
            Output.printVariousPossibleCombinations(finalList);
            //swap the boolean variable in order for the program to exit
            flag = true;
        }
    }
}
