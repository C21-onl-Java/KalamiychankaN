package ru.teachmeskills.homework11.task1;

public class Starts555Exeption extends Exception {
    private static final String MESSAGE = "Не начинается с последовательности 555";

    public Starts555Exeption() {
        super(MESSAGE);
    }
}
