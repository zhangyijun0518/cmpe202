package fiveguys;

import java.util.Date;
import java.text.SimpleDateFormat;

public class PrintFormat
{    
    int width = 40;
    
    public String lines(){
        String out = "";
        for (int i = 0; i < width; i++){
            out += "-";
        }
        out += "\n";
        return out;
    }
    
    public String time(){
        return this.OnCenter(
                new SimpleDateFormat("MM/d/yyyy hh:mm:ss").format(new Date())
        );
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
        if (s.length()>= width)
            return s;
        int pad = width - s.length();
        String out = "";
        out += pad(pad/2) + s + pad(pad - pad/2);
        out += "\n";
        return out;
    }
}
