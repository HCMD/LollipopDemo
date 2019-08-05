package com.lollipop.lollipopdemo.Android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lollipop.lollipopdemo.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this,"one",Toast.LENGTH_LONG).show();
           }
       });
       findViewById(R.id.two).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this,"two",Toast.LENGTH_LONG).show();
           }
       });

    }
}
