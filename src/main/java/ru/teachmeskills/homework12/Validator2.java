package ru.teachmeskills.homework12;

import java.io.*;
import java.util.Scanner;
//Тестовый файл лежит в следующей директории и содержанием:
//C:\Users\rudya\OneDrive\Рабочий стол\Test.txt
//docnum123457890
//contract9012346
//213243456565660
//3434566
public class Validator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите директорию файла с номерами документов:");
        String filePath = scanner.nextLine();
        scanner.close();

        String validFilePath = "valid_report.txt";
        String invalidFilePath = "invalid_report.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validFilePath));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (Validate(line)) {
                    validWriter.write(line);
                    validWriter.newLine();
                } else { //наверно  тут можно как то изменить эту конструкцию на более краткую.
                    if (line.length() < 15) {
                        invalidWriter.write(line + " невалиден: Недостаточно символов");
                    } else {
                        invalidWriter.write(line + " невалиден: Некорректный префикс");
                    }
                    invalidWriter.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Файлы-отчеты успешно созданы:");
        System.out.println("Валидные номера документов: " + validFilePath);
        System.out.println("Невалидные номера документов: " + invalidFilePath);
    }

    public static boolean Validate(String docNumber) {
        if (docNumber.length() != 15) {
            return false;
        }
        String prefix = docNumber.substring(0, 8);
        return prefix.startsWith("docnum") || prefix.startsWith("contract");
    }
}