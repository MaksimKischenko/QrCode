package com.example.QrCode.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QrEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text;

    public QrEntity(){

    }

    public QrEntity(String text){
        this.text = text;

    }
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + text + '\'' +
                '}';
    }


    public String getText() {
        return text;
    }

    public void setText(String fullName) {
        this.text = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
