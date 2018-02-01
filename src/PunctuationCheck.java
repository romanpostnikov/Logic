public class PunctuationCheck {

    /* 1. Logic
     * Злой клоун хочет, чтобы в смайликах не было
     * больше одной скобки подряд. Напишите функцию,
     * которая поможет ему в этом, для любой фразы.
     * Программа должна уметь читать строки из коммандной
     * строки и выводить отформатированную обратно.
     */
    public static String removeRepeatedSymbol(String initialString){

        StringBuilder initialStringBuilder = new StringBuilder();
        initialStringBuilder.append(initialString);
        int bracketCounter = 0;
        char repeatedCharacter = ')';

        for (int i = 0; i < initialStringBuilder.length(); i++) {
            if (initialStringBuilder.charAt(i) == repeatedCharacter){
                bracketCounter++;

                if (bracketCounter > 1){
                    initialStringBuilder.deleteCharAt(i);//Deletes symbols if there are more than one
                    i--;
                }
            }
        }

        return initialStringBuilder.toString();
    }
}