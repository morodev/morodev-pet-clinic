package guru.springframework.morodevpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Luca Moro on 11/10/2020 15:25
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
