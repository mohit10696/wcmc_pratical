package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class pratical7 extends AppCompatActivity {

    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical7);
        setTitle("Pratical 7");
        relativeLayout = findViewById(R.id.layout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.blue:{
            relativeLayout.setBackgroundColor(Color.parseColor("#9999ff"));
            break;
        }
            case R.id.tan:{
                relativeLayout.setBackgroundColor(Color.parseColor("#bdb76b"));
                break;
        }
            case R.id.pink:{
                relativeLayout.setBackgroundColor(Color.parseColor("#ffccff"));
                break;
        }
            case R.id.violet:{
                relativeLayout.setBackgroundColor(Color.parseColor("#7f00ff"));
                break;
        }

    }
        return(super.onOptionsItemSelected(item));
    }
}
