package com.componentes.landyard.model;
import java.util.Date;

public class evento {
    private Date date;
    private String name;
    private String producer;
    private String venue;
    private String image;

    //Constructor
    public evento() {
    }
    public evento(Date date, String name, String producer, String venue, String image) {
        this.date = date;
        this.name = name;
        this.producer = producer;
        this.venue = venue;
        this.image = image;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "evento{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", venue='" + venue + '\'' +
                ", image='" + image + '\'' +
                '}';
    }


}//
