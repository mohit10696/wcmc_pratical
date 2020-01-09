package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class pratical3 extends AppCompatActivity {
    TimerTask task;
    Timer t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical3);
        t=new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Toast after 10sec", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        };

        t.scheduleAtFixedRate(task, 0, 10000);



    }

    public void stop(View view) {
        Toast.makeText(getApplicationContext(),"Stopped",Toast.LENGTH_LONG).show();
        task.cancel();
        t.cancel();
    }
}
