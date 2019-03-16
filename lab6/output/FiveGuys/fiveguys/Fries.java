package fiveguys;


public class Fries implements IOrderComponent
{
    private double price = 0.00;
    private int count;
    private String dscp;
    
    public Fries(String Name, double Price, int num){
        price = Price;
        count = num;
        dscp = Name;
    }
    
        public Fries(String Name, double Price){
        price = Price;
        count = 1;
        dscp = Name;
    }
    
    public Double getPrice(){return count*price;};
    
    public String getDiscription(){return dscp;};
    
    public Integer getCount(){return count;};
   
}
