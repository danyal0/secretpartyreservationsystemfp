package Default;

import java.time.LocalDate;

public class Payment {
    private LocalDate paymentdate;
    private Double amount;
    private Reservation reservation;

    public Payment(LocalDate paymentdate, Double amount) {
        this.paymentdate = paymentdate;
        this.amount = amount;
        this.reservation = reservation;
    }

    public LocalDate getPaymentdate() {
        return paymentdate;
    }

    public Double getAmount() {
        return amount;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setPaymentdate(LocalDate paymentdate) {
        this.paymentdate = paymentdate;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentdate=" + paymentdate +
                ", amount=" + amount +
                ", reservation=" + reservation +
                '}';
    }
}
