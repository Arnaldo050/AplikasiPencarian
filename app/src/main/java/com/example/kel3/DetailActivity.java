package com.example.kel3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewDetail;
    TextView textJudul,textDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewDetail = findViewById(R.id.imageViewDetail);
        textJudul = findViewById(R.id.textJudul);
        textDetail = findViewById(R.id.textDetail);

        getIncomingExtra();
    }
    private void getIncomingExtra(){

        if(getIntent().hasExtra("foto") && getIntent().hasExtra("judul") && getIntent().hasExtra("detail")){

            String foto = getIntent().getStringExtra("foto");
            String judul = getIntent().getStringExtra("judul");
            String detail = getIntent().getStringExtra("detail");

            setDataActivity(foto, judul, detail);
        }
    }
    private void setDataActivity(String foto, String judul, String detail){

        Glide.with(this).asBitmap().load(foto).into(imageViewDetail);

        textJudul.setText(judul);
        textDetail.setText(detail);


    }
}