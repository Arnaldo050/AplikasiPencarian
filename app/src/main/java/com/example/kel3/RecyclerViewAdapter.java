package com.example.kel3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> imageview = new ArrayList<>();
    private ArrayList<String> imageviewdetail = new ArrayList<>();
    private ArrayList<String> textView1 = new ArrayList<>();
    private ArrayList<String> textView2 = new ArrayList<>();
    private ArrayList<String> detail = new ArrayList<>();

    private Context context;

    public RecyclerViewAdapter(ArrayList<String> imageview, ArrayList<String> imageviewdetail, ArrayList<String> textView1, ArrayList<String> textView2, ArrayList<String> detail, Context context) {
        this.imageview = imageview;
        this.imageviewdetail = imageviewdetail;
        this.textView1 = textView1;
        this.textView2 = textView2;
        this.detail = detail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        Glide.with(context).asBitmap().load(imageview.get(position)).into(holder.imageView);
        holder.textViewUniv.setText(textView1.get(position));
        holder.textViewUniv2.setText(textView2.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto", imageviewdetail.get(position));
                intent.putExtra("judul", textView1.get(position));
                intent.putExtra("detail", detail.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return textView1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewUniv;
        TextView textViewUniv2;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewUniv = itemView.findViewById(R.id.textView1);
            textViewUniv2 = itemView.findViewById(R.id.textView2);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
