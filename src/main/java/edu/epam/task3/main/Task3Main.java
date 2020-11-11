package edu.epam.task3.main;

import edu.epam.task3.entity.Square;
import edu.epam.task3.report.SquareReport;
import edu.epam.task3.service.SquareService;

public class Task3Main {
    public static void main(String[] args) {
        double area = 400;
        Square bigSquare = new Square();
        Square inscribedSquare = new Square();
        SquareService squareService = new SquareService();
        bigSquare.setSideLength(squareService.getSideLengthFromArea(area));
        inscribedSquare = squareService.getInscribedSquare(bigSquare);
        double areaProportion = squareService.getAreaProportion(bigSquare, inscribedSquare);
        SquareReport squareReport = new SquareReport();
        squareReport.printAreaReport(areaProportion, bigSquare, inscribedSquare);
    }
}
