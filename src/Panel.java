import Account.Account;
import Account.AccountManager;
import Address.AddressManager;
import Address.BusinessAddress;
import Address.HomeAddress;
import Insurance.*;

import java.util.Scanner;

public class Panel {
    static Scanner scan = new Scanner(System.in);

    public static void panel() {
        System.out.println("1- Log in\n" +
                "2- Sign up\n" +
                "0- Exit");
        int decision = scan.nextInt();
        switch (decision) {
            case 1:
                System.out.print("Email: ");
                String email = scan.nextLine();
                scan.next();
                System.out.print("Password: ");
                int password = scan.nextInt();
                Account account = AccountManager.login(email, password);
                if (account == null) {
                    System.out.println("No registration has been yet.");
                } else {
                    System.out.println("1- Add Policy");
                    System.out.println("2- Add Address");
                    System.out.println("3- Delete Address");
                    System.out.println("4- Show Policies");
                    System.out.println("5- Show Account Info");
                    System.out.println("0- Log out");
                    decision = scan.nextInt();
                    switch (decision) {
                        case 1:
                            System.out.println("1- Car Insurance");
                            System.out.println("2- Health Insurance");
                            System.out.println("3- Residence Insurance");
                            System.out.println("4- Travel Insurance");

                            decision = scan.nextInt();
                            if (decision == 1){
                              account.getInsurancesOfUsers().add(new CarInsurance());
                            }else if(decision == 2){
                                account.getInsurancesOfUsers().add(new HealthInsurance());
                            } else if (decision == 3) {
                                account.getInsurancesOfUsers().add(new ResidanceInsurance());
                            } else if (decision == 4) {
                                account.getInsurancesOfUsers().add(new TravelInsurance());
                            }else System.out.println("You made wrong entrance");

                        case 2:
                            System.out.println("1- Home Address");
                            System.out.println("2- Business Address");

                            decision = scan.nextInt();
                            if (decision == 1){
                                System.out.print("Country: ");
                                String country = scan.nextLine();
                                System.out.print("City: ");
                                String city = scan.nextLine();
                                System.out.print("Street: ");
                                String street = scan.nextLine();
                                System.out.println("Postal Code: ");
                                int postalCode = scan.nextInt();
                                HomeAddress homeAddress = new HomeAddress(country,city,street,postalCode);
                                AddressManager.addAddress(account.getUser(),homeAddress);
                            } else if (decision == 2) {
                                System.out.print("Company Name: ");
                                String companyName = scan.nextLine();
                                System.out.print("Country: ");
                                String country = scan.nextLine();
                                System.out.print("City: ");
                                String city = scan.nextLine();
                                System.out.print("Street: ");
                                String street = scan.nextLine();
                                System.out.println("Postal Code: ");
                                int postalCode = scan.nextInt();
                                BusinessAddress businessAddress = new BusinessAddress(companyName,country,city,street,postalCode);
                                AddressManager.addAddress(account.getUser(),businessAddress);
                            }else System.out.println("Invalid entrance.");
                        case 3:
                            for (int i = 0; i < account.getUser().getAddresses().size(); i++){
                                System.out.println();
                            }
                        case 4:
                            for (int i = 0; i < account.getInsurancesOfUsers().size(); i++){
                                System.out.println(account.getInsurancesOfUsers().get(i).getName());
                            }
                        case 5:
                            account.setUser(account.getUser());
                    }
                }
            case (2):

        }
    }
}
