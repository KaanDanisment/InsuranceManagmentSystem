package Account;

import Insurance.Insurance;

public class Enterprise extends Account{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addPolicy(Insurance insurance) {
        super.getInsurancesOfUsers().add(insurance);
    }
}
