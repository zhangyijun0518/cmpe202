package fiveguys;

enum Position{Top, onMeat, Bottom}

public class Toppings implements IOrderComponent
{
    private String dscp;
    private Position position;  
    
    public Toppings(String Name, Position pos){
        dscp = Name;
        position = pos;
    }
    
    public Double getPrice(){return null;};
    
    public String getDiscription(){
        String out = "";
        if (position == Position.onMeat){
            out = "->|" + dscp;
        } else if (position == Position.Bottom)
        {
            out = "{{{{ " + dscp + " }}}}";
        } else {
            out = dscp;
        }
        return out;
    };
    
    public Integer getCount(){return null;};
    
    public Position getPosition(){
        return position;
    }
    
    
}
