package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class pratical10 extends AppCompatActivity {

    EditText username,password;
    database myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical10);
        username = findViewById(R.id.ID);
        password = findViewById(R.id.password);
        myDb = new database(this);
    }

    public void loginmethod(View view) {
        String user = username.getText().toString();
        String pwd = password.getText().toString();
        Cursor res = myDb.getData(user);
        if(res.getCount() == 0){
            Toast.makeText(getApplicationContext(), "No user found", Toast.LENGTH_SHORT).show();
        }
        else{
            String names = "";
            String pd = "";
            while (res.moveToNext()) {
                names = res.getString(2);
                pd = res.getString(1);
            }
            if(pd.equals(pwd))
                Toast.makeText(getApplicationContext(),"Welcome, "+names,Toast.LENGTH_LONG).show();
            else
                Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_LONG).show();
        }
        

    }

    public void singup(View view) {
        startActivity(new Intent(getApplicationContext(),signupdb.class));
    }


}
