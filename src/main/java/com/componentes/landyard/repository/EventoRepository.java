package com.componentes.landyard.repository;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.componentes.landyard.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventoRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Evento save (Evento evento){
        dynamoDBMapper.save(evento);
        return evento;
    }

    public Evento findbyid(String id){
        return dynamoDBMapper.load(Evento.class,id);
    }

    public List<Evento> findAll(){
        return dynamoDBMapper.scan(Evento.class, new DynamoDBScanExpression());
    }

    public String update(String id, Evento evento){
        dynamoDBMapper.save(evento,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("id",
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(id)
                                )));
        return id;
    }

    public String delete(String id){
        Evento evento = dynamoDBMapper.load(Evento.class, id);
        dynamoDBMapper.delete(evento);
        return "Evento a sido eleminado:: "+id;
    }
}
