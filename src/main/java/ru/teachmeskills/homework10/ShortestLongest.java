package ru.teachmeskills.homework10;

public class ShortestLongest {
    public static void main(String[] args) {
        String str = "Дана строка произвольной длинны";
        String[] words = str.split(" ");
        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word: words) {
            if (word.length()<shortestWord.length()){
                shortestWord=word;
            }
            else if(word.length()>=longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println("Самое короткое слово: " + shortestWord);
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
