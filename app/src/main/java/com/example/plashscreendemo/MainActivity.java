package com.example.plashscreendemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=5000;
    View black, green, red, blue, five, six;
    TextView r, slogan;
    Animation topAnimation, bottomAnimation, middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        black = findViewById(R.id.blackid);
        green = findViewById(R.id.greenid);
        red = findViewById(R.id.redid);
        blue = findViewById(R.id.blueid);
        five = findViewById(R.id.fiveid);
        six = findViewById(R.id.sixid);

        r=findViewById(R.id.rtextid);
        slogan = findViewById(R.id.sloganid);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation= AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        black.setAnimation(topAnimation);
        green.setAnimation(topAnimation);
        red.setAnimation(topAnimation);
        blue.setAnimation(topAnimation);
        five.setAnimation(topAnimation);
        six.setAnimation(topAnimation);

        r.setAnimation(middleAnimation);
        slogan.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,scondActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
