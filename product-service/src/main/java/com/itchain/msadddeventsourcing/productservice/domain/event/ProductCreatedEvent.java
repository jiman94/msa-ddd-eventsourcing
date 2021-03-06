package com.itchain.msadddeventsourcing.productservice.domain.event;

import com.itchain.msadddeventsourcing.productservice.common.Event;
import lombok.Getter;

@Getter
public class ProductCreatedEvent implements Event {

    private String id;
    private String productName;
    private String description;
    private int price;
    private int stock;
    private int sales;

    public ProductCreatedEvent(String productId, String productName, String description, int price, int stock, int sales) {
        this.id = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.sales = sales;
    }

    @Override
    public String getID() {
        return id;
    }
}
