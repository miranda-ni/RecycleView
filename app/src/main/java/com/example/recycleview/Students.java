package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Students extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        editText = findViewById(R.id.line);
        editText1 = findViewById(R.id.line1);
        editText2 = findViewById(R.id.line2);
    }
    public  void save (View view){
        String string = editText.getText().toString();
        String string1 = editText1.getText().toString();
        String string2 = editText2.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("name",string);
        intent.putExtra("surname",string1);
        intent.putExtra("group",string2);
        setResult(RESULT_OK,intent);
        finish();

    }

}
