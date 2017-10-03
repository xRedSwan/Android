package com.example.marti.monapp.model;

import android.content.Intent;
import android.view.View;

/**
 * Created by Marti on 02/10/2017.
 */

public class Jeux {
    private String nom;
    private int image;
    private Intent intent;

    public String getNom(){
        return nom;
    }
    public int getImage(){
        return image;
    }
    public Intent getIntent() { return intent;}

    public Jeux(String s, int i,Intent t){
        this.nom=s;
        this.image=i;
        this.intent=t;

    }
}
