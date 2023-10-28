package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText messageEditText = findViewById(R.id.editTextView);
        Button sendButton = findViewById(R.id.button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el mensaje
                String message = messageEditText.getText().toString();

                Intent intent = new Intent("com.example.APP_ACTION");
                intent.putExtra("message", message);

                // Enviar
                sendBroadcast(intent);
            }
        });
    }
}