package Default;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        getPartiesCountByPlace();
    }
    public static void getPartiesCountByPlace(){


        List<UserRole> role = new ArrayList<>();
        Address address1 = new Address("1000N 4th Street","Fairfield","IA","52557");
        Address address2 = new Address("1004N 67th Street","Iowa City","IA","52555");
        Place place1 = new Place("House 240-B",3,address1);
        Place place2 = new Place("House 241-B",3,address2);
        User user = new User("John Doe","12",role,"john@gmail.com",new Date(2,2,2));

        List<Party> parties = new ArrayList<Party>();
        parties.add(new Party(0, "Coca-Cola", "a",place1,LocalDate.parse("2021-05-01"),user));
        parties.add(new Party(1, "Mountain Dew", "b",place2,LocalDate.parse("2019-05-16"),user));
        parties.add(new Party(2, "Mango Smoothie", "d",place2,LocalDate.parse("2019-05-16"),user));
        parties.add(new Party(3,"Orange Juice", "t",place1,LocalDate.parse("2019-05-16"),user));
        parties.add(new Party(4, "Dr. Pepper", "y",place2,LocalDate.parse("2019-05-16"),user));
        parties.add(new Party(5, "Sandwich", "u",place1,LocalDate.parse("2019-05-16"),user));
        parties.add(new Party(6, "Hamburger", "h",place1,LocalDate.parse("2019-05-16"),user));
        parties.add(new Party(7, "Light Sandwich", "j",place1,LocalDate.parse("2019-05-16"),user));
        System.out.print("Parties that where hosted in past in a Fairfield city: ");
        System.out.println(FunctionalUtils.HowManyPartiesWhereHostedInXCity.apply(parties,"Fairfield"));

    }

}
