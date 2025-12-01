package fr.efrei.domain;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private Date arrival;
    private Date departure;

    private Reservation(Builder builder){
        this.arrival = builder.arrival;
        this.departure = builder.departure;
        this.reservationId = builder.reservationId;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Integer getReservationId() {
        return reservationId;
    }


    public static class Builder{
        private int reservationId;
        private Date arrival;
        private Date departure;

        public Builder setReservationId(int reservationId){
            this.reservationId = reservationId;
            return this;
        }

        public Builder setArrival(Date arrival){
            this.arrival = arrival;
            return this;
        }

        public Builder setDeparture(Date departure){
            this.departure = departure;
            return this;
        }

        public Builder copy(Reservation reservation){
            this.reservationId = reservation.reservationId;
            this.arrival = reservation.arrival;
            this.departure = reservation.departure;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }
}
