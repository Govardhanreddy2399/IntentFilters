package com.example.intentfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.edit1);

    }

    public void browser(View view) {
        String url=et1.getText().toString();
        Uri webpage= Uri.parse("https://www."+url);
        Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }
}