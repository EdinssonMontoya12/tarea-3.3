package com.edinsson.tarea_semana_3.modelo;

public class CardViewMain {

    private String picture;
    private String name;
    private String raitingNumber;

    public CardViewMain(String picture, String name, String likenumber) {
        this.picture = picture;
        this.name = name;
        this.raitingNumber = likenumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaitingNumber() {
        return raitingNumber;
    }

    public void setRaitingNumber(String likenumber) {
        this.raitingNumber = likenumber;
    }

}
