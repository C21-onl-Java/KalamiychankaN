package ru.teachmeskills.homework10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите номер слова для проверки: ");
        int wordIndex = scanner.nextInt();

        String[] words = inputString.split("\\s+");

        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: указан некорректный номер слова.");
            return;
        }

        String selectedWord = words[wordIndex - 1];

        boolean isPalindrome = checkPalindrome(selectedWord);
        if (isPalindrome) {
            System.out.println("Выбранное слово '" + selectedWord + "' является палиндромом.");
        } else {
            System.out.println("Выбранное слово '" + selectedWord + "' не является палиндромом.");
        }
    }

    //решил отказаться от метода equals потому что выглядит очень громоздко
    private static boolean checkPalindrome(String selectedWord) {
        int left = 0;
        int right = selectedWord.length() - 1;

        while (left < right) {
            if (selectedWord.charAt(left) != selectedWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}