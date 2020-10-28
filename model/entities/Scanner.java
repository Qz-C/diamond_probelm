package model.entities;

public class Scanner extends Device{
    private String model;

    public Scanner(){

    }

    public Scanner(String serialNumber, String model) {
        super(serialNumber);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processed: " + doc.toUpperCase());
    }

    public String scan(){
        return "Successful scanned";
    }
}
