package application;

import model.entities.MultiFunctionalDevice;
import model.entities.PrinterDevice;
import model.entities.ScannerDevice;

public class Program {
    public static void main(String[] args){
        ScannerDevice scannerDevice = new ScannerDevice("0001525AFN30");
        PrinterDevice printerDevice = new PrinterDevice("3301792JBT57");
        MultiFunctionalDevice allInOne = new MultiFunctionalDevice("3301792JBT57");


        final String doc = "Text that the devices manipulate";

        System.out.println("Scanner Functionalities:");
        System.out.println("------------------------");
        scannerDevice.processDoc(doc);
        System.out.println(scannerDevice.scan());

        System.out.println("\nPrinter Functionalities:");
        System.out.println("------------------------");
        printerDevice.processDoc(doc);
        printerDevice.print(doc);

        System.out.println("\nMulti-functional Functionalities:");
        System.out.println("------------------------");
        allInOne.processDoc(doc);
        allInOne.print(doc);
        System.out.println(allInOne.scan());
    }
}
