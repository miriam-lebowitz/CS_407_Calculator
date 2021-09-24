package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText firstNumber =  findViewById(R.id.firstNumber);
        int num1 = Integer.parseInt(firstNumber.getText().toString());

        EditText secondNumber =  findViewById(R.id.secondNumber);
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        switch (view.getId()) {
            case R.id.addition:
                goToActivity2(num1 + num2);
                break;
            case R.id.subtraction:
                goToActivity2(num1 - num2);
                break;
            case R.id.multiplication:
                goToActivity2(num1 * num2);
                break;
            case R.id.division:
                goToActivity2(num1 / num2);
                break;
        }
    }

    public void goToActivity2(int result) {
        Intent intent = new Intent(this, MainActivity2.class);
        String str = "" + result;
        intent.putExtra("message", str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}