package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

import static com.example.braintrainer.MainActivity.setLevel;

public class BrainGame2 extends AppCompatActivity {
CountDownTimer timer;
TextView textView1;TextView textView2;TextView textView8;TextView textView9;

TextView textView3,textView10;TextView textView4;TextView textView5;TextView textView6;TextView textView7;
Button button;
Animation animation;
public static int p,q,ch,a,b,c,d,n,t,tc,start;
public void start(View view){
    //textView9.setAlpha(0.0f);
   // textView10.setAlpha(0.0f);
    //textView10.setText("");
    start=1;
    //Log.i("hello",""+n+""+t);
    button.setVisibility(View.INVISIBLE);
    if(tc==0) {
        timer.start();
    tc=1;}
    String ss=""+n+"/"+t;
    textView3.setText(ss);
    p=new Random().nextInt(201*setLevel)+10;
    q=new Random().nextInt(201*setLevel)+10;
    a=p+q;
    b=a+20;
    c=a-10;
    d=a+100;
    textView2.setText(ss);
    ch=new Random().nextInt(4)+1;
   // Log.i("hh",""+ch);
   // Log.i("hh",""+(p+q));
   //  int z=p+q;
   // Log.i("hh",""+z);
if(ch==1)
{
    textView4.setText(""+a);
    textView5.setText(""+b);
    textView6.setText(""+c);
    textView7.setText(""+d);
}
    else if(ch==2)
    {
        textView4.setText(""+b);
        textView5.setText(""+a);
        textView6.setText(""+c);
        textView7.setText(""+d);
    }
    else if(ch==3)
    {
        textView4.setText(""+c);
        textView5.setText(""+b);
        textView6.setText(""+a);
        textView7.setText(""+d);
    }
    else if(ch==4)
    {
        textView4.setText(""+d);
        textView5.setText(""+b);
        textView6.setText(""+c);
        textView7.setText(""+a);
    }

}

    public void click1(View view){
    if(start==1){
if(Integer.parseInt(textView4.getText().toString())==(p+q)){
    textView10.setText("CORRECT");
    n++;t++;
}
else {
    t++;
    textView10.setText("INCORRECT");
}start(view);}
    }
    public void click2(View view){
        if(start==1){
        if(Integer.parseInt(textView5.getText().toString())==(p+q)){
            textView10.setText("CORRECT");        n++;t++;
        }
        else{
            t++;
            textView10.setText("INCORRECT");}
        start(view);}
    } public void click3(View view){
        if(start==1){
    if(Integer.parseInt(textView6.getText().toString())==(p+q)){
            n++;t++;textView10.setText("CORRECT");
        }
        else{
            t++;
        textView10.setText("INCORRECT");}
        start(view);}
} public void click4(View view){
        if(start==1){if(Integer.parseInt(textView7.getText().toString())==(p+q)){
            n++;t++;textView10.setText("CORRECT");;
        }
        else {
            t++;
            textView10.setText("INCORRECT");}start(view);}
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_game2);

        button=(Button)findViewById(R.id.button2);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView8=(TextView)findViewById(R.id.textView8);
        textView10=(TextView)findViewById(R.id.textView10);

        textView8.setText("Level "+setLevel);
        textView9=(TextView)findViewById(R.id.textView9);

        timer=new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long l) {
                textView1.setText(""+(l/1000)+"s");

            }

            @Override
            public void onFinish() {
                textView1.setText("0s");
                textView10.setText("");

button.setVisibility(View.VISIBLE);tc=0;start=0;t=0;
textView9.setText("Your Score:"+n);n=0;
                animation=new AlphaAnimation(0.0f,1.0f);
                textView9.setAlpha(1.0f);
                animation.setDuration(3000);
                textView9.startAnimation(animation);
            }
        };

    }
}
