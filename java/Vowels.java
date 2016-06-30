public class Vowels {

    private String[] vowels;

    public Vowels(String[] vowels) {
        this.vowels = vowels;
    }

    public boolean isVowel(char letter) {
        for(String vowel : vowels){
            char charVowel = vowel.charAt(0);
            if(letter == charVowel){
                return true;
            }
        }
        return false;
    }

    public double percentageVowel(String input) {
        double vowelCount = 0;
        for(String vowel : vowels) {
            if (input.contains(vowel)) {
                vowelCount += 1;
            }
        }
        return vowelCount / input.length();
    }
}
