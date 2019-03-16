package fiveguys;

import java.util.Date;
import java.text.SimpleDateFormat;

public class PrintFormat
{
    public String lines(){
        String out = "";
        for (int i = 0; i < 42; i++){
            out += "-";
        }
        out += "\n";
        return out;
    }
    
    public String time(){
        return this.OnCenter(
                new SimpleDateFormat("MM/d/yyyy hh:mm:ss").format(new Date());
    }
    
    public String Space(){
        return "\n";
    }
    
     public String pad(int num){
         String out = "";
         for (int i = 0; i < num; i++){
            out += " ";
        }
         return out;
    }
    
    public String OnCenter(String s){
        
    }
    
    public String OnRight(String s, double d){
        
    }
}
