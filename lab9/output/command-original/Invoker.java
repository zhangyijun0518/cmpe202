package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
 	private final List<Command> cmds;

 	public Invoker(){
 		cmds = new ArrayList<>();
 	}

 	public void setCommand(Command cmd){
 		cmds.add(cmd);
 	}

 	public void invoke(){
 		cmds.forEach(Command::execute);
 	} 
}
 
