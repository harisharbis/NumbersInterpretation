/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Haris
 */
public interface ambiguities {
    public  List<String> ambiguityFilter(String[] userInputElements,List<String> possibleCombosFromCurrentElement,int i );
    public  List<List<String>> processEachInputElement(String[] userInputElements);
    public  List<List<String>> extractPossibleCombinations(List<List<String>> combinationStorage);
}
