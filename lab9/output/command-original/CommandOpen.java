package command;

public class CommandOpen implements Command {
    
    private final ReceiverEditor editor ;

	public CommandOpen(ReceiverEditor target) {
		super();
	    this.editor = target ;
	}
	
	@Override
	public void execute() {
	    this.editor.open();
	}
	 
}
 
