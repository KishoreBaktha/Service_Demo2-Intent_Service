package com.example.kishorebaktha.service_demo2intent_service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void StartService(View v)
    {
        Intent intent=new Intent(this,MyService.class);
        startService(intent);
    }
    public void StopService(View v)
    {
        Intent intent=new Intent(this,MyService.class);
        stopService(intent);
    }
}
