package model;

public class SleepingBag{
    private double price;
    private String name;

    public SleepingBag(double price, String name){
        this.price=price;
        this.name=name;
    }

    public double GetPrice(){
        return price;
    }

    public String GetName(){
        return name;
    }

    public void setPrice(double price){
        if (price<0){
            throw new IllegalArgumentException("Цена не может быть меньше 0 рублей");
        }
        this.price=price;
    }
}