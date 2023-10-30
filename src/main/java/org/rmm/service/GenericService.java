package org.rmm.service;

import org.rmm.entity.BaseEntity;
import org.rmm.repository.BaseRepository;


import java.util.List;


public class  GenericService<E extends BaseEntity, R extends BaseRepository<E>> {

    private final R repository;

    public GenericService(R repository) {
        this.repository = repository;
    }

    public E findById(Long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("not found"));
    }

    public List<E> findAll(){
        return repository.findAll();
    }

    public E save(E e){
        return repository.save(e);
    }

    public E update(E e) throws Exception {
        findById(e.getId());
        return repository.save(e);
    }

    public E delete(E e) throws Exception {
        E finded = findById(e.getId());
        repository.delete(finded);
        return finded;
    }


}
