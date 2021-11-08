package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button addition;
    private  Button sub;
    private  Button multi;
    private Button division;
    private Button btnclr;

    private EditText opr1;
    private EditText opr2;

    private TextView txtresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opr1 = (EditText) findViewById(R.id.editOp1);
        opr2 = (EditText) findViewById(R.id.editOp2);

        ///declaring the buttons for add, multiply, subtract and divide
        addition = (Button) findViewById(R.id.addition);
        sub = (Button) findViewById(R.id.subb);
        multi = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.division);

        btnclr = (Button) findViewById(R.id.clr);

        txtresult= (TextView) findViewById(R.id.txtresult);
        // Addition
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter A Value",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //Subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter A value",Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        // Multiplication
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 * oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter A value",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        // Division
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 / oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter A value",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
         // Reset all the Fields
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("0.00");
                opr1.requestFocus();
            }
        });


    }


    }



