package ambiguities;

import com.google.common.collect.Lists;
import interfaces.ambiguities;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Haris
 */
public class AmbiguitiesProcessing implements ambiguities {

    //this method is the filter to process Each element of the input for ambiguities and returns a list of combinations of the specific element passed
    @Override
    public List<String> ambiguityFilter(String[] userInputElements, List<String> possibleCombosFromCurrentElement, int i) {
        //the method in the end will add the element passed as a whole , the checks below are for further analysis of the element if possible
        if (userInputElements[i].length() == 3) {
            if (userInputElements[i].startsWith("00")) {//cases 001 000 002 etc no ambiguities here

            }//cases 100 -200 etc we want to check next element to see if there is an ambiguity eg: 200 1 , 600 25 
            else if (userInputElements[i].endsWith("00")) {
                try {
                    if (userInputElements[i + 1].length() == 2) {
                        possibleCombosFromCurrentElement.add(userInputElements[i].replaceAll("00", ""));
                    } else if (userInputElements[i + 1].length() == 1) {
                        possibleCombosFromCurrentElement.add(userInputElements[i].replaceFirst("0", ""));
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {
                }
            } else if (userInputElements[i].endsWith("0") && userInputElements[i].charAt(0) != '0') {//cases 120 720 same as above 
                try {
                    if (userInputElements[i].charAt(1) == '1') {//numbers of type 510 can't have ambiguities

                    } else if (userInputElements[i + 1].length() == 1) {//eg. 520 5 can be analyzed to 525 or 520 5 
                        possibleCombosFromCurrentElement.add(userInputElements[i].replace("0", ""));
                    }
                } catch (IndexOutOfBoundsException exception) {
                }

            } else if (userInputElements[i].charAt(1) == '0' && userInputElements[i].charAt(2) != '0') {//cases 504 can be analyzed as 500 4 or 504
                possibleCombosFromCurrentElement.add(userInputElements[i].substring(0, 1) + "0" + userInputElements[i].substring(1, 3));
            } else if (userInputElements[i].startsWith("0")) {//cases 057 050
                if (!userInputElements[i].substring(1, 3).contains("0")) {//case 057 analyzed to 0507
                    possibleCombosFromCurrentElement.add("0" + userInputElements[i].substring(1, 2) + "0" + userInputElements[i].substring(2, 3));
                } else {
                    try {
                        if (userInputElements[i + 1].length() == 1) {//eg. 050 7 can be 057
                            possibleCombosFromCurrentElement.add("0" + userInputElements[i].substring(1, 2));
                        }
                    } catch (IndexOutOfBoundsException exception) {
                    }
                }
            } else if (!userInputElements[i].contains("00")) {//cases 756 454 can be either 700 56 or 756
                possibleCombosFromCurrentElement.add(userInputElements[i].substring(0, 1) + "00" + userInputElements[i].substring(1, 3));
            }

        } else if (userInputElements[i].length() == 2) {
            if (userInputElements[i].startsWith("0")) {//cases 00 or 01 etc no ambiguities

            } else if (!userInputElements[i].contains("0")) { //cases 56 64 etc

                if (userInputElements[i].charAt(0) != '1') {
                    possibleCombosFromCurrentElement.add(userInputElements[i].substring(0, 1) + "0" + userInputElements[i].substring(1, 2));
                } else {//else we don't want to do something ,15 cant have ambiguities
                }
            } else {//cases 50 6 
                try {
                    if (userInputElements[i + 1].length() == 1 && userInputElements[i].charAt(0) != '1') {// case 10 1 does not have ambiguities
                        possibleCombosFromCurrentElement.add(userInputElements[i].replace("0", ""));
                    }
                } catch (IndexOutOfBoundsException exception) {
                }
            }
        }
        possibleCombosFromCurrentElement.add(userInputElements[i]);
        return possibleCombosFromCurrentElement;
    }

    //this method runs every element through the ambiguity filter and stores the list of the ambiguity analysis
    //combinations of each element on a list 
    @Override
    public List<List<String>> processEachInputElement(String[] userInputElements) {
        List<List<String>> combinationStorage = new ArrayList<>();
        for (int i = 0; i < userInputElements.length; i++) {
            List<String> ambiguityElementAnalysis = new ArrayList<>();
            ambiguityElementAnalysis = ambiguityFilter(userInputElements, ambiguityElementAnalysis, i);
            combinationStorage.add(ambiguityElementAnalysis);
        }
        return combinationStorage;
    }
//this method takes the list that contains all the lists with the ambiguities analysis of each element of the input and returns a list 
//of various combinations that is the result of  the guava library cartesian product method that combines all the elements of each list with 
// the elements of the other lists to find all the possible combinations    

    @Override
    public List<List<String>> extractPossibleCombinations(List<List<String>> combinationStorage) {
        List<List<String>> combinationsAfterAmbiguities = new ArrayList<>();
        Lists.cartesianProduct(combinationStorage).forEach((list) -> {
            combinationsAfterAmbiguities.add(list);
        });
        return combinationsAfterAmbiguities;
    }

}
