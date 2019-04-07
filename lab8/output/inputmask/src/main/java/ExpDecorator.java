

public class ExpDecorator implements IDisplayComponent, IKeyEventHandler
{
    public String add;
    private CreditCardExp cce;
    
    public ExpDecorator(CreditCardExp c)
    {
        cce = c; 
    }

    public String display(){
        add = cce.display();
        return addedString(add);
    }  
    
    private String addedString(String s){
       StringBuffer buff = new StringBuffer();
       String[] array = s.split("\\[|\\]");
       String exp = array[1];
       buff.append("[");
       char[] arr = array[1].toCharArray();
       for (int i = 0; i < arr.length; i++){
           buff.append(arr[i]);
           if (i == 1 ){
               buff.append("/");
           }  
       }
       buff.append("]  ");
       return buff.toString();   
    }
    
     public void addSubComponent( IDisplayComponent c ) {
        cce.addSubComponent(c);
    }
    
    public void key(String ch, int cnt){
        cce.key(ch, cnt);
    }
    
    public void setNext( IKeyEventHandler next){
        cce.setNext(next);
    }
    
    public void setPrev( IKeyEventHandler prev){
        cce.setPrev(prev);
    } 
}
