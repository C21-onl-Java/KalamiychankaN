package ru.teachmeskills.homework07.AccDoc.Register;

import ru.teachmeskills.homework07.AccDoc.Document.Document;

public class Register {
    private Document[] documents;
    private int currentIndex;

    public Register() {
        documents = new Document[10];
        currentIndex = 0;
    }

    public void saveDocument(Document document) {
        if (currentIndex < documents.length) {
            documents[currentIndex] = document;
            currentIndex++;
            System.out.println("Document saved in the register.");
        } else {
            System.out.println("Register is full. Cannot save more documents.");
        }
    }

    public void displayDocumentInfo(Document document) {
        document.displayInfo();
    }
}