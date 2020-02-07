package com.example.wcmc_praticals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class fragment1 extends android.app.Fragment {
    ListView simpleList;
    String countryList[] = {"Divyesh","Avanit","Nirav","Yash","Maulik","Shivam","Radhey","Rutvik","Arjun","Aradhi","Mandeep","Nikhil","Aayushi","Anushree","Manali","Kunj","Japan","Hetul","Ankit","Mohit","Pooja"};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);


        simpleList = (ListView)view.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(view.getContext(), R.layout.activity_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);




        return view;
    }
}
