package com.example.neclyeux.ufpinews2.controller.core;

import java.util.List;

/**
 * Created by Neclyeux on 11/07/2017.
 */

public class News {

    public String title;
    public String description;
    public Integer image;

    public News(){

    }

    public News(String title, String description, Integer image){
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
