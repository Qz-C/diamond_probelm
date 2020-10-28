package model.entities;

public class MultiFunctionalDevice extends Device implements Printer, Scanner{

    public MultiFunctionalDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed in a multi-functional device: " + doc);
    }

    @Override
    public void print(String doc){
        System.out.println("Printed [multi-functional]: " + doc);
    }

    @Override
    public String scan() {
        return "Successful scanned [multi-functional]";
    }
}
