package com.tgv.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

public class BT3Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle
            persistentState)
    {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        PrintToast("Created");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        PrintToast("Paused");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        PrintToast("Restarted");
    }
    @Override
    protected void onResume() {
        super.onResume();
        PrintToast("Resumed");
    }
    @Override
    protected void onStart() {
        super.onStart();
        PrintToast("Started");
    }
    @Override
    protected void onStop() {
        super.onStop();
        PrintToast("Stopped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        PrintToast("Destroyed");
    }
    public void PrintToast(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}