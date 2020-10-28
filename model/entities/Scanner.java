package model.entities;

public class Scanner extends Device{

    public Scanner(){

    }

    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed: " + doc.toUpperCase());
    }

    public String scan(){
        return "Successful scanned";
    }
}
