import commands.Command;
import commands.NoCommand;
import java.util.Stack;


public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = new Stack();

    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand.push(offCommands[slot]);
    }

    public void undoButtonWasPushed(){
        if(undoCommand.empty()) return;
        ((Command) undoCommand.pop()).undo();
    }

    public String toString(){
        StringBuffer stringBuff =new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
