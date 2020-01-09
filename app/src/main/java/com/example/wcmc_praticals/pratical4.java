package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class pratical4 extends AppCompatActivity {

    RadioGroup radioGroup;
    EditText editText;
    TextView textView;
    String x = "Result is: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical4);
        radioGroup = findViewById(R.id.groupradio);
        textView = findViewById(R.id.result);
        editText = findViewById(R.id.value);

    }

    public void calculate(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if(selectedId == R.id.radia_id1){
            Double value = Double.valueOf(editText.getText().toString());
            textView.setText(x+String.valueOf((value-32)*5/9));
        }
        else{
            Double value = Double.valueOf(editText.getText().toString());
            textView.setText(x+String.valueOf(((9*value)/5)+32));
        }
    }
}
