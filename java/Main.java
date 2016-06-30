import java.io.PrintStream;

public class Main {

    public static void main(String[] args){
        Vowels vowels = new Vowels(new String[]{"a", "e", "i", "o", "u"});
        PrintStream printStream = new PrintStream(System.out);
        double percentageThreshold = 0.3;
        Mommy mommy = new Mommy(vowels, percentageThreshold, printStream);
        mommy.mommifyString(args[0]);
    }
}
