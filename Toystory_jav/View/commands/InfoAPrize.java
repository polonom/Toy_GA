package View.commands;

import View.ConsoleUI;

public class InfoAPrize extends Command {

    public InfoAPrize(String description, ConsoleUI consoleUI) {
        super("Get info about prizes", consoleUI);
    }


    @Override
    public void execute() {
       getConsoleUI().getToyPrizeList();
    }
   
    
}