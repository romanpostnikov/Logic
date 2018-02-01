public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.print(PunctuationCheck.removeRepeatedSymbol(arg) + " ");//checking every argument
        }
    }
}