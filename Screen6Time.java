package com.example.unitconverter_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen6Time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6_time);
        Spinner rightDrop = (Spinner) findViewById(R.id.spinner8);
        Spinner leftDrop = (Spinner) findViewById(R.id.spinner7);
        String[] vals = new String[]{"seconds", "minutes", "hours", "days","months","years"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, vals);
        leftDrop.setAdapter(adapter);
        rightDrop.setAdapter(adapter);

        Button ConvertButton3 = (Button) findViewById(R.id.button6);
        Button ConvertButton4 = (Button) findViewById(R.id.button7);
        TextView textview = (TextView) findViewById(R.id.editTextNumberDecimal7);
        TextView secondText = (TextView) findViewById(R.id.editTextNumberDecimal8);

        ConvertButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double getNum = Double.parseDouble(textview.getText().toString());
                String getVal = String.valueOf(leftDrop.getSelectedItem());
                String resultVal = String.valueOf(rightDrop.getSelectedItem());
                switch (getVal) {
                    case ("seconds"):
                        switch (resultVal) {
                            case "seconds":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                secondText.setText(String.valueOf(getNum / 60));
                                break;
                            case "hours":
                                secondText.setText(String.valueOf(getNum / 3600));
                                break;
                            case "days":
                                secondText.setText(String.valueOf(getNum / 86400));
                                break;
                            case "months":
                                secondText.setText(String.valueOf(getNum / 2628002));
                                break;
                            case "years":
                                secondText.setText(String.valueOf(getNum / 31536000));
                                break;
                        }
                        break;

                    case ("minutes"):
                        switch (resultVal) {
                            case "minutes":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "seconds":
                                secondText.setText(String.valueOf(getNum * 60));
                                break;
                            case "hours":
                                secondText.setText(String.valueOf(getNum / 60));
                                break;
                            case "days":
                                secondText.setText(String.valueOf(getNum / 1440));
                                break;
                            case "months":
                                secondText.setText(String.valueOf(getNum / 43800));
                                break;
                            case "years":
                                secondText.setText(String.valueOf(getNum / 525600));
                                break;
                        }
                        break;

                    case ("hours"):
                        switch (resultVal) {
                            case "hours":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                secondText.setText(String.valueOf(getNum * 60));
                                break;
                            case "seconds":
                                secondText.setText(String.valueOf(getNum * 3600));
                                break;
                            case "days":
                                secondText.setText(String.valueOf(getNum / 24));
                                break;
                            case "months":
                                secondText.setText(String.valueOf(getNum / 730));
                                break;
                            case "years":
                                secondText.setText(String.valueOf(getNum / 8760));
                                break;
                        }
                        break;

                    case ("days"):
                        switch (resultVal) {
                            case "days":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                secondText.setText(String.valueOf(getNum * 1440));
                                break;
                            case "hours":
                                secondText.setText(String.valueOf(getNum * 24));
                                break;
                            case "seconds":
                                secondText.setText(String.valueOf(getNum * 86400));
                                break;
                            case "months":
                                secondText.setText(String.valueOf(getNum / 30.4));
                                break;
                            case "years":
                                secondText.setText(String.valueOf(getNum / 365));
                                break;
                        }
                        break;
                    case ("months"):
                        switch (resultVal) {
                            case "months":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                secondText.setText(String.valueOf(getNum * 43800));
                                break;
                            case "hours":
                                secondText.setText(String.valueOf(getNum * 730));
                                break;
                            case "days":
                                secondText.setText(String.valueOf(getNum * 30.4));
                                break;
                            case "seconds":
                                secondText.setText(String.valueOf(getNum * 2628002));
                                break;
                            case "years":
                                secondText.setText(String.valueOf(getNum / 12));
                                break;
                        }
                        break;
                    case ("years"):
                        switch (resultVal) {
                            case "years":
                                secondText.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                secondText.setText(String.valueOf(getNum * 525600));
                                break;
                            case "hours":
                                secondText.setText(String.valueOf(getNum * 8760));
                                break;
                            case "days":
                                secondText.setText(String.valueOf(getNum * 365));
                                break;
                            case "months":
                                secondText.setText(String.valueOf(getNum * 12));
                                break;
                            case "seconds":
                                secondText.setText(String.valueOf(getNum * 31536000));
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
                    case ("seconds"):
                        switch (resultVal) {
                            case "seconds":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                textview.setText(String.valueOf(getNum / 60));
                                break;
                            case "hours":
                                textview.setText(String.valueOf(getNum / 3600));
                                break;
                            case "days":
                                textview.setText(String.valueOf(getNum / 86400));
                                break;
                            case "months":
                                textview.setText(String.valueOf(getNum / 2628002));
                                break;
                            case "years":
                                textview.setText(String.valueOf(getNum / 31536000));
                                break;
                        }
                        break;

                    case ("minutes"):
                        switch (resultVal) {
                            case "minutes":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "seconds":
                                textview.setText(String.valueOf(getNum * 60));
                                break;
                            case "hours":
                                textview.setText(String.valueOf(getNum / 60));
                                break;
                            case "days":
                                textview.setText(String.valueOf(getNum / 1440));
                                break;
                            case "months":
                                textview.setText(String.valueOf(getNum / 43800));
                                break;
                            case "years":
                                textview.setText(String.valueOf(getNum / 525600));
                                break;
                        }
                        break;

                    case ("hours"):
                        switch (resultVal) {
                            case "hours":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                textview.setText(String.valueOf(getNum * 60));
                                break;
                            case "seconds":
                                textview.setText(String.valueOf(getNum * 3600));
                                break;
                            case "days":
                                textview.setText(String.valueOf(getNum / 24));
                                break;
                            case "months":
                                textview.setText(String.valueOf(getNum / 730));
                                break;
                            case "years":
                                textview.setText(String.valueOf(getNum / 8760));
                                break;
                        }
                        break;

                    case ("days"):
                        switch (resultVal) {
                            case "days":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                textview.setText(String.valueOf(getNum * 1440));
                                break;
                            case "hours":
                                textview.setText(String.valueOf(getNum * 24));
                                break;
                            case "seconds":
                                textview.setText(String.valueOf(getNum * 86400));
                                break;
                            case "months":
                                textview.setText(String.valueOf(getNum / 30.4));
                                break;
                            case "years":
                                textview.setText(String.valueOf(getNum / 365));
                                break;
                        }
                        break;
                    case ("months"):
                        switch (resultVal) {
                            case "months":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                textview.setText(String.valueOf(getNum * 43800));
                                break;
                            case "hours":
                                textview.setText(String.valueOf(getNum * 730));
                                break;
                            case "days":
                                textview.setText(String.valueOf(getNum * 30.4));
                                break;
                            case "seconds":
                                textview.setText(String.valueOf(getNum * 2628002));
                                break;
                            case "years":
                                textview.setText(String.valueOf(getNum / 12));
                                break;
                        }
                        break;
                    case ("years"):
                        switch (resultVal) {
                            case "years":
                                textview.setText(String.valueOf(getNum));
                                break;
                            case "minutes":
                                textview.setText(String.valueOf(getNum * 525600));
                                break;
                            case "hours":
                                textview.setText(String.valueOf(getNum * 8760));
                                break;
                            case "days":
                                textview.setText(String.valueOf(getNum * 365));
                                break;
                            case "months":
                                textview.setText(String.valueOf(getNum * 12));
                                break;
                            case "seconds":
                                textview.setText(String.valueOf(getNum * 31536000));
                                break;
                        }
                        break;
                }
            }
        });
    }
}