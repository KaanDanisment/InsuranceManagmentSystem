package Insurance;

import Insurance.Insurance;

import java.time.LocalDate;
import java.util.Date;

public class ResidanceInsurance extends Insurance {
    public ResidanceInsurance() {
        super("Residence Insurance", 100, LocalDate.now(), LocalDate.now().plusYears(1));
    }

    @Override
    public void calculate() {
        this.setPrice(this.price * 50);
    }
}
