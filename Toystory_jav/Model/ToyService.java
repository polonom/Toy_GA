package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.logging.FileHandler;

import Model.Toy;
import Model.ToyMachine;
import Model.write.Saviable;

public class ToyService {
    private ToyMachine<Toy> activeToys;
    private ToyMachine<Toy> prizeToys;
    private Saviable saviable;
    FileHandler fileHandler;

    public String addToy(String name, int numb, long fortune){
        Toy toy = new Toy(name, numb, fortune);
        activeToys.add(toy);
        return "Toy is added";
    }

    public String changeToyFortune(long id, long fortune){
        Toy toy = activeToys.getById(id);
        toy.changeFortune(toy);
        return "Fortune is changed";
    }

    public Toy chooseWeight(ToyMachine<Toy> activeToys) {
        double weight = 0.0;
        for (Toy toy : activeToys)
            weight += toy.getFortune();
        double r = Math.random() * weight;
        double countWeight = 0.0;
        for (Toy toy : activeToys) {
            countWeight += toy.getFortune();
            if (countWeight >= r)
                return toy; 
        }
        throw new RuntimeException("Should never be shown.");
    }

    public <Toy> Toy raffleTheGoods() {
        Toy toy = (Toy) chooseWeight(activeToys);
        return toy;
    }

    public String GiveAway(){
        Toy toy = raffleTheGoods();
        prizeToys.add(toy);
        activeToys.remove(toy);
        save();
        return "Give away is successfully done";
    }

    public boolean save(){
        if (saviable == null){
            return false;
        }
        return saviable.save(prizeToys);
    }

    
    public String getToyList() {
        return activeToys.getInfo();
    }
    public String getToyPrizeList() {
        return prizeToys.getInfo();
    }
}
    