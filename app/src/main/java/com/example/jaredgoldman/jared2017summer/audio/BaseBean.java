package com.example.jaredgoldman.jared2017summer.audio;

import java.io.Serializable;

/**
 * Created by jaredgoldman on 6/21/17.
 */

public class BaseBean implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
