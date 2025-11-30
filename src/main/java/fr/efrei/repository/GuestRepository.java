package fr.efrei.repository;
import fr.efrei.domain.Guest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestRepository implements IGuestRepository {
    private static IGuestRepository repository = null;
    //private List<Guest> guestList; we will use hashmap instead of list
    private Map<Long, Guest> guestMap;

    private GuestRepository() {
        guestMap = new HashMap<>();
    }

    public static IGuestRepository getRepository() {
        if (repository == null) {
            repository = new GuestRepository();
        }
        return repository;
    }

    @Override
    public Guest create(Guest guest) {
        if (guestMap.containsKey(guest.getId())) {
            return null;  //means the id exist already
        }
        guestMap.put(guest.getId(), guest);
        return guest;
    }

    @Override
    public Guest read(Long id) {
        return guestMap.get(id);
    }


    @Override
    public Guest update(Guest guest) {
        Long id = guest.getId();
        if (!guestMap.containsKey(id)) {
            return null;
        }
        guestMap.put(id, guest);
        return guest;
    }

    @Override
    public boolean delete(Long id) {
        return guestMap.remove(id) != null;
    }

    @Override
    public List<Guest> getAll() {
        return new ArrayList<>(guestMap.values());  //to convert in a list.
    }
}