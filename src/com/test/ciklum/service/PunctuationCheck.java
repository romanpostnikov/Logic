package com.test.ciklum.service;

public class PunctuationCheck {

    public static String removeRepeatedSymbol(String initialString){

        StringBuilder initialStringBuilder = new StringBuilder();
        initialStringBuilder.append(initialString);
        int bracketCounter = 0;
        char repeatedCharacter = ')';

        for (int i = 0; i < initialStringBuilder.length(); i++) {
            if (initialStringBuilder.charAt(i) == repeatedCharacter){
                bracketCounter++;
                if (bracketCounter > 1){
                    initialStringBuilder.deleteCharAt(i);
                    i--;
                }
            }
        }

        return initialStringBuilder.toString();
    }
}
