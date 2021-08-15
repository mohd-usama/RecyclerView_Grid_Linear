
package com.usama.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IntentPage extends AppCompatActivity
{
    ImageView img;
    TextView t1;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_page);

        img=findViewById(R.id.imageView);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);

        img.setImageResource(getIntent().getIntExtra("Image_name",0));
        t1.setText(getIntent().getStringExtra("header"));
        t2.setText(getIntent().getStringExtra("sub"));
    }
}