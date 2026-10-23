package model;

public class UserRent extends Rent{
    public UserRent(String owner, double price, String Category){
        super(owner, price, Category);
    }
    public UserRent(String owner, double price){
        super(owner, price, "Small");
    }
    public double cost(){
        double Cost=Getprice()*getKoficient();
        if (GetBags()!=null){ //есть ли он
            Cost=Cost+GetBags().GetPrice();
        }
        return Cost;
    }
}