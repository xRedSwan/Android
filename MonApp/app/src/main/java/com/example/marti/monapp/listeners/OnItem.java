package com.example.marti.monapp.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.example.marti.monapp.activities.jeux.BatNavActivity;
import com.example.marti.monapp.classes.ConstantesJava;
import com.example.marti.monapp.model.Jeux;

/**
 * Created by Marti on 03/10/2017.
 */

public class OnItem implements AdapterView.OnItemClickListener {

    private Jeux[] jeuclic;
    private Activity activity;

    public OnItem(Jeux[] jeuclic, Activity activity){

        this.jeuclic = jeuclic;
        this.activity = activity;
    }

    @Override
    public void onItemClick(AdapterView av, View vue, int position, long id) {

            Intent toGameActivity = jeuclic[position].getIntent();
            //Intent intent = new Intent(vue.getContext(), BatNavActivity.class);
            //Toast.makeText(vue.getContext(), this.jeuclic[position].getNom(), Toast.LENGTH_SHORT).show();
            //this.activity.startActivityForResult(toGameActivity, ConstantesJava.CODEBN);
            this.activity.startActivity(toGameActivity);
        }
    };

