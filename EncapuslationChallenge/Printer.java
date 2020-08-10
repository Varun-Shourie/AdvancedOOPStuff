public class Printer {

    // This class simulates a real life computer printer.

    private double tonerLevel;
    private int pagesPrinted;
    private boolean hasDuplexAbility;

    public Printer(double tonerLevel, boolean hasDuplexAbility) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = 100;
        }

        this.pagesPrinted = 0;
        this.hasDuplexAbility = hasDuplexAbility;
    }

    public Printer() {
        this(100.0,false);
    }

    public void fillToner(double tonerRefill) {
        if(tonerLevel + tonerRefill > 100.0) {
            tonerLevel = 100.0;

            System.out.println("Toner level reset to 100.00");
        }
        else if(tonerRefill < 0) {
            System.out.println("Invalid toner refill. Cannot change toner level.");
            return;
        }
        else {
            tonerLevel += tonerRefill;

            System.out.println("Toner level reset to " + tonerLevel);
        }
            
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean hasDuplexAbility() {
        return hasDuplexAbility;
    }

    public void printPage() {
        if(hasDuplexAbility) {
            System.out.println("Printer has printed a double sided page.");

            pagesPrinted += 2;
            tonerLevel -= 20;
        }
        else {
            System.out.println("Printer has printed a one-sided page.");

            pagesPrinted++;
            tonerLevel -= 10;
        }

        System.out.println("Total number of pages printed thus far: " + pagesPrinted);
    }

    public void printPages(int numberOfPages) {
        int pagesToPrint = 0;

        if(hasDuplexAbility) {
            pagesToPrint = ((numberOfPages / 2) + (numberOfPages % 2));

            System.out.println("Number of pages printed: " + pagesToPrint);
            pagesPrinted += pagesToPrint;
        }
        else {
            pagesPrinted += numberOfPages;
        }
        
        System.out.println("Total number of pages printed so far: " + pagesPrinted);
    }

}