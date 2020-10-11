package guru.springframework.morodevpetclinic.model;

/**
 * Created by Luca Moro on 11/10/2020 15:30
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
