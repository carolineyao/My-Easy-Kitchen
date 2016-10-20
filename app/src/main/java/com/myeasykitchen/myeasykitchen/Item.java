package com.myeasykitchen.myeasykitchen;


public class Item {

    private String name;
    private String quantity;


    public Item(String name, String quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setQuantity(String quantity)
    {
        this.quantity =  quantity;
    }

    public String getName()
    {
        return this.name;
    }


    public String getQuantity() {
        return quantity;
    }
}
