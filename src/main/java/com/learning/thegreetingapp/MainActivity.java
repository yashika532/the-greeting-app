package com.learning.thegreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView text;
EditText edittext;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        edittext=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = edittext.getText().toString();
                Toast.makeText(MainActivity.this,
                        "hello "+input+" welcome to my app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}