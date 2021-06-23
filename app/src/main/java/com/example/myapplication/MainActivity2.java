package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        // Получаем объект Intent, который запустил данную activity
        Intent intent = getIntent();
        // Получаем сообщение из объекта intent
        String message = intent.getStringExtra("message");
        String message2 = intent.getStringExtra("message2");
        // Получаем TextView по его id
        TextView messageText = (TextView) findViewById(R.id.messageText);
        TextView messageText1 = (TextView) findViewById(R.id.textView);
        // устанавливаем текст для TextView
        messageText.setText(message);
        messageText1.setText(message2);
    }
    public void back(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}