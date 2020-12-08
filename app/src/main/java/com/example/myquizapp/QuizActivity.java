package com.example.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    private  Button submitButton;
    private int score;
    private RadioGroup numOneRadioGroup;
    private RadioGroup numTwoRadioGroup;
    private RadioGroup numThreeRadioGroup;

    private EditText editText;
    private CheckBox imageCheckbox;
    private CheckBox movieCheckbox;
    private CheckBox audioCheckbox;
    private CheckBox allCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);

        numOneRadioGroup = findViewById(R.id.rd_One);
        numTwoRadioGroup = findViewById(R.id.rd_Two);
        numThreeRadioGroup = findViewById(R.id.rd_Three);

        editText = findViewById(R.id.OS_Text);
        imageCheckbox = findViewById(R.id.Image_Checkbox);
        movieCheckbox = findViewById(R.id.Movie_Checkbox);
        audioCheckbox = findViewById(R.id.Audio_Checkbox);
        allCheckbox = findViewById(R.id.All_Checkbox);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score = 0;

                if (numOneRadioGroup.getCheckedRadioButtonId() == R.id.Eighteen_Eighty_Btn){
                    score += 1;
                }

                if (numTwoRadioGroup.getCheckedRadioButtonId() == R.id.Field_Btn){
                    score += 1;
                }

                String question3Answer = editText.getText().toString();
                if(question3Answer.equalsIgnoreCase("Operating System")){
                    score += 1;
                }

                if (numThreeRadioGroup.getCheckedRadioButtonId() == R.id.Nineteen_zero){
                    score += 1;
                }

                if(!imageCheckbox.isChecked() && movieCheckbox.isChecked() && !audioCheckbox.isChecked() && !allCheckbox.isChecked()){
                    score += 1;
                }

                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", score);
                startActivity(intent);
            }
        });
    }
}