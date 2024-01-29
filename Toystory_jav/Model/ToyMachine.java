package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToyMachine<E extends ToyNode<E>> implements Serializable, Iterable<E>{
    private long toyId;
    private int toyNumber;
    private long toyFortune;
    public List<E> toyList;
   
    public ToyMachine(List<E> toyList) {this.toyList=toyList;}
       
    
    public boolean add(E toy){
        if (toy==null){
            return false;
        }
        if (!toyList.contains(toy)){
            toyList.add(toy);
            toy.setId(toyId++);
            return true;
        }
        if (toyList.contains(toy)){
            toy.setNumber(toyNumber++);
            return true;}
        return false;
    }

    public boolean remove(E toy){
        if (toy==null){
            return false;
        }
        if (!toyList.contains(toy)){
            return false;
        }
        if (toyList.contains(toy)){
            toyList.remove(toy);
            return true;}
        return false;
    }


    public E getById(long id){
        for (E toy: toyList){
            if (toy.getId() == id){
                return toy;
            }
        }
        return null;
    }

    public String toString() {return getInfo();}

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(" In the list");
        sb.append(toyList.size());
        sb.append(" objects: ");
        for (E toy: toyList){
            sb.append(toy);
            sb.append("\n");
        }
        return sb.toString();


    }


    

    public Iterator<E> iterator(){
        return new ToyIterator(toyList);
    }
}

