public class Mommy {
    private String input;
    private char[] vowels={'a','e','i','o','u'};

    public Mommy(String input) {
        this.input = input;
    }

    public String outputMommifiedString() {
        if(containsVowel()){
            return "mommy";
        }
        return input;
    }

    public boolean containsVowel(){
        for(int i=0;i<vowels.length;i++){
//            if(input.contains((String)vowels[i]))

        }
            return true;
        return false;
    }
}
