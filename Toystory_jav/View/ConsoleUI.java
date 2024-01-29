package View;

import java.util.Scanner;

import Model.ToyMachine;
import Presenter.Presenter;

public class ConsoleUI implements View {
    private Scanner scanner; 
    private Presenter presentor; 
    private boolean work;
    private Menu menu;


    public ConsoleUI(){
        scanner = new Scanner(System.in);
        presentor = new Presenter(this);
        work = true;
        menu = new Menu(this);
    }

    public void start(){
        System.out.println("Hi.Choose what do u want to do with a toy machine");
        System.out.println("1.Add Toy");
        System.out.println("2. Get list of toys");
        System.out.println("3. Get list of winned toys");
        System.out.println("4.Change Fortune of the toy");
        System.out.println("5.Make give away");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                addToy();
                break;
            case "2":
                getToyList();
                break;
            case "3":
                getToyPrizeList();
                break;
            case "4":
                changeFortune();
                break;
            case "5":
                makeGA();
                break;

            default:
                break;
        }
    }
    
     private void finish() {
        work = false;
    }

    private void printMenu(){
        System.out.println(menu.menu1());
    }


    public void getToyList() {
        presentor.getToyList();
    }

    public void getToyPrizeList() {
        presentor.getToyPrizeList();
    }

    public void printAnswer(String answer){
        System.out.println(answer);     
    }

    public void changeFortune(){
        presentor.getToyList();
        System.out.println("Enter id of the toy");
                long id = Long.parseLong(scanner.nextLine());
                System.out.println("Enter wight");
                long fortune = Long.parseLong(scanner.nextLine());
        presentor.changeToyFortune(id, fortune);
    }

    public void makeGA(){
        presentor.getToyPrizeList();
    }

    public void addToy(){
         System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter number");
                int numb = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter wight");
                int fortune = Integer.parseInt(scanner.nextLine());
                presentor.addToy(name,numb,fortune);
    }

}
