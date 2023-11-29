package com.componentes.landyard.model;
import java.util.Date;

public class Evento{
    private Date date;
    private String name;
    private String producer;
    private String place;
    private String img;

    //Constructor
    public Evento() {
    }

    public Evento(Date date, String name, String producer, String place, String img) {
        this.date = date;
        this.name = name;
        this.producer = producer;
        this.place = place;
        this.img = img;
    }

    //Getter & Setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", place='" + place + '\'' +
                ", img='" + img + '\'' +
                '}';
    }


}//
