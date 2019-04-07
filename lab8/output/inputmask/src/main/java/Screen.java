/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.* ;
import java.util.Stack ;

public class Screen implements IScreen, IDisplayComponent
{
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private Stack <IDisplayComponent> reverseComp = new Stack <IDisplayComponent>() ;
    private IKeyEventHandler chain ;
    private IKeyEventHandler reverseChain ;

    public Screen()
    {
        // no constructor elements
    }

    public void key(String ch, int cnt) {
        if (ch.matches("x|X")){
            System.err.print("R:" + reverseChain.getClass().getName());
            reverseChain.key(ch, cnt);
        } else if (ch.matches("\\d")){
            System.err.print("C:" + chain.getClass().getName());
            chain.key(ch, cnt) ;
        }
    }
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
        reverseComp.push( c );
        if (components.size() == 1 )
        {
            chain = (IKeyEventHandler) c ;
            reverseChain = (IKeyEventHandler) c;
        }
        else
        {
            IKeyEventHandler prev = (IKeyEventHandler) components.get(components.size()-2) ;
            prev.setNext( (IKeyEventHandler) c ) ;
            ((IKeyEventHandler) c).setPrev(prev);
            reverseChain = (IKeyEventHandler) reverseComp.peek(); 
        }
    }
    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {   
            IDisplayComponent temp = c;
            value = value + temp.display() ;
        }
        return value ; 
    }

    public String name() {
        return (this.getClass().getName()) ; 
    }

}
