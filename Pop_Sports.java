package com.example.android.quizzproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Mary on 1/6/2018.
 */

public class Pop_Sports extends Activity {
    //AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_sports);

        /**
         * set the new dimensions for our pop-up
         */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width1 = dm.widthPixels;
        int height1 = dm.heightPixels;
        /**
         * height and width to be 60% and 80% of the screen, that's why we multily by .6 and .8
         */
        getWindow().setLayout((int) (width1 * .7), (int) (height1 * .8));


        Bundle bundle = getIntent().getExtras();
        int result = bundle.getInt("answer");

        TextView text = findViewById(R.id.mesaj_sports_quiz);
        text.setText("Wooow!!! you are a big sports fan! ;) " + "\n\n\n" + "your score is: " + result + "/10");
    }


}
