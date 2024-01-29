package View.commands;

import View.ConsoleUI;

public class ChangeWight extends Command {

    public ChangeWight(String description, ConsoleUI consoleUI) {
        super("Change  fortune", consoleUI);
    }


    @Override
    public void execute() {
       getConsoleUI().changeFortune();
    }
   
    
}