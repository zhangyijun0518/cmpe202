package fiveguys;

public class ReceiptPrint implements IPrintStrategy
{
    private BuildOrder order;
    private printFormat pf = new printFormat();
    
    public ReceiptPrint(BuildOrder newOrder){
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
        out += "  Order Number: " + order.getOrderNum();
        out += pf.time();
        out += pf.OnCenter("FIVE GUYS");
        out += pf.Space();
        out += pf.Space();
        return out;
    };
    
    protected String printOrderDetails(){
        String out = "";
        out += "Sandwich# 1\n";
        out +=
        out += 
        return out;
    };
    
    
    protected String printEnd(){
        String out = "";
        out += "  Register:" + "1" + pf.OnRight("Tran Seq No:   ", 57845);
        out += "Cashier: Sakda* S.";
        out += "\n";
       return out;
    };
}
