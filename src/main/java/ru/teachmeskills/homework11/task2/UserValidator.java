package ru.teachmeskills.homework11.task2;

public class UserValidator {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Неверный логин");
            }
            if (password.length() >= 20 || password.contains(" ") || !containsDigit(password)) {
                throw new WrongPasswordException("Неверный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    //было бы проще тут применить регулярное выражение, тогда бы можно было обойтись без этого метода.
    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}