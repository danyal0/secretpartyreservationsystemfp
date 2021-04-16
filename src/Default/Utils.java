package Default;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {
    /*Task 1 - Eliza : How much the HOST earn in a year*/
    public static Ternary<Host, String, LocalDate, Double> amountHostEarnedPerYear =
            (host, hostName, date) -> host.getPartiesList().stream()
                    .filter(h -> h.getHostUser().getName()== hostName)
                    .flatMap(p ->p.getGuestReservList().stream())
                    .filter(r -> r.getPayment().getPaymentdate().getYear() == date.getYear())
                    .map(pey -> pey.getPayment().getAmount())
                    .reduce((i1, i2) -> i1 + i2)
                    .orElse(Double.valueOf(0f));

    /*Task 2 - Eliza : The two parties that have more guests in a exactly month */
    public  static BiFunction<List<Party>,LocalDate, List<String>> partyWithMoreGuestInAMonth =
            (parties, month) -> parties.stream().
                    sorted((l1, l2) -> l2.getGuestReservList().size() - l1.getGuestReservList().size())
                    .filter(m -> m.getDate().getMonth() == month.getMonth())
                    .map(r -> r.getName())
                    .limit(2)
                    .collect(Collectors.toList());

    /*Task 3 - Eliza : Names of Guests that choose the parties with highest level of privacy  */
    public static Function<List<Party>, List<String>> guestsChoosePartyHighPrivacy =
            parties -> parties.stream()
                    .sorted((n1,n2) -> n2.getPlace().getLevelOfPrivacy() - n1.getPlace().getLevelOfPrivacy())
                    .limit(1)
                    .flatMap(g -> g.getGuestReservList().stream())
                    .map(r -> r.getGuest().getName())
                    .collect(Collectors.toList());

}
