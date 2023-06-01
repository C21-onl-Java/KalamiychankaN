package ru.teachmeskills.homework11.task1;

public class ABCexeptiion extends Exception {
    private static final String MESSAGE = "Не содержит последовательность abc";

    public ABCexeptiion() {
        super(MESSAGE);
    }
}
