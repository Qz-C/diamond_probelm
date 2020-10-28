package model.entities;

public class Printer extends Device{

    private String model;

    public Printer(){

    }

    public Printer(String serialNumber, String model) {
        super(serialNumber);
        this.model = model;
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed: " + doc);
    }

    public void print(String doc){
        System.out.println("Printed: " + doc);
    }
}
