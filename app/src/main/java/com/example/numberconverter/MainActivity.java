package com.example.numberconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textViewBinary, textViewOctal, textViewHexadecimal;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        editText = findViewById(R.id.editTextNumber);
        textViewBinary = findViewById(R.id.textViewBinary);
        textViewOctal = findViewById(R.id.textViewOctal);
        textViewHexadecimal = findViewById(R.id.textViewHexadecimal);
    }
    
    public void convertNaumber(View view) {
        number = Integer.parseInt(editText.getText().toString());
        textViewBinary.setText(Integer.toBinaryString(number));
        textViewOctal.setText(Integer.toOctalString(number));
        textViewHexadecimal.setText(Integer.toHexString(number));
    }
}