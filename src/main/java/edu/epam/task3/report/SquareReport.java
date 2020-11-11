package edu.epam.task3.report;

import edu.epam.task3.entity.Square;

public class SquareReport {
    public void printAreaReport(double areaProportion, Square bigSquare, Square inscribedSquare) {
        System.out.println("Big square ...... " + bigSquare);
        System.out.println("Inscribed square ....... " + inscribedSquare);
        System.out.println("Area proportion ....... " + areaProportion);
    }
}
