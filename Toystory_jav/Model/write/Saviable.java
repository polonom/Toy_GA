package Model.write;

import Model.Toy;
import Model.ToyMachine;

import java.io.Serializable;
import java.util.LinkedList;

public interface Saviable {
    boolean save(ToyMachine<Toy> tree);
    ToyMachine<Toy> read();
    void setFilePath(String filePath);
}