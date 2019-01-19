package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.londonappbrewery.magiceightball.R;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.id.askButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay = findViewById(R.id.image_eightBall);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

         Button myButtton = findViewById(R.id.askButton);

         myButtton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Log.d("Pressed Button","Buttton Pressed");

                 Random random = new Random();
                 int number = random.nextInt(5);
                 Log.d("Random Number", " is " + number);

                 ballDisplay.setImageResource(ballArray[number]);

             }
         });





    }
}
