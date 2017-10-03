package com.example.marti.monapp.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marti.monapp.R;
import com.example.marti.monapp.model.Jeux;

/**
 * Created by Marti on 02/10/2017.
 */

public class GameAdapter extends ArrayAdapter {
    private Context ctx;
    private Jeux[] jeux;
    private int layout;

    public class ViewHolderMyAdapter{
        public TextView tv;
        public ImageView iv;
        public ViewHolderMyAdapter(TextView texte, ImageView image){
            this.tv = texte;
            this.iv = image;
        }
    }
    public GameAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Jeux[] jeux) {
        super(context, resource, jeux);
        this.ctx = context;
        this.layout = resource;
        this.jeux = jeux;
    }
    @Override
    public View getView(int position, View vue, ViewGroup vg){
        ViewHolderMyAdapter vh;
        if (vue==null) {
            vue = LayoutInflater.from(ctx).inflate(layout, null);
            ImageView iv = (ImageView)vue.findViewById(R.id.imagejeu);
            TextView tv= (TextView)vue.findViewById(R.id.textjeu);
            vh = new ViewHolderMyAdapter(tv, iv);
            vue.setTag(vh);
        }else {
            vh = (ViewHolderMyAdapter)vue.getTag();
        }

        Jeux jeu = jeux[position];
        vh.tv.setText(jeu.getNom());
        vh.iv.setImageResource(jeu.getImage());
        Log.e("DEBUG", "getView");

        return vue;

    }
}
