package ru.teachmeskills.homework10;

public class MinWord {
    public static void main(String[] args) {
        String input = "fffff ab f 1234 jkjk";
        String[] words = input.split("\\s+");

        String minDistinctWord = null;
        int minDistinctCount = Integer.MAX_VALUE;

        for (String word : words) {
            int distinctCount = countDistinctCharacters(word);

            if (distinctCount < minDistinctCount) {
                minDistinctCount = distinctCount;
                minDistinctWord = word;
            }
        }

        System.out.println("Слово с минимальным числом различных символов: " + minDistinctWord);
    }

    private static int countDistinctCharacters(String word) {
        int distinctCount = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                distinctCount++;
            }
        }

        return distinctCount;
    }
}