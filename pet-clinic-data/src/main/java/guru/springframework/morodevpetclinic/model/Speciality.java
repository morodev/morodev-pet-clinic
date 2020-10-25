package guru.springframework.morodevpetclinic.model;

/**
 * Created by Luca Moro on 25/10/2020 16:43
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
