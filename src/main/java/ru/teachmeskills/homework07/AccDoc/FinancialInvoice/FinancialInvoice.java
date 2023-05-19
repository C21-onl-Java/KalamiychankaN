package ru.teachmeskills.homework07.AccDoc.FinancialInvoice;

import ru.teachmeskills.homework07.AccDoc.AbstractDocument.AbstractDocument;

import java.util.Date;

public class FinancialInvoice extends AbstractDocument {
    private double totalAmount;
    private String departmentCode;

    public FinancialInvoice(String documentNumber, Date documentDate, double totalAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }

    @Override
    public void displayInfo() {
        System.out.println("Financial Invoice Information:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Department Code: " + departmentCode);
    }
}
