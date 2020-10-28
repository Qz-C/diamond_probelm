package model.entities;

public class ScannerDevice extends Device implements Scanner{

    public ScannerDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed in a scanner: " + doc.toUpperCase());
    }

    @Override
    public String scan(){
        return "Successful scanned";
    }
}
