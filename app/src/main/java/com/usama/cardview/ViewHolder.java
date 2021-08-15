package com.usama.cardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder
{
    ImageView img;
    TextView t1;
    TextView t2;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.img1);
        t1=(TextView)itemView.findViewById(R.id.text1);
        t2=(TextView)itemView.findViewById(R.id.text2);
    }
}
