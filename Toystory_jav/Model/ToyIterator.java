package Model;

import java.util.Iterator;
import java.util.List;

public class ToyIterator<E extends ToyNode<E>> implements Iterator<E>{
    private int index = 0;
    private List<E> toyList;

    public ToyIterator(List<E> toyList){
        this.toyList = toyList;
    }

    public boolean hasNext(){
        return index < toyList.size(); 
    }

    public E next(){
        return toyList.get(index++);
    }
} 
    

