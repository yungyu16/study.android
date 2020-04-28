package com.example.helloworld;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("hello world");
        String name = Thread.currentThread().getName();
        button.setOnClickListener(it -> {
            AlertDialog alertDialog1 = new AlertDialog.Builder(this)
                    .setTitle("这是标题")//标题
                    .setMessage("这是内容")//内容
                    .setIcon(R.mipmap.ic_launcher)//图标
                    .setNegativeButton(R.string.app_name, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.i("hello", "world");
                        }
                    })
                    .create();
            alertDialog1.show();
        });

        // setContentView(R.layout.activity_main);
        setContentView(button);
        Application application = getApplication();
        Bundle metaData = application.getApplicationInfo().metaData;
    }
}
