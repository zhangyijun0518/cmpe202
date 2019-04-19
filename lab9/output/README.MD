# CMPE202 Lab9 - Java Lambda Design Pattern

### Command Pattern
In this pattern, the command instances have all the information they need to update the model and only contain the logic they need to 'work' whenever they are executed;
- In the original version: a lot of concrete or anonymous implementations have to be created;
- In Functional version: there is no need to write any concrete implementation class of commands, only passed those implementations as behaviors to the invoker's method 

#### Pros
- Code is more concise;
- Data flow is more clear; 

#### Core Code
```java
// Before
Invoker invoker = new Invoker();
ReceiverEditor editor = new ConcreteReceiver();

Command openCommand = new CommandOpen(editor);
Command saveCommand = new CommandSave(editor);

invoker.setCommand(openCommand);
invoker.setCommand(saveCommand);


// After
Invoker invoker = new Invoker();
ReceiverEditor editor = new ConcreteReceiver();

invoker.setCommand(() -> editor.open());
invoker.setCommand(() -> editor.save());
```