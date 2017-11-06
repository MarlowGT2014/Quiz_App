package com.example.android.quizapp_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup questionOne, questionTwo, questionThree;
    RadioButton answer_1a, answer_1b, answer_1c, answer_1d;
    RadioButton answer_2a, answer_2b, answer_2c, answer_2d;
    RadioButton answer_3a, answer_3b, answer_3c, answer_3d;
    CheckBox cb1, cb2, cb3, cb4;
    EditText answer_5;
    Button bt1, bt2, bt3, bt4, bt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionOne = (RadioGroup) findViewById(R.id.questionOne);
        questionTwo = (RadioGroup) findViewById(R.id.questionTwo);
        questionThree = (RadioGroup) findViewById(R.id.questionThree);

        answer_1a = (RadioButton) findViewById(R.id.answer_1a);
        answer_1b = (RadioButton) findViewById(R.id.answer_1b);
        answer_1c = (RadioButton) findViewById(R.id.answer_1c);
        answer_1d = (RadioButton) findViewById(R.id.answer_1d);

        answer_2a = (RadioButton) findViewById(R.id.answer_2a);
        answer_2b = (RadioButton) findViewById(R.id.answer_2b);
        answer_2c = (RadioButton) findViewById(R.id.answer_2c);
        answer_2d = (RadioButton) findViewById(R.id.answer_2d);

        answer_3a = (RadioButton) findViewById(R.id.answer_3a);
        answer_3b = (RadioButton) findViewById(R.id.answer_3b);
        answer_3c = (RadioButton) findViewById(R.id.answer_3c);
        answer_3d = (RadioButton) findViewById(R.id.answer_3d);

        cb1 = (CheckBox) findViewById(R.id.answer_4a);
        cb2 = (CheckBox) findViewById(R.id.answer_4b);
        cb3 = (CheckBox) findViewById(R.id.answer_4c);
        cb4 = (CheckBox) findViewById(R.id.answer_4d);

        answer_5 = (EditText) findViewById(R.id.answer_5);

        bt1 = (Button) findViewById(R.id.buttonOne);
        bt2 = (Button) findViewById(R.id.buttonTwo);
        bt3 = (Button) findViewById(R.id.buttonThree);
        bt4 = (Button) findViewById(R.id.buttonFour);
        bt5 = (Button) findViewById(R.id.buttonFive);
    }

    //Quiz Totals
    int correctAnswers = 0;
    int wrongAnswers = 0;

    public void answerQuestion1(View view) {

        int answer = 3;
        int result = 0;

        if (answer_1a.isChecked()) {result = 1;}
        if (answer_1b.isChecked()) {result = 2;}
        if (answer_1c.isChecked()) {result = 3;}
        if (answer_1d.isChecked()) {result = 4;}

        if (result == answer) {
            Toast.makeText(getApplicationContext(), "CORRECT!", Toast.LENGTH_LONG).show();
            correctAnswers++;
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong: You have failed...", Toast.LENGTH_LONG).show();
            wrongAnswers++;
        }

        bt1.setEnabled(false);
    }

    public void answerQuestion2(View view) {

        int answer = 4;
        int result = 0;

        if (answer_2a.isChecked()) {result = 1;}
        if (answer_2b.isChecked()) {result = 2;}
        if (answer_2c.isChecked()) {result = 3;}
        if (answer_2d.isChecked()) {result = 4;}

        if (result == answer) {
            Toast.makeText(getApplicationContext(), "CORRECT!", Toast.LENGTH_LONG).show();
            correctAnswers++;
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong: You have failed...", Toast.LENGTH_LONG).show();
            wrongAnswers++;
        }

        bt2.setEnabled(false);
    }

    public void answerQuestion3(View view) {

        int answer = 2;
        int result = 0;

        if (answer_3a.isChecked()) {result = 1;}
        if (answer_3b.isChecked()) {result = 2;}
        if (answer_3c.isChecked()) {result = 3;}
        if (answer_3d.isChecked()) {result = 4;}

        if (result == answer) {
            Toast.makeText(getApplicationContext(), "CORRECT!", Toast.LENGTH_LONG).show();
            correctAnswers++;
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong: You have failed...", Toast.LENGTH_LONG).show();
            wrongAnswers++;
        }

        bt3.setEnabled(false);
    }

    public void answerQuestion4(View view) {

        //Add Up the Correct Answers
        int answer = 7;
        int result = 0;

        if (cb1.isChecked()) { result = result + 1; }
        if (cb2.isChecked()) { result = result + 2; }
        if (cb3.isChecked()) { result = result + 3; }
        if (cb4.isChecked()) { result = result + 4; }

        if (result == answer) {
            Toast.makeText(getApplicationContext(), "CORRECT!", Toast.LENGTH_LONG).show();
            correctAnswers++;
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong: You have failed...", Toast.LENGTH_LONG).show();
            wrongAnswers++;
        }

        bt4.setEnabled(false);
    }

    public void answerQuestion5(View view) {

        String userAnswer = answer_5.getText().toString();

        if (userAnswer.contains("piano") || userAnswer.contains("Piano")) {
            Toast.makeText(getApplicationContext(), "CORRECT!", Toast.LENGTH_LONG).show();
            correctAnswers++;
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong: You have failed...", Toast.LENGTH_LONG).show();
            wrongAnswers++;
        }

        bt5.setEnabled(false);
    }

    public void showResults(View view) {
        double finalScore = (double) correctAnswers/5 * 100;

        String correct = "Correct Ans: " + correctAnswers;
        String incorrect = "Incorrect Ans: " + wrongAnswers;
        String results = "Your Score: " + finalScore;
        String comb = correct + "\n" + incorrect + "\n" + results;

        Toast.makeText(getApplicationContext(), comb, Toast.LENGTH_LONG).show();

    }

    public void reset(View view) {
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(true);
        bt4.setEnabled(true);

        questionOne.clearCheck();
        questionTwo.clearCheck();
        questionThree.clearCheck();

        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);

        answer_5.setText("");

        correctAnswers = 0;
        wrongAnswers = 0;

        Toast.makeText(getApplicationContext(), "Game Reset", Toast.LENGTH_LONG).show();


    }



}
