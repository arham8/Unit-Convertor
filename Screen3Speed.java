package com.example.unitconverter_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen3Speed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3_speed);
        Spinner rightDrop = (Spinner) findViewById(R.id.spinner4);
        Spinner leftDrop = (Spinner) findViewById(R.id.spinner3);
        String[] vals = new String[]{"kmph", "mph", "m/s", "knots"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, vals);
        leftDrop.setAdapter(adapter);
        rightDrop.setAdapter(adapter);

        Button ConvertButton3 = (Button) findViewById(R.id.ConvertButton3);
        Button ConvertButton4 = (Button) findViewById(R.id.ConvertButton4);
        TextView textview = (TextView) findViewById(R.id.editTextNumberDecimal4);
        TextView secondText = (TextView) findViewById(R.id.editTextNumberDecimal3);

        ConvertButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(textview.getText().toString());
                String getVal = String.valueOf(leftDrop.getSelectedItem());
                String resultVal = String.valueOf(rightDrop.getSelectedItem());
                switch (getVal) {
                    case ("kmph"):
                        switch (resultVal) {
                            case "kmph":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "mph":
                                secondText.setText(String.valueOf(getNum / 1.609));
                                break;
                            case "m/s":
                                secondText.setText(String.valueOf(getNum / 3.6));
                                break;
                            case "knots":
                                secondText.setText(String.valueOf(getNum / 1.852));
                                break;
                        }
                        break;

                    case ("mph"):
                        switch (resultVal) {
                            case "mph":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "kmph":
                                secondText.setText(String.valueOf(getNum * 1.609));
                                break;
                            case "m/s":
                                secondText.setText(String.valueOf(getNum / 2.237));
                                break;
                            case "knots":
                                secondText.setText(String.valueOf(getNum / 1.151));
                                break;
                        }
                        break;

                    case ("m/s"):
                        switch (resultVal) {
                            case "m/s":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "mph":
                                secondText.setText(String.valueOf(getNum * 2.237));
                                break;
                            case "kmph":
                                secondText.setText(String.valueOf(getNum *3.6));
                                break;
                            case "knots":
                                secondText.setText(String.valueOf(getNum *1.944));
                                break;
                        }
                        break;

                    case ("knots"):
                        switch (resultVal) {
                            case "knots":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "mph":
                                secondText.setText(String.valueOf(getNum * 1.151));
                                break;
                            case "m/s":
                                secondText.setText(String.valueOf(getNum / 1.944));
                                break;
                            case "kmph":
                                secondText.setText(String.valueOf(getNum * 1.852));
                                break;
                        }
                        break;
                }
            }
        });

        ConvertButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(secondText.getText().toString());
                String getVal = String.valueOf(rightDrop.getSelectedItem());
                String resultVal = String.valueOf(leftDrop.getSelectedItem());
                switch (getVal) {
                    case ("kmph"):
                        switch (resultVal) {
                            case "kmph":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "mph":
                                textview.setText(String.valueOf(getNum / 1.609));
                                break;
                            case "m/s":
                                textview.setText(String.valueOf(getNum / 3.6));
                                break;
                            case "knots":
                                textview.setText(String.valueOf(getNum / 1.852));
                                break;
                        }
                        break;

                    case ("mph"):
                        switch (resultVal) {
                            case "mph":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "kmph":
                                textview.setText(String.valueOf(getNum * 1.609));
                                break;
                            case "m/s":
                                textview.setText(String.valueOf(getNum / 2.237));
                                break;
                            case "knots":
                                textview.setText(String.valueOf(getNum / 1.151));
                                break;
                        }
                        break;

                    case ("m/s"):
                        switch (resultVal) {
                            case "m/s":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "mph":
                                textview.setText(String.valueOf(getNum * 2.237));
                                break;
                            case "kmph":
                                textview.setText(String.valueOf(getNum *3.6));
                                break;
                            case "knots":
                                textview.setText(String.valueOf(getNum *1.944));
                                break;
                        }
                        break;

                    case ("knots"):
                        switch (resultVal) {
                            case "knots":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "mph":
                                textview.setText(String.valueOf(getNum * 1.151));
                                break;
                            case "m/s":
                                textview.setText(String.valueOf(getNum / 1.944));
                                break;
                            case "kmph":
                                textview.setText(String.valueOf(getNum * 1.852));
                                break;
                        }
                        break;
                }
            }
        });


    }

}