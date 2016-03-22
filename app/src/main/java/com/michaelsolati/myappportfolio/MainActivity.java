package com.michaelsolati.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        String buttonText = ((Button) v).getText().toString();
        Toast.makeText(this, "This button launches the " + buttonText + " app", Toast.LENGTH_LONG).show();
    }
}
