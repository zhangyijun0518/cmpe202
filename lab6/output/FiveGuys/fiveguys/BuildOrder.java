package fiveguys;

import java.util.ArrayList;

public class BuildOrder
{
    private Double subTotal = 0.00;
    private Double cash = 0.00;
    private ArrayList<IOrderComponent> orderItem;
    private static int orderNum = 0;
    
    public BuildOrder(){
        orderItem = new ArrayList<>();
        countOrder();
    }
    
    public static void countOrder(){
        orderNum += 1;
    }
    
    public void addItem(IOrderComponent component){
        orderItem.add(component);
        subTotal += component.getPrice();
    };
    
    public double getTotal(){
        return subTotal;
    } 
    
    public ArrayList<IOrderComponent> getItemList(){
        return orderItem;
    }
    
    public int getOrderNum(){
        return orderNum;
    }
    
    public double getCash(){
        return cash;
    }
    
    public void paid(double money){
        cash = money;
    }
}
