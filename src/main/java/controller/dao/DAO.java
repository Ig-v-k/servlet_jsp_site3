package controller.dao;

import java.util.List;

public interface DAO<A, B extends Integer> {

    void add(A o);

    void delete(B o);

    void update(A o);

    List<A> getAll();

    A getById(B o);

}
