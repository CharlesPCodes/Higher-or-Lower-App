package com.example.charles.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber; // puting an int before classes makes it a global int

    public void guess(View view){

        EditText numberField = (EditText)findViewById(R.id.userInput);
        Double numberAmount = Double.parseDouble(numberField.getText().toString());
        String message = "";
        if (numberAmount == randomNumber){
            message = "Correct! Well Done!";
            Random randomGenerator = new Random();
            randomNumber = randomGenerator.nextInt(11);
        }
        else if(numberAmount < randomNumber){
            message = "Higher";
        }else{
           message = "Lower";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Random randomGenerator = new Random();
         randomNumber = randomGenerator.nextInt(11);
    }

}
