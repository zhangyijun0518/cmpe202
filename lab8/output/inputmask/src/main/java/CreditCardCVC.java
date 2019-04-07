/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

    private IKeyEventHandler nextHandler ;
    private IKeyEventHandler prevHandler ;
    private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
    }   
    
    public void setPrev( IKeyEventHandler prev) {
        this.prevHandler = prev ;
    }

    public String display() {
        if ( cvc.equals("") )
            return "[***]" + "  " ;
        else
            return "[" + cvc + "]" + "  " ;
    }   

    public void key(String ch, int cnt) {
        if (ch.matches("x|X") ){
            if(cvc.length() > 0 && cnt >= 20 && cnt < 24 ){
                 cvc  = cvc.substring(0, cvc.length()-1);
            } else if (prevHandler != null){
                prevHandler.key(ch, cnt) ;
            }
        } 
        
        if (ch.matches("\\d") ){
            if ( cnt >= 21 && cnt <= 23){
                cvc += ch ;
            } else if ( nextHandler != null ){
                nextHandler.key(ch, cnt) ;
            }
        }   
    }   

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

}