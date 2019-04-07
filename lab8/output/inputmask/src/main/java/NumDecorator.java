

public class NumDecorator implements IDisplayComponent, IKeyEventHandler
{
   private String add;
   private CreditCardNum ccn;
   
    public NumDecorator(CreditCardNum c)
   {
       ccn = c;
   }

   public String display(){
        add = ccn.display();
        return addedString(add);
   } 
   
   private String addedString(String s){
       StringBuffer buff = new StringBuffer();
       String[] array = s.split("\\[|\\]");
       buff.append("[");
       char[] arr = array[1].toCharArray();
       for (int i = 0; i < arr.length; i++){
           buff.append(arr[i]);
           if (i == 3 || i == 7 || i == 11  ){
               buff.append(" ");
           }  
       }
       buff.append("]  ");
       return buff.toString();  
   }
   
    public void addSubComponent( IDisplayComponent c ) {
        ccn.addSubComponent(c);
    }
    
    public void key(String ch, int cnt){
        ccn.key(ch, cnt);
    }
    
    public void setNext( IKeyEventHandler next){
        ccn.setNext(next);
    }
    
    public void setPrev( IKeyEventHandler prev){
        ccn.setPrev(prev);
    } 
    
}
