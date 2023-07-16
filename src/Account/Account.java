package Account;


import Address.AddressManager;
import Address.IAddress;
import Insurance.Insurance;

import java.util.ArrayList;


public abstract class Account implements Comparable<Account> {
    enum AuthenticationStatus {
        Success,
        Fail
    }

    private User user;
    private AuthenticationStatus status;
    private ArrayList<Insurance> insurancesOfUsers;

    public Account(User user) {
        this.user = user;
        this.status = getStatus();
        this.insurancesOfUsers = getInsurancesOfUsers();

    }

    public void login(String email, int password) throws InvalidAuthenticationException {
        if (this.getUser().getEmail().equals(email) && this.getUser().getPassword() == password) {
            status = AuthenticationStatus.Success;
        } else {
            status = AuthenticationStatus.Fail;
            throw new InvalidAuthenticationException("Invalid e-mail or password");
        }
    }

    public void addAddress(IAddress address) {
        AddressManager.addAddress(this.user, address);
    }

    public void deleteAddress(IAddress address) {
        AddressManager.deleteAddress(this.user, address);
    }

    public abstract void addPolicy(Insurance insurance);

    public final void showUserInfo(){
        System.out.println("Name: " + this.user.getName());
        System.out.println("Surname: " + this.user.getSurname());
        System.out.println("Email: " + this.user.getEmail());
        System.out.println("Age: " + this.user.getAge());
        System.out.println("Job: " + this.user.getJob());
    }

    @Override
    public int compareTo(Account o) {
        return this.user.getName().compareTo(o.getUser().getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account a = (Account) obj;
        return this.user.getEmail() == a.getUser().getEmail();
    }

    @Override
    public int hashCode() {
        return this.getUser().getEmail().hashCode();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public ArrayList<Insurance> getInsurancesOfUsers() {
        return insurancesOfUsers;
    }

    public void setInsurancesOfUsers(ArrayList<Insurance> insurancesOfUsers) {
        this.insurancesOfUsers = insurancesOfUsers;
    }
}