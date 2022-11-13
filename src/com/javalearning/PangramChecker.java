package com.javalearning;

public class PangramChecker {
    public static void main(String[] args) {
        check("The quick brown fox jumps over the lazy dog");
    }
    public static boolean check(String sentence){
        String noSpaces = sentence.replaceAll("\\s+", "");
        boolean isPangram = false;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!noSpaces.toLowerCase().contains("" + c)) {
                isPangram = false;
                break;
            } else isPangram = true;
        }
        return isPangram;
    }
}
