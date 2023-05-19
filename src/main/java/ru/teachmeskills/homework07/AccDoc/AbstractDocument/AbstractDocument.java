package ru.teachmeskills.homework07.AccDoc.AbstractDocument;

import ru.teachmeskills.homework07.AccDoc.Document.Document;

import java.util.Date;

public abstract class AbstractDocument implements Document {
    protected String documentNumber;
    protected Date documentDate;

    public AbstractDocument(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
    public AbstractDocument(){
    }
}