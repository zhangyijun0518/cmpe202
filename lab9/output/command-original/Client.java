package command;

public class Client {
    
    public static void main( String [] args )
    {
        Invoker invoker = new Invoker();
        ReceiverEditor editor = new ConcreteReceiver();
        Command openCommand = new CommandOpen(editor);
        Command saveCommand = new CommandSave(editor);

        invoker.setCommand(openCommand);
        invoker.setCommand(saveCommand);

        invoker.invoke();
    }
        
 
}
 
