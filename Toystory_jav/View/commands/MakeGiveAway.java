package View.commands;

import View.ConsoleUI;

public class MakeGiveAway extends Command {

    public MakeGiveAway(String description, ConsoleUI consoleUI) {
        super("Make Give Away", consoleUI);
    }


    @Override
    public void execute() {
       getConsoleUI().makeGA();
    }
   
    
}