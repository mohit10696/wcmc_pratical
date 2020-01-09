package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pratical5 extends AppCompatActivity {
    EditText ID,password;
    TextView textView;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical5);
        count=0;
        ID = findViewById(R.id.ID);
        password = findViewById(R.id.password);
        textView = findViewById(R.id.logintext);
    }


    public void loginmethod(View view) {
        if(ID.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
            textView.setText("LOGIN SUCCESSFULL");
            textView.setBackgroundColor(Color.parseColor("#ff0000"));
            count =0 ;
        }else{
            textView.setText("LOGIN FAILS");
            textView.setBackgroundColor(Color.parseColor("#00ff00"));
            count++;
        }
        if(count == 3 )findViewById(R.id.login).setEnabled(false);

    }
}
