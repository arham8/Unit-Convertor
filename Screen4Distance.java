package com.example.unitconverter_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen4Distance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4_distance);
        Spinner rightDrop = (Spinner) findViewById(R.id.spinner6);
        Spinner leftDrop = (Spinner) findViewById(R.id.spinner5);
        String[] vals = new String[]{"cm", "m", "km", "miles","yards"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, vals);
        leftDrop.setAdapter(adapter);
        rightDrop.setAdapter(adapter);

        Button ConvertButton3 = (Button) findViewById(R.id.button4);
        Button ConvertButton4 = (Button) findViewById(R.id.button5);
        TextView textview = (TextView) findViewById(R.id.editTextNumberDecimal6);
        TextView secondText = (TextView) findViewById(R.id.editTextNumberDecimal5);

        ConvertButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(textview.getText().toString());
                String getVal = String.valueOf(leftDrop.getSelectedItem());
                String resultVal = String.valueOf(rightDrop.getSelectedItem());
                switch (getVal) {
                    case ("cm"):
                        switch (resultVal) {
                            case "cm":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "m":
                                secondText.setText(String.valueOf(getNum / 100));
                                break;
                            case "km":
                                secondText.setText(String.valueOf(getNum / 100000));
                                break;
                            case "miles":
                                secondText.setText(String.valueOf(getNum / 160934));
                                break;
                            case "yards":
                                secondText.setText(String.valueOf(getNum / 91.44));
                                break;
                        }
                        break;

                    case ("m"):
                        switch (resultVal) {
                            case "m":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                secondText.setText(String.valueOf(getNum * 100));
                                break;
                            case "km":
                                secondText.setText(String.valueOf(getNum / 1000));
                                break;
                            case "miles":
                                secondText.setText(String.valueOf(getNum / 1609));
                                break;
                            case "yards":
                                secondText.setText(String.valueOf(getNum * 1.094));
                                break;
                        }
                        break;

                    case ("km"):
                        switch (resultVal) {
                            case "km":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                secondText.setText(String.valueOf(getNum * 100000));
                                break;
                            case "m":
                                secondText.setText(String.valueOf(getNum * 1000));
                                break;
                            case "miles":
                                secondText.setText(String.valueOf(getNum / 1.609));
                                break;
                            case "yards":
                                secondText.setText(String.valueOf(getNum * 1094));
                                break;
                        }
                        break;
                    case ("miles"):
                        switch (resultVal) {
                            case "miles":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                secondText.setText(String.valueOf(getNum * 160934));
                                break;
                            case "km":
                                secondText.setText(String.valueOf(getNum *1.609));
                                break;
                            case "m":
                                secondText.setText(String.valueOf(getNum * 1609));
                                break;
                            case "yards":
                                secondText.setText(String.valueOf(getNum * 1760));
                                break;
                        }
                        break;
                    case ("yards"):
                        switch (resultVal) {
                            case "yards":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                secondText.setText(String.valueOf(getNum * 91.44));
                                break;
                            case "km":
                                secondText.setText(String.valueOf(getNum / 1094));
                                break;
                            case "miles":
                                secondText.setText(String.valueOf(getNum / 1760));
                                break;
                            case "m":
                                secondText.setText(String.valueOf(getNum / 1.094));
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
                    case ("cm"):
                        switch (resultVal) {
                            case "cm":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "m":
                                textview.setText(String.valueOf(getNum / 100));
                                break;
                            case "km":
                                textview.setText(String.valueOf(getNum / 100000));
                                break;
                            case "miles":
                                textview.setText(String.valueOf(getNum / 160934));
                                break;
                            case "yards":
                                textview.setText(String.valueOf(getNum / 91.44));
                                break;
                        }
                        break;

                    case ("m"):
                        switch (resultVal) {
                            case "m":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                textview.setText(String.valueOf(getNum * 100));
                                break;
                            case "km":
                                textview.setText(String.valueOf(getNum / 1000));
                                break;
                            case "miles":
                                textview.setText(String.valueOf(getNum / 1609));
                                break;
                            case "yards":
                                textview.setText(String.valueOf(getNum * 1.094));
                                break;
                        }
                        break;

                    case ("km"):
                        switch (resultVal) {
                            case "km":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                textview.setText(String.valueOf(getNum * 100000));
                                break;
                            case "m":
                                textview.setText(String.valueOf(getNum * 1000));
                                break;
                            case "miles":
                                textview.setText(String.valueOf(getNum / 1.609));
                                break;
                            case "yards":
                                textview.setText(String.valueOf(getNum * 1094));
                                break;
                        }
                        break;
                    case ("miles"):
                        switch (resultVal) {
                            case "miles":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                textview.setText(String.valueOf(getNum * 160934));
                                break;
                            case "km":
                                textview.setText(String.valueOf(getNum *1.609));
                                break;
                            case "m":
                                textview.setText(String.valueOf(getNum * 1609));
                                break;
                            case "yards":
                                textview.setText(String.valueOf(getNum * 1760));
                                break;
                        }
                        break;
                    case ("yards"):
                        switch (resultVal) {
                            case "yards":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "cm":
                                textview.setText(String.valueOf(getNum * 91.44));
                                break;
                            case "km":
                                textview.setText(String.valueOf(getNum / 1094));
                                break;
                            case "miles":
                                textview.setText(String.valueOf(getNum / 1760));
                                break;
                            case "m":
                                textview.setText(String.valueOf(getNum / 1.094));
                                break;
                        }
                        break;

                }
            }
        });
    }
}