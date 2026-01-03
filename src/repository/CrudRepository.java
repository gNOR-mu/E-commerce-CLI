package repository;

/*
 * CRUD de un repositorio simulado
 * */
public interface CrudRepository<T, ID> {
    T save(T entity);
    void deleteById(ID id);
    boolean existsById(ID id);
}
