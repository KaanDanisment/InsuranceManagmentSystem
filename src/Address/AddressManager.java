package Address;

import Account.User;

public class AddressManager {

    public static void addAddress(User user, IAddress address){
        user.getAddresses().add(address);

    }
    public static void deleteAddress(User user, IAddress address){
        user.getAddresses().remove(address);
    }
}
