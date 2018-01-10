package com.example.android.quizzproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Mary on 1/6/2018.
 */

public class Pop_Culture extends Activity {
    //AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_culture);

        /**
         * set the new dimensions for our pop-up
         */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width2 = dm.widthPixels;
        int height2 = dm.heightPixels;
        /**
         * height and width to be 60% and 80% of the screen, that's why we multily by .6 and .8
         */
        getWindow().setLayout((int) (width2 * .7), (int) (height2 * .8));


        Bundle bundle = getIntent().getExtras();
        int result = bundle.getInt("answer");

        TextView text = findViewById(R.id.mesaj_culture_quiz);
        text.setText("you really like to know stuff!" + "\n\n\n" + "your score is: " + result + "/10");
    }


}
