package fiveguys;

import java.util.ArrayList;

public class PackingSlipPrint implements IPrintStrategy
{
    private BuildOrder order;
    private PrintFormat pf = new PrintFormat();
    
    public PackingSlipPrint(BuildOrder newOrder){
        order = newOrder;
    }
    
    public String print(){
        String out = "";
        out += pf.lines();
        out += printHeader();
        out += printOrderDetails();
        out += printEnd();
        out += pf.lines();
        return out;    
    };
    
    protected String printHeader(){
        String out = "";
        out += "  Order Number: " + order.getOrderNum() + "\n";
        out += pf.time();
        out += pf.OnCenter("FIVE GUYS");
        out += pf.Space();
        out += pf.Space();
        return out;
    };
    
    protected String printOrderDetails(){
        String out = "";
        out += "  Sandwich# 1\n";
        for (IOrderComponent component: order.getItemList()){
            out += this.getItem(component);
            if (component instanceof Burger){
                ArrayList<Toppings> items = ((Burger) component).getToppingList();
                out += this.getToppings(items, Position.Top);
                out += this.getToppings(items, Position.onMeat);
                out += this.getToppings(items, Position.Bottom);
            }
        }
        return out;
    };
    
    
    protected String printEnd(){
        String out = "";
        out += "  Register:" + "1" + pf.pad(5) ;
        out += "Tran Seq No:"+ pf.pad(4) + "57845" + "\n";
        out += "  Cashier: Sakda* S.";
        out += "\n";
       return out;
    };
    
    protected String getItem(IOrderComponent item){
        String out = "";
        out += pf.pad(2) + item.getCount();
        out += pf.pad(3) + item.getDiscription();
        out += pf.pad(21) + item.getPrice() + "\n";
        return out;
    }
    

    protected String getToppings(ArrayList<Toppings> items, Position pos){
        String out = "";
        for (Toppings item: items) {
            if (item.getPosition() == pos){
                out += pf.pad(7) + item.getDiscription();
                out += "\n";
            }
        }
        return out;
    }
}
