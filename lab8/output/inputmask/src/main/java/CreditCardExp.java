/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

    private IKeyEventHandler nextHandler ;
    private IKeyEventHandler prevHandler ;
    private String date = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
    }   

    public void setPrev( IKeyEventHandler prev) {
        this.prevHandler = prev ;
    }
    
    public String display() {
        if ( date.equals("") )
            return "[MM/YY]" + "  " ;
        else {
           /* if (date.length() == 2){
                date = date + "/";
            }*/
            return "[" + date + "]" + "  " ;
        }
    }   

    public void key(String ch, int cnt) {
        if (ch.matches("x|X") ){
            if(date.length() > 0 && cnt >= 16 && cnt < 20 ){
                System.err.print("!!num!!!");
                 date  = date.substring(0, date.length()-1);
            } else if (prevHandler != null){
                System.err.print("prveHandler");
                prevHandler.key(ch, cnt) ;
            }
            if(prevHandler == null){System.err.print("!!!Null prveHandler!!!");}
        } 
        
        if (ch.matches("\\d") ){
            if ( cnt >= 17 && cnt <= 20){
                date += ch ;
            } else if ( nextHandler != null ){
                nextHandler.key(ch, cnt) ;
            }
        }   
    }

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

}