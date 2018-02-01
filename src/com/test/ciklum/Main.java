package com.test.ciklum;

public class Main {
    public static void main(String[] args) {
        StringBuilder kole = new StringBuilder();
        kole.append("happy hannukah)))))");
        int bracketCounter = 0;

        for (int i = 0; i < kole.length(); i++) {
            if (kole.charAt(i) == ')'){
                bracketCounter++;
                if (bracketCounter > 1){
                    kole.deleteCharAt(i);
                    i--;
                }
            }

        }

        System.out.println(kole);

    }
}
