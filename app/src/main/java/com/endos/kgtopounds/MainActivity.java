package com.endos.kgtopounds;

import static java.nio.file.Files.find;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button; //object
    private TextView textView; //object
    private EditText editText; //object
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button); //assign the object to @+id/button
        textView = findViewById(R.id.textView3); //assign the object to @+id/textView3
        editText = findViewById(R.id.editTextText); //assign the object to @+id/editTextText
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
                                //sent a small massage box
                String s = editText.getText().toString();
                int KG = Integer.parseInt(s);
                double Pound = 2.205*KG;
                textView.setText("The Corrosponding Value is " + Pound);
                Toast.makeText(MainActivity.this, "Thank you for using", Toast.LENGTH_SHORT).show();
            }
        });

    }
}