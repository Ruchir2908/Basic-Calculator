package com.example.caatulgupta.cal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.first);
        e2 = findViewById(R.id.second);
        tv = findViewById(R.id.result);
    }

    public void calculate(View view){
        int id = view.getId();
        double result = 0.0;
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        if(e1.getText().toString().isEmpty()){
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
        }else{
            String firstNum = e1.getText().toString();
            firstNumber = Double.parseDouble(firstNum);
        }

        if(e2.getText().toString().isEmpty()){
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
        }else{
            String secondNum = e2.getText().toString();
            secondNumber = Double.parseDouble(secondNum);
        }

        switch(id){
            case R.id.add: result = firstNumber + secondNumber; break;
            case R.id.sub: result = firstNumber - secondNumber; break;
            case R.id.mul: result = firstNumber * secondNumber; break;
            case R.id.div: result = firstNumber / secondNumber; break;
            case R.id.clear: result = 0; break;
            default: tv.setText(result + " ");
        }
        tv.setText(result + " ");
        if(result==0){
            e1.setText("");
            e2.setText("");
        }
    }
}
