package model;

public abstract class Rent{

    private final String owner;
    private final double price;
    private final String Category;

    private SleepingBag isSleepingBag=null;

    public Rent(String name, double price, String category){
        this.owner=name;
        this.price=price;
        this.Category=category;
    }

    public Rent(String name, double price){
        this(name, price, "Small");
    }
    public double getKoficient(){
        if (Category=="Small"){
            return 1.0;
        }
        if (Category=="Medium"){
            return 1.6;
        }
        if (Category=="Large"){
            return 2.30;
        }
        return 1.0;
    }

    public void addBag(SleepingBag b){
        this.isSleepingBag=b;
    }

    public void addBag(SleepingBag b, boolean warm){
        this.isSleepingBag=b;
        b.setPrice(b.GetPrice()*1.5);
    }

    public abstract double cost();

    public String Getname(){
        return owner;
    }
    public double Getprice(){
        return price;
    }
    public String Getcategory(){
        return Category;
    }
    public SleepingBag GetBags(){return isSleepingBag; }

}