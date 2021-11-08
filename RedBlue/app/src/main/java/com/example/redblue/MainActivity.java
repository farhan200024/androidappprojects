package com.example.redblue;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    View view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1=this.getWindow().getDecorView();
    }


    public void RedColor(View v) {
        view1.setBackgroundResource(R.color.red);
    }
    public void BlueColor(View v) {
        view1.setBackgroundResource(R.color.blue);
    }
}
