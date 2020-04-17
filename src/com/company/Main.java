package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        assertMethod("codex", "codey");

        String aString = "012345";

        System.out.println("Length: " + aString.length());

        System.out.println("Symbol in 0 position: " + (aString.substring(0, aString.length() - 1)));

        int[][] array = new int[][]{{1}};
        System.out.println("array.length: " + array.length);
    }

    private static void assertMethod(String input, String expected) {
        String actual = changeXY(input);
        String status = actual.equals(expected) ?
                "OK" : "" +
                "FAIL expected '" + expected + "' but was: '" + actual + "'";
        System.out.println(status);
    }

    public static String changeXY(String input) {
        char[] chars = input.toCharArray();
        char[] result = new char[input.length()];
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'x') {
                result[index] = 'y';
            } else {
                result[index] = chars[index];
            }
        }
        return new String(result);
    }
}
