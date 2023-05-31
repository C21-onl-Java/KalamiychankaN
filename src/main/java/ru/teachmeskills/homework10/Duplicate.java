package ru.teachmeskills.homework10;

public class Duplicate {
    public static void main(String[] args) {
        String input = "Hello";
        String duplicatedString = duplicateLetters(input);
        System.out.println(duplicatedString);
    }

    public static String duplicateLetters(String input) {
        StringBuilder duplicatedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            duplicatedString.append(letter).append(letter);
        }
        return duplicatedString.toString();
    }
}