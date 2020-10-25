package guru.springframework.morodevpetclinic.model;

import java.util.Set;

/**
 * Created by Luca Moro on 11/10/2020 15:26
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
