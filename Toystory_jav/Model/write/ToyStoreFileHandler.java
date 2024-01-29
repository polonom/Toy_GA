package Model.write;
import Model.Toy;
import Model.ToyMachine;
import Model.write.Saviable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

public class ToyStoreFileHandler extends FileHandler implements Saviable {
    private String filePath = "toys.txt";
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public boolean save(ToyMachine<Toy> tree) {
        return super.save(tree, filePath);
    }

    @Override
    public ToyMachine<Toy> read() {
        return (ToyMachine<Toy>)super.read(filePath);
    }
}
