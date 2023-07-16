package Address;

import Account.User;

public interface IAddress {

    String getCountry();

    void setCountry(String country);

    String getCity();

    void setCity(String city);

    String getStreet();

    void setStreet(String street);

    int getPostalCode();

    void setPostalCode(int postalCode);
}
