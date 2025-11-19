package fr.efrei.domain;

import java.util.Date;

public class Reservation {
    private Date arrival;
    private Date departure;

    private Reservation(Builder builder){}

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

    public static class Builder{
        private Date arrival;
        private Date departure;

        public Builder setArrival(Date arrival){
            this.arrival = arrival;
            return this;
        }

        public Builder setDeparture(Date departure){
            this.departure = departure;
            return this;
        }

        public Builder copy(Reservation reservation){
            this.arrival = reservation.arrival;
            this.departure = reservation.departure;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }
}
