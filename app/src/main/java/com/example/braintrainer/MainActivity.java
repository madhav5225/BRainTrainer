package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static int setLevel;
     Button button;
    public  void level1(View view){
        Intent intent=new Intent(this,BrainGame2.class);
        setLevel=1;
        startActivity(intent);


    }
    public  void level2(View view){
        Intent intent=new Intent(this,BrainGame2.class);
        setLevel=2;        startActivity(intent);

    }
    public  void level3(View view){
        Intent intent=new Intent(this,BrainGame2.class);
        setLevel=3;
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
    }
}
