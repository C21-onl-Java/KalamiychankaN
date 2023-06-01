package ru.teachmeskills.homework11.task2;

public class Main {
    public static void main(String[] args) {
        String login = "mylogin";
        String password = "mypassword1";
        String confirmPassword = "mypassword1";
        System.out.println(UserValidator.validate(login, password, confirmPassword));
    }
}