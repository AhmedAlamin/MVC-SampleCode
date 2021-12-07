package com.example.mvc_samplecode.ui;

import com.example.mvc_samplecode.pojo.MovieModel;

public class Controller {

    public MovieModel getDataFromDatabase(){
        return new MovieModel("cast a way","very sad movie");
    }


}
