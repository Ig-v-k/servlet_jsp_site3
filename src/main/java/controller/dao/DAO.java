package controller.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<A, B> {

    void add(B o);

    void delete(B o);

    void update(A o);

    List<A> getAll();

    A getById(B o);

}
