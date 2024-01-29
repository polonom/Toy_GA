package View.commands;

import View.ConsoleUI;

public class AddToy extends Command {

    public AddToy(String description, ConsoleUI consoleUI) {
        super("Add toy", consoleUI);
    }


    @Override
    public void execute() {
       getConsoleUI().addToy();
    }
   
    
}