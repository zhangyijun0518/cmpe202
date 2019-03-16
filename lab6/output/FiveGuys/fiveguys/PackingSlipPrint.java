package fiveguys;

public class PackingSlipPrint implements IPrintStrategy
{
    private BuildOrder order;
    private printFormat pf = new printFormat();
    
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
        out += order.
        return out;
    };
    
    protected String printBill(){
        double tax = order.getTotal()*0.09;
        double total = order.getTotal()*1.09;
        double change = order.getCash() - total;
        
        String out = "";
        out += pf.pad(6) + "Sub. Total:" + pf.OnRight("", order.getTotal());
        out += pf.pad(6) + "Tax:" + pf.OnRight("", tax);
        out += pf.pad(6) + "Total:" + pf.OnRight("", total);
        out += pf.Space();
        out += pf.pad(6) + "Cash $20" + pf.OnRight("$", order.getCash());
        out += pf.pad(6) + "Change" + pf.OnRight("$", change);
        return out;
    };
    
    protected String printEnd(){
        String out = "";
        out += "  Register:" + "1" + pf.OnRight("Tran Seq No:   ", 57845);
        out += "Cashier: Sakda* S.";
        out += pf.onCenter("******************************");
        out += pf.onCenter("Don't throw away your receipt!!!");
        out += pf.Space();
        out += pf.onCenter("Help Five Guys and you could win!");
        return out;
    };
}
