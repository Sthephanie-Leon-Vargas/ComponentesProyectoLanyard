package com.componentes.landyard.controller;
import com.componentes.landyard.model.Evento;
import com.componentes.landyard.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class MenuController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping("/menu")
    public String menu (Model model){
        return "menu";
    }
    @PostMapping("/menu/crear")
    public Evento save(@RequestBody Evento evento){
        return eventoRepository.save(evento);
    }
    @GetMapping("/menu/{id}")
    public Evento findById(@PathVariable(value = "id") String id){
        return  eventoRepository.findbyid(id);
    }
    @GetMapping("/menu/all")
    public List<Evento> findAll(){
        return eventoRepository.findAll();
    }

    @PutMapping("/menu/{id}")
    public String update(@PathVariable(value = "id") String id,
                         @RequestBody Evento evento){
        return eventoRepository.update(id, evento);
    }

    @DeleteMapping("(/menu/{id}")
    public String delete(@PathVariable(value = "id") String id){
        return eventoRepository.delete(id);
    }
}
