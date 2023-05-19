package ru.teachmeskills.homework07.AccDoc.GoodsContract;

import ru.teachmeskills.homework07.AccDoc.AbstractDocument.AbstractDocument;

import java.util.Date;

public class GoodsContract extends AbstractDocument {
    private String goodsType;
    private int goodsQuantity;

    public GoodsContract(String documentNumber, Date documentDate, String goodsType, int goodsQuantity) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Goods Contract Information:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Goods Type: " + goodsType);
        System.out.println("Goods Quantity: " + goodsQuantity);
    }
}