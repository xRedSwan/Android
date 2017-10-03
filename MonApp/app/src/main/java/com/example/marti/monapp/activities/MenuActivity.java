package com.example.marti.monapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.marti.monapp.R;
import com.example.marti.monapp.adapters.GameAdapter;
import com.example.marti.monapp.classes.ConstantesJava;
import com.example.marti.monapp.listeners.OnItem;
import com.example.marti.monapp.model.Jeux;

/**
 * Created by Marti on 02/10/2017.
 */

public class MenuActivity extends AppCompatActivity {
Jeux[] mes_jeux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        mes_jeux = ConstantesJava.InitArrayJeux(this);
        //Toast.makeText(this, mes_jeux[0], Toast.LENGTH_SHORT).show();
        initGridView();
    }
    public void initGridView(){
        GridView grille = (GridView)findViewById(R.id.grille1);
        grille.setAdapter(new GameAdapter(this,R.layout.grille1_element, mes_jeux));
        grille.setOnItemClickListener(new OnItem(mes_jeux, this));

    }
    protected void onActivityResult(int RQC, int ResCode, Intent intent){
        if (RQC==ConstantesJava.CODEBN){
            if (ResCode==ConstantesJava.STATUSOK){
                Toast.makeText(this, intent.getStringExtra(ConstantesJava.KBN), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
