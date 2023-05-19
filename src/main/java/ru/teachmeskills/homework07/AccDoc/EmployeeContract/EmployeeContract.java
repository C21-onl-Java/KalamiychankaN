package ru.teachmeskills.homework07.AccDoc.EmployeeContract;

import ru.teachmeskills.homework07.AccDoc.AbstractDocument.AbstractDocument;

import java.util.Date;

public class EmployeeContract extends AbstractDocument {
    private Date contractEndDate;
    private String employeeName;

    public EmployeeContract(String documentNumber, Date documentDate, Date contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Contract Information:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Contract End Date: " + contractEndDate);
        System.out.println("Employee Name: " + employeeName);
    }
}
