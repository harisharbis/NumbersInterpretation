/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import inputProcess.InputValidation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haris
 */
public class Output {
//this is a helper method that takes the outcome of the ambiguity processing (which is a list that consists of lists) 
 //and concatenates each list elements in order to print them in the following stage of the program
    public static List<String> concatElementsFromEachList(List<List<String>> combinationsAfterAmbiguities) {
        List<String> finalList = new ArrayList<>();
        for (int i = 0; i < combinationsAfterAmbiguities.size(); i++) {

            List<String> currentlist = (combinationsAfterAmbiguities.get(i));
            String emptyString = "";
            for (int j = 0; j < currentlist.size(); j++) {
                emptyString = emptyString.concat(currentlist.get(j));

            }
            finalList.add(emptyString);
        }
        return finalList;
    }
//this method receives the list the with all the possible combinations and runs them through a phone number filter 
 //to decide whether its a valid number or not and prints each combination followed by the right message
    public static void printVariousPossibleCombinations(List<String> finalList) {
        for (int i = 0; i < finalList.size(); i++) {
            System.out.println("Interpretation "+ (i + 1));
            if (InputValidation.checkForGreekNumber(finalList.get(i))==false) {
                System.out.println(finalList.get(i) + " [phone number:INVALID]");
            } else {
                System.out.println(finalList.get(i) + " [phone number:VALID]");
            }
            System.out.println("---------------------------------");
        }

    }
}
