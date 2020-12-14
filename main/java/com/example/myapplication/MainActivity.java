package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   // public void clickFunction(View view)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Welcome to PSA App",Toast.LENGTH_SHORT).show();

        TextView settleForm = (TextView) findViewById(R.id.textView4);
        settleForm.setMovementMethod(LinkMovementMethod.getInstance());

        TextView instaLink = (TextView) findViewById(R.id.textView5);
        instaLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView devLink = (TextView) findViewById(R.id.textView7);
        devLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView fbLink = (TextView) findViewById(R.id.textView8);
        fbLink.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
