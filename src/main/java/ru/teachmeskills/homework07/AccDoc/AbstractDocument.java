package ru.teachmeskills.homework07.AccDoc;

import java.util.Date;

public abstract class AbstractDocument implements Document {
    protected String documentNumber;
    protected Date documentDate;

    public AbstractDocument(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}