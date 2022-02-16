package Morsecode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class morseCodeTest {

    @Test
    public void morseConverterS() {
        Converter converter = new Converter();

        String testdata = "S";

        String actual = converter.toMorse(testdata);

        assertEquals("*** ", actual);

    }

    @Test
    public void morseConverterE() {
        Converter converter = new Converter();

        String testdata = "E";

        String actual = converter.toMorse(testdata);

        assertEquals("* ", actual);

    }

    @Test
    public void morseConverterMorseSign() {
        Converter converter = new Converter();

        String letter = "**";

        String actual = converter.toLetter(letter);

        assertEquals("I", actual);


    }

    @Test
    public void correctSplit() {
        Converter converter = new Converter();

        String letter = "HE";
        String actual = converter.toMorse(letter);

        assertEquals("**** * ", actual);


    }

    @Test
    public void invalidCharacter() {
        Converter converter = new Converter();

        String letter = "@@";
        String actual = converter.toMorse(letter);

        assertEquals("null null ", actual);


    }
}