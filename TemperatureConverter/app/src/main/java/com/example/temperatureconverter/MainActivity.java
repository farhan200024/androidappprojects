package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.text.TextUtils;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    double tempgiven;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert_temp(View V) {
        final TextView result = (TextView) findViewById(R.id.textView);
        final EditText temp = (EditText) findViewById(R.id.editText2);
        final RadioButton fahreitToCelsius = (RadioButton) findViewById(R.id.radFahToCelsius);

        final RadioButton celToFahrenheit = (RadioButton) findViewById(R.id.radCelToFahrenheit);

        tempgiven = Double.parseDouble(temp.getText().toString());

        //calculations to do if the button is pressed

        if (fahreitToCelsius.isChecked()) {

            double convert_celsius = ((tempgiven - 32) * 5 / 9);

            String str = String.format("%5.2f", convert_celsius);
            double display_result = Double.valueOf(str);

            result.setText(String.valueOf(display_result) + " degrees centigrade.");

            fahreitToCelsius.setChecked(false);

        }

        //calculations to do if the button is pressed

        if (celToFahrenheit.isChecked()) {

            double convert_fahrenheit = (32 + tempgiven * 9 / 5 );

            String str = String.format("%5.2f", convert_fahrenheit);
            double display_result = Double.valueOf(str);

            result.setText(String.valueOf(display_result) + " degrees Fahrenheit.");

            celToFahrenheit.setChecked(false);

        }

    }
}


