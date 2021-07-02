package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private Date deliveredOn;

    public Lesson(){}

    public Lesson(String title, String deliveredOn){
        this.title = title;
        this.deliveredOn = Date.valueOf(deliveredOn);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(String deliveredOn) {
        this.deliveredOn = Date.valueOf(deliveredOn);
    }

    @Override
    public String toString() {
        return "Lesson [ id=" + id + ", title=" + title + ", deliveredOn=" + deliveredOn  +" ]";
    }
}

