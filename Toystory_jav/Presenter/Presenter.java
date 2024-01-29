package Presenter;

import java.io.Serializable;
import java.util.logging.FileHandler;

import Model.ToyService;
import Model.Toy;
import View.View;

public class Presenter {
    private View view;
    private ToyService service;
    private FileHandler fileHandler;


    public Presenter(View view) {
        service = new ToyService();
        this.view = view;
    }

    public void addToy(String name, int numb, long fortune){
        String answer = service.addToy(name, numb, fortune);
        view.printAnswer(answer);
    }

    public void getToyList(){
        String answer = service.getToyList();
        view.printAnswer(answer);
    }

    public void getToyPrizeList(){
        String answer = service.getToyPrizeList();
        view.printAnswer(answer);
    }

    public void changeToyFortune(long id, long fortune){
        String answer = service.changeToyFortune(id, fortune);
        view.printAnswer(answer);
    }

    public void makeGivAwa(){
        String answer = service.GiveAway();
        view.printAnswer(answer);
    }




    

  
}