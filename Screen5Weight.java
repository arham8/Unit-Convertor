package com.example.unitconverter_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen5Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5_weight);
        Spinner rightDrop = (Spinner) findViewById(R.id.spinner10);
        Spinner leftDrop = (Spinner) findViewById(R.id.spinner9);
        String[] vals = new String[]{"mg", "g", "kg", "pounds"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, vals);
        leftDrop.setAdapter(adapter);
        rightDrop.setAdapter(adapter);

        Button ConvertButton3 = (Button) findViewById(R.id.button8);
        Button ConvertButton4 = (Button) findViewById(R.id.button9);
        TextView textview = (TextView) findViewById(R.id.editTextNumberDecimal10);
        TextView secondText = (TextView) findViewById(R.id.editTextNumberDecimal9);

        ConvertButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(textview.getText().toString());
                String getVal = String.valueOf(leftDrop.getSelectedItem());
                String resultVal = String.valueOf(rightDrop.getSelectedItem());
                switch (getVal) {
                    case ("mg"):
                        switch (resultVal) {
                            case "mg":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "g":
                                secondText.setText(String.valueOf(getNum / 1000));
                                break;
                            case "kg":
                                secondText.setText(String.valueOf(getNum / 1000000));
                                break;
                            case "pounds":
                                secondText.setText(String.valueOf(getNum / 453592));
                                break;
                        }
                        break;

                    case ("g"):
                        switch (resultVal) {
                            case "g":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "mg":
                                secondText.setText(String.valueOf(getNum * 1000));
                                break;
                            case "kg":
                                secondText.setText(String.valueOf(getNum / 1000));
                                break;
                            case "pounds":
                                secondText.setText(String.valueOf(getNum / 454));
                                break;
                        }
                        break;

                    case ("kg"):
                        switch (resultVal) {
                            case "kg":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "g":
                                secondText.setText(String.valueOf(getNum * 1000));
                                break;
                            case "mg":
                                secondText.setText(String.valueOf(getNum * 1000000));
                                break;
                            case "pounds":
                                secondText.setText(String.valueOf(getNum * 2.205));
                                break;
                        }
                        break;

                    case ("pounds"):
                        switch (resultVal) {
                            case "pounds":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "g":
                                secondText.setText(String.valueOf(getNum * 454));
                                break;
                            case "kg":
                                secondText.setText(String.valueOf(getNum / 2.205));
                                break;
                            case "mg":
                                secondText.setText(String.valueOf(getNum * 453592));
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
                    case ("mg"):
                        switch (resultVal) {
                            case "mg":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "g":
                                textview.setText(String.valueOf(getNum / 1000));
                                break;
                            case "kg":
                                textview.setText(String.valueOf(getNum / 1000000));
                                break;
                            case "pounds":
                                textview.setText(String.valueOf(getNum / 453592));
                                break;
                        }
                        break;

                    case ("g"):
                        switch (resultVal) {
                            case "g":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "mg":
                                textview.setText(String.valueOf(getNum * 1000));
                                break;
                            case "kg":
                                textview.setText(String.valueOf(getNum / 1000));
                                break;
                            case "pounds":
                                textview.setText(String.valueOf(getNum / 454));
                                break;
                        }
                        break;

                    case ("kg"):
                        switch (resultVal) {
                            case "kg":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "g":
                                textview.setText(String.valueOf(getNum * 1000));
                                break;
                            case "mg":
                                textview.setText(String.valueOf(getNum * 1000000));
                                break;
                            case "pounds":
                                textview.setText(String.valueOf(getNum * 2.205));
                                break;
                        }
                        break;

                    case ("pounds"):
                        switch (resultVal) {
                            case "pounds":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "g":
                                textview.setText(String.valueOf(getNum * 454));
                                break;
                            case "kg":
                                textview.setText(String.valueOf(getNum / 2.205));
                                break;
                            case "mg":
                                textview.setText(String.valueOf(getNum * 453592));
                                break;
                        }
                        break;
                }
            }
        });
    }
}