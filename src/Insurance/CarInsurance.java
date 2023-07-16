package Insurance;


import java.time.LocalDate;
import java.time.LocalTime;

public class CarInsurance extends Insurance {
    public CarInsurance() {
        super("Car Insurance", 100, LocalDate.now(), LocalDate.now().plusYears(1));
    }

    @Override
    public void calculate() {
        this.setPrice(this.price * 60);
    }
}
