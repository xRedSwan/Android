package com.example.marti.monapp.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.marti.monapp.classes.ConstantesJava;
import com.example.marti.monapp.R;

public class MainActivity extends AppCompatActivity {

    private Context context = MainActivity.this;
    private Intent toMenuActivity;

    private EditText editLogin, editPassword;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = context.getSharedPreferences(ConstantesJava.KPREFERENCE, MODE_PRIVATE);

        preferences();

        editLogin = (EditText) findViewById(R.id.user_login);
        editPassword = (EditText) findViewById(R.id.user_passwd);
    }

        public void preferences() {
            SharedPreferences.Editor spe = sp.edit();
            spe.putString(ConstantesJava.MY_LOGIN, "login");
            spe.putString(ConstantesJava.MY_PSSWD, "pass");
            spe.commit();
        }

    public void goCheck(View v){
        EditText v_login=(EditText)findViewById(R.id.user_login);
        EditText v_psswd=(EditText)findViewById(R.id.user_passwd);
        String login_saisi=v_login.getText().toString();
        String mdp_saisi=v_psswd.getText().toString();
        if (login_saisi.equals(ConstantesJava.MY_LOGIN) && mdp_saisi.equals(ConstantesJava.MY_PSSWD)){
            Toast.makeText(this, R.string.succes, Toast.LENGTH_SHORT).show();

            //Toast.makeText(this, login_saisi, Toast.LENGTH_SHORT).show(); //Cette ligne sert à afficher le login saisi
            //Toast.makeText(this, mdp_saisi, Toast.LENGTH_SHORT).show(); //Cette ligne sert à afficher le mot de passe saisi
            Intent toMenuActivity = new Intent(this, MenuActivity.class);
            startActivity(toMenuActivity);
        }
    }

}