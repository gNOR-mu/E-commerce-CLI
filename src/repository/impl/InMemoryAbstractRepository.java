package repository.impl;

import repository.CrudRepository;
import model.base.Identifiable;

import java.util.HashMap;
import java.util.Map;

public abstract class InMemoryAbstractRepository<T extends Identifiable<ID>, ID> implements CrudRepository<T, ID> {
    //simulación de la base de datos
    protected final Map<ID, T> DB = new HashMap<>();

    @Override
    public T save(T entity) {
        DB.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public void deleteById(ID id) {
        DB.remove(id);
    }

    @Override
    public boolean existsById(ID id) {
        return DB.containsKey(id);
    }
}
