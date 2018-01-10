package com.example.android.quizzproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Mary on 1/2/2018.
 */

public class Culture_Quizz extends Activity{

    int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.culture_quizz);
    }

    private int checkAnswers(){
        /**
         * gaseste raspunsul de la intrebarea 1 si daca este corect il aduna la total
         */
        EditText q1EditText = (EditText)findViewById(R.id.answer_question_one_culture_quiz);
        String q1  =  q1EditText.getText().toString();

        if(q1.equals("Bucharest")){
            total++;
        }


        /**
         * gaseste raspunsul corect de la intrebarea 2 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q2RadioButton = findViewById(R.id.answer_two_question_two_culture_quiz);
        Boolean q2 = q2RadioButton.isChecked();

        if (q2 == true){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 3 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q3RadioButton = findViewById(R.id.answer_one_question_three_culture_quiz);
        Boolean q3 = q3RadioButton.isChecked();

        if (q3 == true){
            total++;
        }


        /**
         * gaseste raspunsul corect de la intrebarea 4 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q4RadioButton = findViewById(R.id.answer_three_question_four_culture_quiz);
        Boolean q4 = q4RadioButton.isChecked();

        if (q4 == true){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 5 si daca sunt bifate casutele corecte o aduna la total
         */
        CheckBox q5aRadioButton = findViewById(R.id.answer_one_question_five_culture_quiz);
        Boolean q5a = q5aRadioButton.isChecked();

        CheckBox q5bRadioButton = findViewById(R.id.answer_two_question_five_culture_quiz);
        Boolean q5b = q5bRadioButton.isChecked();

        if ((q5a == true) && (q5b == true)){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 6 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q6RadioButton = findViewById(R.id.answer_two_question_six_culture_quiz);
        Boolean q6 = q6RadioButton.isChecked();

        if (q6 == true){
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 7 si daca este corect il aduna la total
         */
        EditText q7EditText = (EditText)findViewById(R.id.answer_question_seven_sports_quiz);
        String q7  =  q7EditText.getText().toString();

        if(q7.equals("Acrophobia")){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 8 si daca sunt bifate casutele corecte o aduna la total
         */
        CheckBox q8aRadioButton = findViewById(R.id.answer_one_question_eight_culture_quiz);
        Boolean q8a = q8aRadioButton.isChecked();

        CheckBox q8bRadioButton = findViewById(R.id.answer_two_question_eight_culture_quiz);
        Boolean q8b = q8bRadioButton.isChecked();

        CheckBox q8cRadioButton = findViewById(R.id.answer_three_question_eight_culture_quiz);
        Boolean q8c = q8cRadioButton.isChecked();

        if ((q8a == true) && (q8b == true) && (q8c == true)){
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 9 si daca este corect il aduna la total
         */
        EditText q9EditText = (EditText)findViewById(R.id.answer_question_nine_culture_quiz);
        String q9  =  q9EditText.getText().toString();

        if(q9.equals("Evaporation")){
            total++;
        }


        /**
         * gaseste raspunsul corect de la intrebarea 10 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q10RadioButton = findViewById(R.id.answer_three_question_ten_culture_quiz);
        Boolean q10 = q10RadioButton.isChecked();

        if (q10 == true){
            total++;
        }

        return total;
    }

    /**
     * it opens the pop up to see the results
     */
    public void seeAnswerSportsQuiz(View v) {
        Button b = findViewById(R.id.culture_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Culture_Quizz.this, Pop_Culture.class));
            }
        });

        /**
         *   passes the data to the view I need: pop fashion
         */
        Intent passDataCultureQuiz = new Intent(Culture_Quizz.this, Pop_Culture.class);
        passDataCultureQuiz.putExtra("answer", checkAnswers());
        startActivity(passDataCultureQuiz);
    }
}
