package com.usama.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recyclerview And cardView");

        recyclerView=(RecyclerView)findViewById(R.id.recycle);
       //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(sentData(),getApplicationContext());
        recyclerView.setAdapter(adapter);

      /*  LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);*/

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> sentData()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("java Programming");
        ob1.setSub("desktop And App Language ");
        ob1.setImage_name(R.drawable.java);
        holder.add(ob1);


        Model ob2=new Model();
        ob2.setHeader("kotlin Programming");
        ob2.setSub("App language");
        ob2.setImage_name(R.drawable.kotlin);
        holder.add(ob2);


        Model ob3=new Model();
        ob3.setHeader("C Programming");
        ob3.setSub("Desktop language");
        ob3.setImage_name(R.drawable.c);
        holder.add(ob3);


        Model ob4=new Model();
        ob4.setHeader("C++ Programming");
        ob4.setSub("Desktop language");
        ob4.setImage_name(R.drawable.cpp);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("flutter Programming");
        ob5.setSub("Desktop language");
        ob5.setImage_name(R.drawable.flutter);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("php Programming");
        ob6.setSub("Desktop language");
        ob6.setImage_name(R.drawable.php);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("python Programming");
        ob7.setSub("Desktop language");
        ob7.setImage_name(R.drawable.py);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("ruby Programming");
        ob8.setSub("Desktop language");
        ob8.setImage_name(R.drawable.ruby1);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("scala Programming");
        ob9.setSub("Desktop language");
        ob9.setImage_name(R.drawable.scala);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("swift Programming");
        ob10.setSub("Desktop language");
        ob10.setImage_name(R.drawable.swift);
        holder.add(ob10);

        return holder;
    }
}

//text design for vertical scroll
//android:layout_marginLeft="15dp"  //text
//android:layout_toRightOf="@+id/img1"  //text