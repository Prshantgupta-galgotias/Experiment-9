package com.example.sony.experiment9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void callSecondActivity(View view){
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("Value1", "This is Prashant Gupta");
        i.putExtra("Value2", "Going to secont activity");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}
