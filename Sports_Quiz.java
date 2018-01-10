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

public class Sports_Quizz extends Activity{

    int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_quizz);
    }

    private int checkAnswers(){
        /**
         * gaseste raspunsul corect de la intrebarea 1 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q1RadioButton = findViewById(R.id.answer_three_question_one_sports_quiz);
        Boolean q1 = q1RadioButton.isChecked();

        if (q1 == true){
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 2 si daca este corect il aduna la total
         */
        EditText q2EditText = (EditText)findViewById(R.id.answer_question_two_sports_quiz);
        String q2  =  q2EditText.getText().toString();

        if(q2.equals("James Douglas") || q2.equals("Douglas") || q2.equals("J.Douglas") || q2.equals("J. Douglas")){
            total++;
        }


        /**
         * gaseste raspunsul corect de la intrebarea 3 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q3RadioButton = findViewById(R.id.answer_one_question_three_sports_quiz);
        Boolean q3 = q3RadioButton.isChecked();

        if (q3 == true){
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 4 si daca este corect il aduna la total
         */
        EditText q4EditText = (EditText)findViewById(R.id.answer_question_four_sports_quiz);
        String q4  =  q4EditText.getText().toString();

        if(q4.equals("34") || q4.equals("Thirty Four")){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 5 si daca sunt bifate casutele corecte o aduna la total
         */
        CheckBox q5aRadioButton = findViewById(R.id.answer_one_question_five_sports_quiz);
        Boolean q5a = q5aRadioButton.isChecked();

        CheckBox q5bRadioButton = findViewById(R.id.answer_two_question_five_sports_quiz);
        Boolean q5b = q5bRadioButton.isChecked();

        if ((q5a == true) && (q5b == true)){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 6 si daca este bifata casuta corecta o aduna la total
         */
        RadioButton q6RadioButton = findViewById(R.id.answer_one_question_six_sports_quiz);
        Boolean q6 = q6RadioButton.isChecked();

        if (q6 == true){
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 7 si daca este corect il aduna la total
         */
        EditText q7EditText = (EditText)findViewById(R.id.answer_question_seven_sports_quiz);
        String q7  =  q7EditText.getText().toString();

        if(q7.equals("22") || q7.equals("Twenty Two")){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 8 si daca sunt bifate casutele corecte o aduna la total
         */
        CheckBox q8aRadioButton = findViewById(R.id.answer_one_question_eight_sports_quiz);
        Boolean q8a = q8aRadioButton.isChecked();

        CheckBox q8cRadioButton = findViewById(R.id.answer_three_question_eight_sports_quiz);
        Boolean q8c = q8cRadioButton.isChecked();

        if ((q8a == true) && (q8c == true)){
            total++;
        }

        /**
         * gaseste raspunsul de la intrebarea 9 si daca este corect il aduna la total
         */
        EditText q9EditText = (EditText)findViewById(R.id.answer_question_nine_sports_quiz);
        String q9  =  q9EditText.getText().toString();

        if(q9.equals("11") || q9.equals("November")){
            total++;
        }

        /**
         * gaseste raspunsul corect de la intrebarea 10 si daca sunt bifate casutele corecte o aduna la total
         */
        CheckBox q10aRadioButton = findViewById(R.id.answer_one_question_ten_sports_quiz);
        Boolean q10a = q10aRadioButton.isChecked();

        CheckBox q10bRadioButton = findViewById(R.id.answer_two_question_ten_sports_quiz);
        Boolean q10b = q10bRadioButton.isChecked();

        CheckBox q10cRadioButton = findViewById(R.id.answer_three_question_ten_sports_quiz);
        Boolean q10c = q10cRadioButton.isChecked();

        if ((q10a == true) && (q10b == true) && (q10c == true)){
            total++;
        }



        return total;
    }

    /**
     * it opens the pop up to see the results
     */
    public void seeAnswerSportsQuiz(View v) {
        Button b = findViewById(R.id.sports_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sports_Quizz.this, Pop_Sports.class));
            }
        });

        /**
         *   passes the data to the view I need: pop fashion
         */
        Intent passDataSportsQuiz = new Intent(Sports_Quizz.this, Pop_Sports.class);
        passDataSportsQuiz.putExtra("answer", checkAnswers());
        startActivity(passDataSportsQuiz);
    }
}
