package com.example.unitconverter_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen2Temp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_temp);
        Spinner rightDrop =(Spinner) findViewById(R.id.spinner);
        Spinner leftDrop = (Spinner) findViewById(R.id.spinner2);
        String[] vals = new String[] {"Kelvin", "Celsius","Fahrenheit"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,vals);
        leftDrop.setAdapter(adapter);
        rightDrop.setAdapter(adapter);

        Button ConvertButton= (Button) findViewById(R.id.ConvertButton);
        Button secondButton = (Button) findViewById(R.id.button2);
        TextView textview = (TextView) findViewById(R.id.editTextNumberDecimal2);
        TextView secondText = (TextView) findViewById(R.id.editTextNumberDecimal);


        ConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(textview.getText().toString());
                String getVal = String.valueOf(leftDrop.getSelectedItem());
                String resultVal = String.valueOf(rightDrop.getSelectedItem());
                switch (getVal) {
                    case("Kelvin"):
                        switch (resultVal) {
                            case "Kelvin":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "Celsius":
                                secondText.setText(String.valueOf(getNum -273.15));
                                break;
                            case "Fahrenheit":
                                Double temp = ((getNum - 273.15)*9)/5 +32;
                                secondText.setText(String.valueOf(temp));
                                break;
                        }
                        break;

                    case("Celsius"):
                        switch (resultVal) {
                            case "Celsius":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "Kelvin":
                                secondText.setText(String.valueOf(getNum + 273.15));
                                break;
                            case "Fahrenheit":
                                Double temp = (getNum*9)/5 +32;
                                secondText.setText(String.valueOf(temp));
                                break;
                        }
                        break;
                    case("Fahrenheit"):
                        switch (resultVal) {
                            case "Fahrenheit":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "Kelvin":
                                Double ans = (getNum -32) * 5/9 +273.5;
                                secondText.setText(String.valueOf(ans));
                                break;
                            case "Celsius":
                                Double temp = (getNum- 32)* 5/9;
                                secondText.setText(String.valueOf(temp));
                                break;
                        }
                        break;
                }

            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(secondText.getText().toString());
                String getVal = String.valueOf(leftDrop.getSelectedItem());
                String resultVal = String.valueOf(rightDrop.getSelectedItem());
                switch (getVal) {
                    case("Kelvin"):
                        switch (resultVal) {
                            case "Kelvin":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "Celsius":
                                textview.setText(String.valueOf(getNum -273.15));
                                break;
                            case "Fahrenheit":
                                Double temp = ((getNum - 273.15)*9)/5 +32;
                                textview.setText(String.valueOf(temp));
                                break;
                        }
                        break;

                    case("Celsius"):
                        switch (resultVal) {
                            case "Celsius":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "Kelvin":
                                textview.setText(String.valueOf(getNum + 273.15));
                                break;
                            case "Fahrenheit":
                                Double temp = (getNum*9)/5 +32;
                                textview.setText(String.valueOf(temp));
                                break;
                        }
                        break;
                    case("Fahrenheit"):
                        switch (resultVal) {
                            case "Fahrenheit":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "Kelvin":
                                Double ans = (getNum -32) * 5/9 +273.5;
                                textview.setText(String.valueOf(ans));
                                break;
                            case "Celsius":
                                Double temp = (getNum- 32)* 5/9;
                                textview.setText(String.valueOf(temp));
                                break;
                        }
                        break;
                }

            }
        });









    }
}