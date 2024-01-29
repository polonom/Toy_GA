package View.commands;

import View.ConsoleUI;

public class InfoAToy extends Command {

    public InfoAToy(String description, ConsoleUI consoleUI) {
        super("Get info about toys", consoleUI);
    }


    @Override
    public void execute() {
       getConsoleUI().getToyList();
    }
   
    
}