package command;

import java.util.ArrayList;
import java.util.List;

public class ConcreteReceiver implements ReceiverEditor{

	private final List<String> cmds = new ArrayList<>();

	@Override
	public void open() {
		this.cmds.add("open");
	}

	@Override
	public void save() {
		this.cmds.add("save");
	}

}