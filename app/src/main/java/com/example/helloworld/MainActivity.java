package com.example.helloworld;

import android.app.Application;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("hello world");
        String name = Thread.currentThread().getName();
        button.setOnClickListener(it -> {
            // Timber.d(String.format("Hello, %s %s", name, name));
        });
        // setContentView(R.layout.activity_main);
        setContentView(button);
        Application application = getApplication();
        Bundle metaData = application.getApplicationInfo().metaData;
    }
}
