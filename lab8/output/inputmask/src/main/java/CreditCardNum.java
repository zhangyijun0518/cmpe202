/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

    private IKeyEventHandler nextHandler ;
    private IKeyEventHandler prevHandler ;
    private String number = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
    }   
    
    public void setPrev( IKeyEventHandler prev) {
        this.prevHandler = prev ;
    }

    public String display() {
        if ( number.equals("") )
            return "[4444 4444 4444 4444]" + "  " ;
        else{
          /*  int i = number.length();
            if (i == 4 || i == 9 || i == 14){
                number = number + " ";
            } */
            return "[" + number + "]" + "  " ;
        }
    }   

    public void key(String ch, int cnt) {
        if (ch.matches("x|X") ){
            if(number.length() > 0 && cnt < 16){
                number = number.substring(0, number.length()-1);
            } else if (prevHandler != null){
                prevHandler.key(ch, cnt) ;
            }
        } 
        
        if (ch.matches("\\d") ){
            if (cnt <= 16){
                number += ch ;
            } else if ( nextHandler != null ){
	       nextHandler.key(ch, cnt) ;
	    }
	}
    }	

    public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}