package com.example.kel3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = "MainActivity";
    public CardView btuniv,btsd,btsmp,btsma;

    ImageView bg1, leaf;
    LinearLayout textsplash, texthome;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bg1 = (ImageView) findViewById(R.id.bg1);
        leaf = (ImageView) findViewById(R.id.leaf);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);

        bg1.animate().translationY(-1800).setDuration(2000).setStartDelay(100);
        leaf.animate().translationY(-1700).setDuration(2000).setStartDelay(100);
        textsplash.animate().translationY(140).alpha(0).setDuration(2000).setStartDelay(100);

        texthome.startAnimation(frombottom);

        btuniv = (CardView) findViewById(R.id.btuniv);
        btsd = (CardView) findViewById(R.id.btsd);
        btsmp = (CardView) findViewById(R.id.btsmp);
        btsma = (CardView) findViewById(R.id.btsma);

        btuniv.setOnClickListener(this);
        btsd.setOnClickListener(this);
        btsmp.setOnClickListener(this);
        btsma.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent i;

        switch (v.getId()){
            case R.id.btuniv:
                i = new Intent(this,UnivActivity.class);
                startActivity(i);
                break;

            case R.id.btsd:
                i = new Intent(this,SdActivity.class);
                startActivity(i);
                break;

            case R.id.btsmp:
                i = new Intent(this,SMPActivity.class);
                startActivity(i);
                break;

            case R.id.btsma:
                i = new Intent(this,SMAActivity.class);
                startActivity(i);
                break;
        }
    }
}