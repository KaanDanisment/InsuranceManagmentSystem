package Insurance;

import java.time.LocalDate;

public abstract class Insurance {
    String name;
    double price;
    LocalDate beginningDate;
    LocalDate endingDate;

    public Insurance(String name, double price, LocalDate beginningDate, LocalDate endingDate) {
        this.name = name;
        this.price = price;
        this.beginningDate = beginningDate;
        this.endingDate = endingDate;
    }

    public abstract void calculate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(LocalDate beginningDate) {
        this.beginningDate = beginningDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
}
