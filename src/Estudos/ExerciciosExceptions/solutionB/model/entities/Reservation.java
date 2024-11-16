package Estudos.ExerciciosExceptions.solutionB.model.entities;

import Estudos.ExerciciosExceptions.solutionB.model.service.ReservationService;

import java.time.LocalDate;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation (Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        setRoomNumber(roomNumber);
        setCheckin(checkin);
        setCheckout(checkout);
    }

    public LocalDate getCheckin(){
        return checkin;
    }
    public void setCheckin(LocalDate checkin) {
        this.checkin=checkin;
    }
    public LocalDate getCheckout(){
        return checkout;
    }
    public void setCheckout(LocalDate checkout) {
        this.checkout=checkout;
    }
    public Integer getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber=roomNumber;
    }

    public Integer duration(Reservation reservation) {
        return reservation.getCheckin().getYear() - reservation.getCheckout().getYear();
    }

    public void updateDates(Reservation reservation, LocalDate newCheckin, LocalDate newCheckout) {
        reservation.setCheckin(newCheckin);
        reservation.setCheckout(newCheckout);
    }

    public void updateDates(LocalDate newCheckin, LocalDate newCheckout) {
        ReservationService exception = new ReservationService();
        exception.updateDatesExceptions(this,newCheckin,newCheckout); // this chama a propria instancia de Resevation
        // que chamar esse metodo no main
        // Ex: Reservation reservationEX = new Reservation(101, LocalDate.of(2024, 5, 10), LocalDate.of(2024, 5, 20));
        //       reservationEX.updateDates(LocalDate.of(2024, 5, 5), LocalDate.of(2024, 5, 15)); // this chama a propria reservationEX
    }

    public void getReservation(Reservation reservation) {
        System.out.println("Checkin: " + reservation.getCheckin());
        System.out.println("Checkout: " + reservation.getCheckout());
        System.out.println("Room Number: " + reservation.getRoomNumber());
    }

    @Override
    public String toString() {
        return "Checkin: " + getCheckin() +
                "Checkout: " + getCheckout() +
                "Room Number: " + getRoomNumber();
    }
}
