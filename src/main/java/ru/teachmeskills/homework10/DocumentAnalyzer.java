package ru.teachmeskills.homework10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DocumentAnalyzer {
    public static void main(String[] args) {
        String documentNum = "1234-abc-5678-xyz-abxy";
        DocumentAnalyzer.printFirstTwoBlocks(documentNum);
        DocumentAnalyzer.printMaskedDocumentNumber(documentNum);
        DocumentAnalyzer.printLowercaseLetters(documentNum);
        DocumentAnalyzer.checkContainsSequence(documentNum, "abc");
        DocumentAnalyzer.checkStartsWithSequence(documentNum, "555");
        DocumentAnalyzer.checkEndsWithSequence(documentNum, "1a2b");
    }

    public static void printFirstTwoBlocks(String documentNum) {
        String[] blocks = documentNum.split("-");
        System.out.println(blocks[0] + " " + blocks[2]);
    }

    public static void printMaskedDocumentNumber(String documentNum) {
        String[] blocks = documentNum.split("-");
        String word = blocks[0];

        for (int i = 1; i < blocks.length; i++) {
            if (blocks[i].length() <= 3) {
                blocks[i] = blocks[i].replace(blocks[i], "***");
            }
        }
        System.out.println(Arrays.toString(blocks));
    }

    public static void printLowercaseLetters(String documentNum) {
        StringBuilder lowercaseLetters = new StringBuilder();
        for (char c : documentNum.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseLetters.append(c);
            }
        }
        String formattedLetters = lowercaseLetters.toString().replaceAll("(...)(?!$)", "$1/");
        System.out.println(formattedLetters.toLowerCase());
    }

    public static void checkContainsSequence(String documentNum, String sequence) {
        if (documentNum.toLowerCase().contains(sequence.toLowerCase())) {
            System.out.println("Содержит последовательность " + sequence);
        }
        else {
            System.out.println("Не содержит последовательности: " + sequence);
        }
    }

    public static void checkStartsWithSequence(String documentNumber, String sequence) {
        if (documentNumber.startsWith(sequence)) {
            System.out.println("Начинается с последовательности: " + sequence);
        } else {
            System.out.println("Не начинается с последовательности: " + sequence);
        }
    }

    public static void checkEndsWithSequence(String documentNumber, String sequence) {
        if (documentNumber.endsWith(sequence)) {
            System.out.println("Заканчивается последовательностью: " + sequence);
        } else {
            System.out.println("Не заканчивается последовательностью: " + sequence);
        }
    }
}
