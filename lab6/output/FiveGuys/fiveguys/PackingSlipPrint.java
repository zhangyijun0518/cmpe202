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
        out += printBill();
        out += printEnd();
        out += pf.lines();
        return out;    
    };
    
    protected String printHeader(){
        String out = "";
        out += pf.OnCenter("FIVE GUYS");
        out += pf.OnCenter("BURGER AND FRIES");
        out += pf.OnCenter("STORE # CA-1294");
        out += pf.OnCenter("5353 ALMADEN EXPY N60");
        out += pf.OnCenter("SAN JOSE, CA 95118");
        out += pf.OnCenter("(P) 408-274-9300");
        out += pf.Space();
        out += pf.Space();
        out += pf.time();
        out += pf.Space();
        out += pf.OnCenter("FIVE GUYS");
        out += "  Order Number: " + order.getOrderNum();
        out += "\n";
        return out;
    };
    
    protected String printOrderDetails(){
        String out = "";
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
    
    protected String printBill(){
        double tax = order.getTotal()*0.09;
        double total = order.getTotal()*1.09;
        double change = order.getCash() - total;
        
        String out = "";
        out += pf.pad(6) + "Sub. Total:" + pf.pad(16) + order.getTotal() + "\n";
        out += pf.pad(6) + "Tax:" + pf.pad(16) + tax + "\n";
        out += pf.pad(6) + "Total:" + pf.pad(23) + total + "\n";
        out += pf.Space();
        out += pf.pad(6) + "Cash $20"+ pf.pad(22) + "$" + order.getCash() + "\n";
        out += pf.pad(6) + "Change" + pf.pad(20) + "$" + change;
        return out;
    };
    
    protected String printEnd(){
        String out = "";
        out += "  Register:" + "1" + pf.pad(5) + "Tran Seq No:   " + "57845" + "\n";
        out += "Cashier: Sakda* S.";
        out += pf.OnCenter("************************************");
        out += pf.OnCenter("Don't throw away your receipt!!!");
        out += pf.Space();
        out += pf.OnCenter("Help Five Guys and you could win!");
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
