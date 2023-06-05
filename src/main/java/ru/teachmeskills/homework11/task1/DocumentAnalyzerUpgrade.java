package ru.teachmeskills.homework11.task1;

import java.util.Arrays;

public class DocumentAnalyzerUpgrade {
    public static void main(String[] args) {
        String documentNum = "1234-abc-5678-xyz-abxy";
        DocumentAnalyzerUpgrade.printFirstTwoBlocks(documentNum);
        DocumentAnalyzerUpgrade.printMaskedDocumentNumber(documentNum);
        DocumentAnalyzerUpgrade.printLowercaseLetters(documentNum);
        try {
            DocumentAnalyzerUpgrade.checkContainsSequence(documentNum, "abc");
            DocumentAnalyzerUpgrade.checkStartsWithSequence(documentNum, "555");
            DocumentAnalyzerUpgrade.checkEndsWithSequence(documentNum, "1a2b");
        } catch (ABCexeptiion abcExeptiion) {
            System.out.println(abcExeptiion.getMessage());
        } catch (Starts555Exeption starts555Exeption) {
            System.out.println(starts555Exeption.getMessage());
        } catch (EndsExeption1a2b exeption1a2b) {
            System.out.println(exeption1a2b.getMessage());
        }
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

    public static boolean checkContainsSequence(String documentNum, String sequence) throws ABCexeptiion {
        if (documentNum.toLowerCase().contains(sequence.toLowerCase())) {
            return true;
        }
        throw new ABCexeptiion();
    }

    public static boolean checkStartsWithSequence(String documentNumber, String sequence) throws Starts555Exeption {
        if (documentNumber.startsWith(sequence)) {
            return true;
        }
        throw new Starts555Exeption();
    }

    public static boolean checkEndsWithSequence(String documentNumber, String sequence) throws EndsExeption1a2b {
        if (documentNumber.endsWith(sequence)) {
            return true;
        }
        throw new EndsExeption1a2b();
    }
}
