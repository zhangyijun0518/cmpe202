package fiveguys;

import java.util.ArrayList;

public class Burger implements IOrderComponent 
{   
    private double price = 0.00;
    private int count;
    private String dscp;
    private ArrayList<Toppings> toppings;
    
    public Burger(String burName, double burPrice, int num){
        toppings = new ArrayList<>();
        price = burPrice;
        count = num;
        dscp = burName;
    }
    
    public Burger(String burName, double burPrice){
        toppings = new ArrayList<>();
        price = burPrice;
        count = 1;
        dscp = burName;
    }
    
    public Double getPrice(){return count*price;};
    
    public String getDiscription(){return dscp;};
    
    public Integer getCount(){return count;};
    
    public ArrayList<Toppings> getToppingList(){ return toppings; };
    
    public void addToppings(Toppings tpp){
        toppings.add(tpp);
    }
}
