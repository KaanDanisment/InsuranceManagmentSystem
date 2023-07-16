package Insurance;

import Insurance.Insurance;

import java.time.LocalDate;
import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance() {
        super("Health Insurance", 100, LocalDate.now(), LocalDate.now().plusYears(1));
    }

    @Override
    public void calculate() {
        this.setPrice(this.price * 50);
    }
}
