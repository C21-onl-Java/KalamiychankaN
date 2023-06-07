import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//Тестовый файл лежит в следующей директории и содержанием:
//C:\Users\rudya\OneDrive\Рабочий стол\Test.txt
//docnum123457890
//contract9012346
//213243456565660
//3434566
public class Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String filePath = scanner.nextLine();
        scanner.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (Validate(line)) {
                    System.out.println(line + " валиден");
                } else {
                    System.out.println(line + " не валиден");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean Validate(String docNumber) {
        if (docNumber.length() != 15) {
            return false;
        }String prefix = docNumber.substring(0, 8);
        return prefix.startsWith("docnum") || prefix.startsWith("contract");
    }
}