package org.rmm.controller;

import org.rmm.entity.BaseEntity;
import org.rmm.repository.BaseRepository;
import org.rmm.service.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<S extends GenericService<E, R>, E extends BaseEntity, R extends BaseRepository<E>> {

    private final S service;

    public GenericController(S service) {
        this.service = service;
    }


    @PostMapping(value = "save")
    public E save(@RequestBody E e){
        return service.save(e);
    }

    @PutMapping(value = "update")
    public E update(@RequestBody E e) throws Exception {
        return service.update(e);
    }

    @GetMapping(value = "find")
    public E find(Long id) throws Exception {
        return service.findById(id);
    }

    @GetMapping(value = "find-all")
    public List<E> findAll(){
        return service.findAll();
    }

    @DeleteMapping(value = "delete")
    public E delete(@RequestBody E e) throws Exception {
        return service.delete(e);
    }


}
