package IO.repository;

import java.io.Serializable;

public interface CrudRepository<T, ID extends Serializable> {

    //ToDo: transaction here

    <S extends T> S save(S entity);

    T findOne(ID primaryKey);

    Iterable<T> findAll();

    void delete(T entity);

    boolean exists(ID primaryKey);

}
