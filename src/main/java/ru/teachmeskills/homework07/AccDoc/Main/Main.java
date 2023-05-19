package ru.teachmeskills.homework07.AccDoc.Main;

import ru.teachmeskills.homework07.AccDoc.EmployeeContract.EmployeeContract;
import ru.teachmeskills.homework07.AccDoc.FinancialInvoice.FinancialInvoice;
import ru.teachmeskills.homework07.AccDoc.GoodsContract.GoodsContract;
import ru.teachmeskills.homework07.AccDoc.Register.Register;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        GoodsContract goodsContract = new GoodsContract("GC001", new Date(), "Electronics", 100);
        register.saveDocument(goodsContract);
        register.displayDocumentInfo(goodsContract);
        System.out.println();

        EmployeeContract employeeContract = new EmployeeContract("EC001", new Date(), new Date(), "John Doe");
        register.saveDocument(employeeContract);
        register.displayDocumentInfo(employeeContract);
        System.out.println();

        FinancialInvoice financialInvoice = new FinancialInvoice("FI001", new Date(), 5000.0, "DEP001");
        register.saveDocument(financialInvoice);
        register.displayDocumentInfo(financialInvoice);
    }
}