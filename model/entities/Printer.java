package model.entities;

public class Printer extends Device{

    public Printer(){
    }

    public Printer(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed: " + doc);
    }

    public void print(String doc){
        System.out.println("Printed: " + doc);
    }
}
