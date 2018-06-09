package com.Ghufran;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,false);
        System.out.println("Start Page count " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted+" new total count = "+ printer.getPagesPrinted() );
        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed was " + pagesPrinted+" new total count = "+ printer.getPagesPrinted());

    }
}
