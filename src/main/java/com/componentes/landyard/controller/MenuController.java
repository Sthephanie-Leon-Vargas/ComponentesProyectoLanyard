package com.componentes.landyard.controller;
import com.componentes.landyard.model.Evento;
import com.componentes.landyard.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping
    public Evento save(@RequestBody Evento evento){
        return eventoRepository.save(evento);
    }
    @GetMapping("/{id}")
    public Evento findById(@PathVariable(value = "id") String id){
        return  eventoRepository.findbyid(id);
    }
    @GetMapping
    public List<Evento> findAll(){
        return eventoRepository.findAll();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable(value = "id") String id,
                         @RequestBody Evento evento){
        return eventoRepository.update(id, evento);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") String id){
        return eventoRepository.delete(id);
    }

}
