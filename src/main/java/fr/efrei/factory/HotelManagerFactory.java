package fr.efrei.factory;

import fr.efrei.domain.HotelManager;

public class HotelManagerFactory {
    public static HotelManager createHotelManager(String id, String name, String username, String email){
        if (id == null || id.length() < 10 ||
                name == null || name.isEmpty()){
            return null;
        }

        return new HotelManager.Builder()
                .setId(id)
                .setName(name)
                .build();
    }

}
