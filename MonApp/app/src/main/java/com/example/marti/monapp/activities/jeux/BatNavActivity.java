package com.example.marti.monapp.activities.jeux;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.marti.monapp.R;
import com.example.marti.monapp.classes.ConstantesJava;

/**
 * Created by Marti on 03/10/2017.
 */

public class BatNavActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batnav);
        /*Intent intent = new Intent();
        intent.putExtra(ConstantesJava.KBN, "Tu as coulé tous les navires, bravo mon che... Capitaine");
        setResult(ConstantesJava.STATUSOK, intent);
        finish();*/
    }


}
