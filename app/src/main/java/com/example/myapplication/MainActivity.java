package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = new Intent(this, MainActivity2.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "train_db").allowMainThreadQueries().build();
//        Train train = new Train();
//        train.setExer("НОВАЯ ЗАПИСЬБ");
//        train.setRep(10);
//        train.setWeight(20);
//        db.trainDao().insertOne(train);


        List<Train> list = db.trainDao().getAll();
        Train trainnew = list.get(4);

        String message = trainnew.getExer();
        intent.putExtra("message", message);
        // запуск activity
        startActivity(intent);


    }
    public void sendMessage(View view) {
        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, MainActivity2.class);
        // Получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName);
        // Получае текст данного текстового поля
        String message = editText.getText().toString();
        String message2 = editText1.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra("message", message);
        intent.putExtra("message2", message2);
        // запуск activity
        startActivity(intent);
    }
    public void testDb(View view)
    {
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "train_db").build();
        Train train = new Train();
        train.setExer("test");
        train.setRep(10);
        train.setWeight(20);
        db.trainDao().insertOne(train);

    }
}