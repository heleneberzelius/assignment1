package Morsecode;


import java.util.HashMap;

public class Converter {

    private HashMap<String, String> morseCodes;

    public Converter() {

        morseCodes = new HashMap<String, String>();

        morseCodes.put("A", "*-");
        morseCodes.put("B", "-***");
        morseCodes.put("C", "-*-*");
        morseCodes.put("D", "-**");
        morseCodes.put("E", "*");
        morseCodes.put("F", "**-*");
        morseCodes.put("G", "--*");
        morseCodes.put("H", "****");
        morseCodes.put("I", "**");
        morseCodes.put("J", "*---");
        morseCodes.put("K", "-*-");
        morseCodes.put("L", "*-**");
        morseCodes.put("M", "--");
        morseCodes.put("N", "-*");
        morseCodes.put("O", "---");
        morseCodes.put("P", "*--*");
        morseCodes.put("Q", "--*-");
        morseCodes.put("R", "*-*");
        morseCodes.put("S", "***");
        morseCodes.put("T", "-");
        morseCodes.put("U", "**-");
        morseCodes.put("V", "***-");
        morseCodes.put("W", "*--");
        morseCodes.put("X", "-**-");
        morseCodes.put("Y", "-*--");
        morseCodes.put("Z", "--**");
        morseCodes.put("1", "*----");
        morseCodes.put("2", "**---");
        morseCodes.put("3", "***--");
        morseCodes.put("4", "****-");
        morseCodes.put("5", "*****");
        morseCodes.put("6", "-****");
        morseCodes.put("7", "--***");
        morseCodes.put("8", "---**");
        morseCodes.put("9", "----*");
        morseCodes.put("0", "-----");


    }

    public String getMorseCode(String letter) {

        return morseCodes.get(letter);
    }

    public String toMorse(String testdata) {

        testdata = testdata.toUpperCase(); //detta är en felhantering
        String morse = "";
        String[] ToMorse = testdata.split("");


        for (int x = 0; x < ToMorse.length; x++) {

            morse = morse + morseCodes.get(ToMorse[x]) + " ";


        }
        return morse;


    }

    public String toLetter(String letter) {
        String letters = "";
        String[] myLetter = letter.split("\\s+");

        for (int i = 0; i < myLetter.length; i++) {
            for (HashMap.Entry<String, String> entry : morseCodes.entrySet()) {
                if (myLetter[i].equals(entry.getValue())) {
                    letters = letters + entry.getKey();
                }


            }
        }
        return letters;
    }

}











