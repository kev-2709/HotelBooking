package fr.efrei.domain;

import java.util.List;

public class HotelManager {
    private String id;
    private String name;
    private List<Room> rooms;
    private List<Guest> managedGuests;

    public HotelManager() {
    }

    public HotelManager(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.rooms = builder.rooms;
        this.managedGuests = builder.managedGuests;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Guest> getManagedGuests() {
        return managedGuests;
    }

    @Override
    public String toString() {
        return "HotelManager{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rooms=" + rooms +
                ", managedGuests=" + managedGuests +
                '}';
    }

    public static class Builder {
        private String id;
        private String name;
        private List<Room> rooms;
        private List<Guest> managedGuests;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setRooms(List<Room> rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setManagedGuests(List<Guest> managedGuests) {
            this.managedGuests = managedGuests;
            return this;
        }

        public Builder copy(HotelManager hotelManager) {
            this.id = hotelManager.id;
            this.name = hotelManager.name;
            this.rooms = hotelManager.rooms;
            this.managedGuests = hotelManager.managedGuests;
            return this;
        }

        public HotelManager build() {
            return new HotelManager(this);
        }
    }
}
