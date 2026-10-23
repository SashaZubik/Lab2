package model;

public class CorporateRent extends Rent{
    private int orders;

    public CorporateRent(String owner, double price, String Category, int orders){
        super(owner, price, Category);
        this.orders=orders;
    }

    public CorporateRent(String owner, double price){
        super(owner, price, "Small");
    }

    public double cost(){
        double Cost=Getprice()*getKoficient();
        if (GetBags()!=null){ //есть ли он
            Cost=Cost+GetBags().GetPrice();
        }
        Cost=orders*Cost;
        return Cost;
    }
}