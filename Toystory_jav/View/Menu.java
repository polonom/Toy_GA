package View;

import java.util.ArrayList;
import java.util.List;

import View.commands.AddToy;
import View.commands.ChangeWight;
import View.commands.InfoAPrize;
import View.commands.Command;
import View.commands.InfoAToy;
import View.commands.MakeGiveAway;

public class Menu {

    private List<Command> commands;
    

    public Menu(ConsoleUI consoleUI){
        commands = new ArrayList<>();
        commands.add(new AddToy("Add Toy",consoleUI));
        commands.add(new InfoAToy("Get info about toys",consoleUI));
        commands.add(new InfoAPrize("Get info about prize toys",consoleUI));
        commands.add(new ChangeWight("Change  fortune",consoleUI));
        commands.add(new MakeGiveAway("Make Give Away",consoleUI));
        
    }

    public String menu1(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(String choice){
        commands.get(Integer.parseInt(choice) - 1).execute();
    }
}