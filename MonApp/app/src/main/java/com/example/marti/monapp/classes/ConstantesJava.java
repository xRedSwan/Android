package com.example.marti.monapp.classes;

import android.content.Context;
import android.content.Intent;

import com.example.marti.monapp.R;
import com.example.marti.monapp.activities.jeux.BatNavActivity;
import com.example.marti.monapp.activities.jeux.ChevauxActivity;
import com.example.marti.monapp.activities.jeux.DamesActivity;
import com.example.marti.monapp.activities.jeux.EchecsActivity;
import com.example.marti.monapp.activities.jeux.Puissance4Activity;
import com.example.marti.monapp.activities.jeux.SudokuActivity;
import com.example.marti.monapp.model.Jeux;

import java.util.Objects;

/**
 * Created by Marti on 02/10/2017.
 */

public class ConstantesJava {
    public final static String MY_LOGIN="";
    public final static String MY_PSSWD="";

    public static Jeux[] InitArrayJeux(Context context){
        Jeux Dames = new Jeux (context.getResources().getString(R.string.dames),R.drawable.dame, new Intent(context, DamesActivity.class));
        Jeux Sudoku = new Jeux (context.getResources().getString(R.string.sudoku),R.drawable.sudoku, new Intent(context, SudokuActivity.class));
        Jeux Puissance4 = new Jeux (context.getResources().getString(R.string.puissance4),R.drawable.p4, new Intent(context, Puissance4Activity.class));
        Jeux Chevaux = new Jeux (context.getResources().getString(R.string.chevaux),R.drawable.chevaux, new Intent(context, ChevauxActivity.class));
        Jeux BatailleNavale = new Jeux (context.getResources().getString(R.string.bataillenavale),R.drawable.bn, new Intent(context, BatNavActivity.class));
        Jeux Echecs = new Jeux (context.getResources().getString(R.string.echecs),R.drawable.echecs, new Intent(context, EchecsActivity.class));

        return new Jeux[]{Dames, Sudoku, Puissance4, Chevaux, BatailleNavale, Echecs};
    }

    public final static int CODED=0;
    public final static String KD="dames";
    public final static int CODES=1;
    public final static String KS="sudoku";
    public final static int CODEP4=2;
    public final static String KP4="puissance4";
    public final static int CODEC=3;
    public final static String KC="chevaux";
    public final static int CODEBN=4;
    public final static String KBN="batnav";
    public final static int CODEE=5;
    public final static String KE="echecs";

    public final static int STATUSOK=1;
    public final static String KPREFERENCE="pref";
}

