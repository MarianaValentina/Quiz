package com.example.android.quizzproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Mary on 1/2/2018.
 */

public class Fashion_Quizz extends Activity {

    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashion_quizz);

    }

    private int checkAnswers() {
        /**
         * gaseste raspunsul corect de la intrebarea 1 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q1RadioButton = findViewById(R.id.answer_one_question_one_fashion_quiz);
        Boolean q1 = q1RadioButton.isChecked();

        if (q1 == true) {
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 2 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q2RadioButton = findViewById(R.id.answer_three_question_two_fashion_quiz);
        Boolean q2 = q2RadioButton.isChecked();

        if (q2 == true) {
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 3 si daca este corect il aduna la total
         */
        EditText q3EditText = (EditText) findViewById(R.id.answer_question_three_fashion_quiz);
        String q3 = q3EditText.getText().toString();

        if (q3.equals("Handbags") || q3.equals("Handbag") || q3.equals("Purse") || q3.equals("Purses")) {
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 4 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q4RadioButton = findViewById(R.id.answer_two_question_four_fashion_quiz);
        Boolean q4 = q4RadioButton.isChecked();

        if (q4 == true) {
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 5 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q5RadioButton = findViewById(R.id.answer_two_question_five_fashion_quiz);
        Boolean q5 = q5RadioButton.isChecked();

        if (q5 == true) {
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 6 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q6RadioButton = findViewById(R.id.answer_one_question_six_fashion_quiz);
        Boolean q6 = q6RadioButton.isChecked();

        if (q6 == true) {
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 7 si daca este corect il aduna la total
         */
        EditText q7EditText = (EditText) findViewById(R.id.answer_question_seven_fashion_quiz);
        String q7 = q7EditText.getText().toString();

        if (q7.equals("Milliner") || q7.equals("Milliners")) {
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 8 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q8RadioButton = findViewById(R.id.answer_one_question_eight_fashion_quiz);
        Boolean q8 = q8RadioButton.isChecked();

        if (q8 == true) {
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 9 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q9RadioButton = findViewById(R.id.answer_three_question_nine_fashion_quiz);
        Boolean q9 = q9RadioButton.isChecked();

        if (q9 == true) {
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 10 si daca este corect il aduna la total
         */
        EditText q10EditText = (EditText) findViewById(R.id.answer_question_ten_fashion_quiz);
        String q10 = q10EditText.getText().toString();

        if (q10.equals("Clothing") || q10.equals("Clothes")) {
            total++;
        }

        return total;
    }


    /**
     * it opens the pop up to see the results
     */
    public void seeAnswerFashionQuiz(View v) {
        Button b = findViewById(R.id.fashion_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fashion_Quizz.this, Pop_Fashion.class));
            }
        });

        /**
         *   passes the data to the view I need: pop fashion
         */
        Intent passDataFashionQuiz = new Intent(this, Pop_Fashion.class);
        passDataFashionQuiz.putExtra("answer", checkAnswers());
        startActivity(passDataFashionQuiz);
    }
}
