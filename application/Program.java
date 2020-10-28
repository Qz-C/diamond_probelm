package application;

import model.entities.Printer;
import model.entities.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scannerDevice = new Scanner("0001525AFN30","Scanner Series X-13");
        Printer printerDevice = new Printer("3301792JBT57", "Printer HNO13");

        final String doc = "Text that the devices manipulates";

        System.out.println("Scanner Functionalities:");
        System.out.println("------------------------");
        scannerDevice.processDoc(doc);
        System.out.println(scannerDevice.scan());

        System.out.println("\nPrinter Functionalities:");
        System.out.println("------------------------");
        printerDevice.processDoc(doc);
        printerDevice.print(doc);

    }
}
