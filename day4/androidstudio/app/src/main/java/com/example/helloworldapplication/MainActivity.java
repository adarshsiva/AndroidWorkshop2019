package com.example.helloworldapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    String name="Don says";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("LifeCycle", "onCreate");
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        if(savedInstanceState != null)
            name = savedInstanceState.getString("savedString");
        if (name == null)
            name = "World";
        else
            name = name;
        name = "Hello " + name + "!";
        textView.setText(name);
    }

    public void sayHello(View view) {
        name = editText.getText().toString();
        if (name.equals(""))
            name = "World";
        else
            name = name;
        name = "Hello " + name + "!";
        textView.setText(name);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("LifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("LifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("LifeCycle", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("LifeCycle", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("LifeCycle", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("LifeCycle", "onStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        name = editText.getText().toString();
        outState.putString("savedString",name);
    }
}