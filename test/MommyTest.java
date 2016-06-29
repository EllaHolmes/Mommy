import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MommyTest {

    @Test
    public void shouldReturnEmptyStringWhenInputIsEmptyString(){
        Mommy mommy=new Mommy("");
        String output=mommy.outputMommifiedString();
        assertTrue("".equals(output));
    }

    @Test
    public void shouldReturnYWhenInputIsY(){
        Mommy mommy=new Mommy("Y");
        String output=mommy.outputMommifiedString();
        assertEquals("Y", output);
    }

    @Test
    public void shouldReturnMommyWhenInputIsA(){
        Mommy mommy=new Mommy("a");
        String output=mommy.outputMommifiedString();
        assertTrue("mommy".equals(output));
    }

    @Test
    public void shouldReturnMommyWhenInputIsAA(){
        Mommy mommy=new Mommy("aa");
        String output=mommy.outputMommifiedString();
        assertTrue("mommy".equals(output));
    }

    @Test
    public void shouldReturnMommyWhenInputIsAAA(){
        Mommy mommy=new Mommy("aaa");
        String output=mommy.outputMommifiedString();
        assertTrue("mommy".equals(output));
    }

    @Test
    public void shouldReturnMommyWhenInputIsE(){
        Mommy mommy=new Mommy("e");
        String output=mommy.outputMommifiedString();
        assertTrue("mommy".equals(output));
    }

    @Test
    public void shouldReturnMommyWhenInputIsI(){
        Mommy mommy=new Mommy("i");
        String output=mommy.outputMommifiedString();
        assertTrue("mommy".equals(output));
    }
}
