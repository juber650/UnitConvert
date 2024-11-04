package com.example.unitconvert;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView3;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize views
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextText2);

        // Set onClickListener for the button
        button.setOnClickListener(view -> {
            // Your code for what happens when button is clicked
            String inputText = editText.getText().toString();
            Toast.makeText(MainActivity.this, "Button clicked with input: " + inputText, Toast.LENGTH_SHORT).show();
            String s = editText.getText().toString();
            int input = Integer.parseInt(inputText);
            int kg = Integer.parseInt(s);
            double pound = 2.205*kg;
            textView3.setText(String.valueOf("The value in pounds is: "+pound));
        });
    }
}
