package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class pratical8 extends AppCompatActivity {

    Fragment f1,f2,f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical8);
        setTitle("Pratical 8");
        f1 = new fragment1();
        f2 = new fragment2();

        loadFragment(f1,R.id.fragment1);
        loadFragment(f2,R.id.fragment2);
       // loadFragment(f3,R.id.fragment3);

    }
    private void loadFragment(Fragment fragment,int id) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit(); // save the changes
    }

}
