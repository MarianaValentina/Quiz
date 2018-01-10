package com.example.android.quizzproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Mary on 1/6/2018.
 */

public class Pop_Fashion extends Activity {
    //AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_fashion);

        /**
         * set the new dimensions for our pop-up
         */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        /**
         * height and width to be 60% and 80% of the screen, that's why we multily by .6 and .8
         */
        getWindow().setLayout((int) (width * .7), (int) (height * .8));


        Bundle bundle = getIntent().getExtras();
        int result = bundle.getInt("answer");

        TextView text = findViewById(R.id.mesaj_fashion_quiz);
        text.setText("looks like you are a \"marie claire\" reader" + "\n\n\n" + "your score is: " + result + "/10");
    }


}
