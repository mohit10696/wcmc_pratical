package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signupdb extends AppCompatActivity {

    database myDb;
    EditText username,password,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupdb);
        username = findViewById(R.id.ID);
        password = findViewById(R.id.password);
        name = findViewById(R.id.name);
        myDb = new database(this);

    }

    public void signup(View view) {
        String uname = username.getText().toString();
        String pwd = password.getText().toString();
        String nm = name.getText().toString();
        boolean isInserted = myDb.insertData(uname,pwd,nm);
        if(isInserted == true)
            Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG).show();

        else
            Toast.makeText(getApplicationContext(),"Data not Inserted", Toast.LENGTH_LONG).show();

        onBackPressed();
    }

}
