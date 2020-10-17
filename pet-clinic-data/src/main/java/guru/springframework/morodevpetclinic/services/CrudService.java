package guru.springframework.morodevpetclinic.services;

import java.util.Set;

/**
 * Created by Luca Moro on 17/10/2020 12:19
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
