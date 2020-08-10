public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.fillToner(100);
        printer.fillToner(-3);
        printer.fillToner(0);

        printer.printPage();
        printer.printPages(50);

        Printer printerTwo = new Printer(45, true);

        printerTwo.fillToner(50);
        printerTwo.fillToner(-1);
        printerTwo.fillToner(0);

        printerTwo.printPage();
        printerTwo.printPages(50);
    }
}