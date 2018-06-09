package com.Ghufran;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel<= 100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int refillToner(int amount){
        if(amount + this.tonerLevel > 100){
            this.tonerLevel = 100;
            return this.tonerLevel;
        }
        this.tonerLevel = this.tonerLevel + amount;
        return this.tonerLevel;
    }

    public int printPage(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (int) Math.ceil(pages/2);
            System.out.println("Printing in Duplex");

        }
        this.pagesPrinted += pagesToPrint;
        return  pagesToPrint;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
