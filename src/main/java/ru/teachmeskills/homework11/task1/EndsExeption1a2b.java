package ru.teachmeskills.homework11.task1;

public class EndsExeption1a2b extends Exception {
    private static final String MESSAGE = "Не заканчивается на последовательность 1a2b";

    public EndsExeption1a2b() {
        super(MESSAGE);
    }
}
