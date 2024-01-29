package Model;

import java.io.Serializable;


public class Toy implements Serializable, ToyNode<Toy> {
    private long id;
    private long fortune;
    private String name;
    private int numb;



    public Toy(String name,int numb,long fortune){
        id=-1;
        this.name=name;
        this.numb=numb;
        this.fortune=fortune;
    }

    public void setId(long id) { this.id=id;}
    public void setName(String name) { this.name=name;}
    public void setNumber(int numb){this.numb=numb;}
    public void setFortune(long fortune){this.fortune=fortune;}

    public long getId() { return id;}
    public String getName() { return name;}
    public int getNumber(){return numb;}
    public long getFortune(){return fortune;}

    public String toString(){ return getInfo();}

    public Toy changeFortune(Toy toy){
        toy.setFortune(fortune);
        return(toy);
    }

    public String getInfo(){
        StringBuilder sb= new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", name: " );
        sb.append(name);
        sb.append(", number: ");
        sb.append(numb);
        sb.append(", fortune: ");
        sb.append(fortune);
        return sb.toString();
    }
}
