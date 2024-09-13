package org.example.service;

public abstract class AbstractService<T,ID> {
    public abstract T findById(ID id);
    public abstract void save(T entity);
    public abstract void delete(ID id);
}
