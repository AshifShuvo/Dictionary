package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.input);
        Button search = findViewById(R.id.search);

        search.setOnClickListener(v -> {

            String searched = input.getText().toString().toLowerCase();
            Intent i = new Intent(getApplicationContext(), Dictionary.class);
            i.putExtra("searchedWord", searched);
            startActivity(i);

        });
    }




}