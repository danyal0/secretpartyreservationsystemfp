package Default;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Party> parties = DataSource.partyList();
        Host host = new Host();
        String hostName = "Rose Smith";
        host.setPartiesList(parties);
        LocalDate date = LocalDate.of(2020,03,03);
        System.out.println("-----------------------------------------\n" +
                "How much a HOST earn in one year\n$ "
                + Utils.amountHostEarnedPerYear.apply(host, hostName, date));

        System.out.println("\n-----------------------------------------\n" +
                "The two parties that have more guests in a exactly a month\n"
                + Utils.partyWithMoreGuestInAMonth.apply(parties,date));

        System.out.println("\n-----------------------------------------\n" +
                "Names of Guests that choose the party with highest level of privacy\n"
                + Utils.guestsChoosePartyHighPrivacy.apply(parties));

    }

}
