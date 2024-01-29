package Model;

import java.io.Serializable;
import java.util.List;

public interface ToyNode<T> extends Serializable {
    void setId(long id);
    long getId();
    String getName();
    void setFortune(long fortune);
    long getFortune();
    void setNumber(int numb);
    int getNumber();
    T changeFortune(T toy);

}