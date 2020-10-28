package model.entities;

public class PrinterDevice extends Device implements Printer{

    public PrinterDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed in a printer: " + doc);
    }

    @Override
    public void print(String doc){
        System.out.println("Printed: " + doc);
    }
}
