package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pratical8 extends AppCompatActivity implements View.OnClickListener {

    Fragment f1,f2,f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1,b2,b3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical8);
        setTitle("Pratical 8");
        f1 = new fragment1();
        f2 = new fragment2();
        f3 = new fragment3();

//        loadFragment(f1,R.id.fragment1);
//        loadFragment(f2,R.id.fragment2);
//        loadFragment(f3,R.id.fragment3);
        b1 = findViewById(R.id.f1);
        b2 = findViewById(R.id.f2);
        b3 = findViewById(R.id.f3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }
    private void loadFragment(Fragment fragment,int id) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit(); // save the changes
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.f1:{
                loadFragment(f1,R.id.fragment1);
                break;
            }
            case R.id.f2:{
                loadFragment(f2,R.id.fragment1);
                break;
            }
            case R.id.f3:{
                loadFragment(f3,R.id.fragment1);
                break;
            }
        }
    }
}
