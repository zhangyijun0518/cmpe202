package command;

public class CommandSave implements Command {
    
    private final ReceiverEditor editor ;

	public CommandSave(ReceiverEditor target) {
		super();
	    this.editor = target ;
	}
	
	@Override
	public void execute() {
	    this.editor.save();
	}
	 
}
 
