import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MommyTest {

    private Mommy mommy;
    PrintStream printStream;

    @Before
    public void setUp(){
        Vowels vowels = new Vowels(new String[]{"a", "e", "i", "o", "u"});
        //Vowels vowels = mock(Vowels.class);
        printStream = new PrintStream(System.out);
        //printStream = mock(PrintStream.class);
        mommy = new Mommy(vowels, 0.3, printStream);
    }

    @Test
    public void shouldReturnEmptyStringWhenInputIsEmptyString(){
        String output= mommy.mommifyString("");
        assertEquals("",output);
    }

    @Test
    public void shouldReturnYWhenInputIsY(){
        String output= mommy.mommifyString("Y");
        assertEquals("Y", output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsA(){
        String output= mommy.mommifyString("a");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsE(){
        String output= mommy.mommifyString("e");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsI(){
        String output= mommy.mommifyString("i");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsO(){
        String output= mommy.mommifyString("o");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsU(){
        String output= mommy.mommifyString("u");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsAA(){
        String output= mommy.mommifyString("aa");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsAAA(){
        String output= mommy.mommifyString("aaa");
        assertEquals("mommy",output);
    }

    @Test
    public void shouldReturnMommyNMommyWhenInputIsAna(){
        String output= mommy.mommifyString("ana");
        assertEquals("mommynmommy",output);
    }

    @Test
    public void shouldReturnHardWhenInputIsHard(){
        String output= mommy.mommifyString("hard");
        assertEquals("hard",output);
    }
}
