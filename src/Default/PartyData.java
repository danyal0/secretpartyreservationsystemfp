package Default;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class PartyData {
        private static Address address=new Address("1000N", "Fairfield", "IA","52557");
        private static Place place=new Place("Hannah Party", 5, address);
        private static User host=new User("Hannah","12",null, "hannahgail03@gmail.com", LocalDate.of(1987, 11, 24));
        private static List<Party> partyList = new ArrayList<Party>();

  static {
        partyList.add(new Party(50,"Sexy","Party in Vegas",place,LocalDate.parse("2021-04-16"),host,"5:00PM"));
        partyList.add(new Party(60,"Bikini","Party in Miami",place,LocalDate.parse("2021-05-16"),host,"6:00PM"));
        partyList.add(new Party(70,"Semi Casual","Party in Hollywood",place,LocalDate.parse("2021-05-16"),host,"6:00PM"));
        partyList.add(new Party(80,"Casual","Party in Iowa",place,LocalDate.parse("2021-05-16"),host,"8:00PM"));
   }

    public static List<Party> getParty() {
        return partyList;
    }

}
