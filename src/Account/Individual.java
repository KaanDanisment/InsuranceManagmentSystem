package Account;

import Insurance.Insurance;

public class Individual extends Account{
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addPolicy(Insurance insurance) {
        super.getInsurancesOfUsers().add(insurance);
    }
}
