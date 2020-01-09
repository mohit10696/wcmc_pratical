package com.example.wcmc_praticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class pratical6 extends AppCompatActivity {

    Button flash;
    boolean state;
    String mCameraId = null;
    CameraManager mCameraManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical6);
        setTitle("Pratical 6");
        state = false;
        flash = findViewById(R.id.flash);
        mCameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            mCameraId = mCameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(state){
                        Log.d(String.valueOf(state), "onClick: ");
                        mCameraManager.setTorchMode(mCameraId, false);
                        flash.setText("FLASHLIGHT OFF");
                        state = false;
                    }else{
                        mCameraManager.setTorchMode(mCameraId, true);
                        Log.d(String.valueOf(state), "onClick: ");
                        flash.setText("FLASHLIGHT ON");
                        state = true;
                    }


                } catch (CameraAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
