package com.classes.section7.encapsulation;

import com.classes.section7.encapsulation.challenge.Printer;

public class main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,10,false);
        System.out.println("initial page count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer ="+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer ="+printer.getPagesPrinted());


    }
}
