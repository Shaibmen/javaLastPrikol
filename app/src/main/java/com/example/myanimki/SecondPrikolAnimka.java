package com.example.myanimki;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondPrikolAnimka extends AppCompatActivity {

    private ImageView animationTV;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_prikol_animka);
        animationTV = findViewById(R.id.frame_anim_iv);
        startBtn = findViewById(R.id.start_frame);
        pauseBtn = findViewById(R.id.pause_frame);

        AnimationDrawable frameAnimation = (AnimationDrawable) animationTV.getDrawable();

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameAnimation.start();
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameAnimation.stop();
            }
        });
    }
}