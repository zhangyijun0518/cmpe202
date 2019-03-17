package fiveguys;

import java.util.ArrayList;

public class ReceiptPrint implements IPrintStrategy
{
    private BuildOrder order;
    private PrintFormat pf = new PrintFormat();
    
    public ReceiptPrint(BuildOrder newOrder){
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
            if (component instanceof Burger)
                out += this.getToppings(((Burger) component).getToppingList());
        }
        return out;
    };
    
    protected String printBill(){
        double tax = order.getTotal()*0.09;
        double total = order.getTotal()*1.09;
        double change = order.getCash() - total;
        
        String out = "";
        out += pf.pad(6) + "Sub. Total:" + pf.pad(17) + String.format("%.2f",order.getTotal()) + "\n";
        out += pf.pad(6) + "Tax:" + pf.pad(24) + String.format("%.2f",tax) + "\n";
        out += pf.pad(6) + "Total:" + pf.pad(22) + String.format("%.2f",total) + "\n";
        out += pf.Space();
        out += pf.pad(6) + "Cash $20"+ pf.pad(18) + "$" + String.format("%.2f",order.getCash()) + "\n";
        out += pf.pad(6) + "Change" + pf.pad(20) + "$" + String.format("%.2f",change) +"\n";
        return out;
    };
    
    protected String printEnd(){
        String out = "";
        out += "  Register:" + "1" + pf.pad(5) + "Tran Seq No:    " + "57845" + "\n";
        out += "  Cashier: Sakda* S.\n";
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
    
    protected String getToppings(ArrayList<Toppings> items){
        String out = "";
        for (Toppings item: items) {
            out += pf.pad(7) + item.getDiscription();
            out += "\n";
        }
        return out;
    }
    
    
}
