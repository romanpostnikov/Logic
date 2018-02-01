package com.test.ciklum;

import static com.test.ciklum.service.PunctuationCheck.removeRepeatedSymbol;

public class Main {
    public static void main(String[] args) {
        String test = "happy new year)))))))";
        System.out.print(removeRepeatedSymbol(test));
    }
}
