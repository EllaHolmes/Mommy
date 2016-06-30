import java.io.PrintStream;

public class Mommy {

    private Vowels vowels;
    private PrintStream printStream;
    private double percentageThreshold;

    public Mommy(Vowels vowels, double percentageThreshold, PrintStream printStream) {
        this.vowels = vowels;
        this.percentageThreshold = percentageThreshold;
        this.printStream = printStream;
    }

    public String mommifyString(String input) {

        if(vowels.percentageVowel(input) >= percentageThreshold){
            String answer = replaceVowelsWithMommy(input);
            printStream.print(answer);
            return answer;
        }

        printStream.print(input);
        return input;
    }

    private String replaceVowelsWithMommy(String input) {

        String answer = "";
        boolean previousVowel = false;
        for(char letter : input.toCharArray()){
            if(vowels.isVowel(letter)){
                if(previousVowel == false){
                    previousVowel = true;
                    answer += "mommy";
                }
            }else{
                previousVowel = false;
                answer += letter;
            }
        }
        return answer;
    }

}
