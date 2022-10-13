package com.demo.retrofit.logbook1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    String [] urlList;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);

        urlList = getResources().getStringArray(R.array.url);

        extracted();
    }

    private void extracted() {
        Glide.with(MainActivity.this)
                .load(urlList[i])
                .centerCrop()
                .into(img);
    }

    public void nextImg(View view){
        i++;
        if (i >=urlList.length)
            i = 0;
        extracted();
    }

    public void previousImg(View view){
        i--;
        if (i <=urlList.length)
            i = urlList.length -1;
        extracted();
    }
}