package command;

public class Client {
    
    public static void main( String [] args )
    {
        Invoker invoker = new Invoker();
        ReceiverEditor editor = new ConcreteReceiver();

        invoker.setCommand(() -> editor.open());
        invoker.setCommand(() -> editor.save());

        invoker.invoke();
    }
        
 
}
 
