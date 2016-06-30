import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {

    private Vowels vowels;
    private String[] listOfVowels;

    @Before
    public void setUp() throws Exception {
        listOfVowels = new String[]{"a", "e", "i", "o", "u"};
        vowels = new Vowels(listOfVowels);
    }

    @Test
    public void shouldReturnTrueWhenAnyVowelIsPassed(){
        for(String letter : listOfVowels){
            assertTrue(vowels.isVowel(letter.charAt(0)));
        }
    }

    @Test
    public void shouldReturnTrueWhenisVowelIsPassedAVowel(){
        for(String letter : listOfVowels){
            char charLetter = letter.charAt(0);
            assertTrue(vowels.isVowel(charLetter));
        }
    }

    @Test
    public void shouldReturn50percentWhenPassedElla(){
        double percentage = vowels.percentageVowel("ella");
        assertEquals(.5, percentage,0.1);

    }

    @Test
    public void shouldReturn25PercentWhenPassedHard(){
        double percentage = vowels.percentageVowel("hard");
        assertEquals(.25, percentage,0.01);

    }

}