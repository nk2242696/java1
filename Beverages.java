package org.hashmap;

public class Beverages{
    private  Type type;
    private SubType subType;
    private int id;
    private String Name;
    private int price;
    private int tax;
    public int getid()
    {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getTax() {
        return tax;
    }
    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public SubType getSubType() {
        return subType;
    }

    public Type getType() {
        return type;
    }

    public Beverages(Type type, SubType subType, int id, String name, int price, int tax) {
        this.type = type;
        this.subType = subType;
        this.id = id;
        Name = name;
        this.price=price;
        this.tax = tax;
    }
}
