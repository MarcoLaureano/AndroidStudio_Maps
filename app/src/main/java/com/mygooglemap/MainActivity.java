package com.mygooglemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goAuxilio, goExacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goAuxilio = (Button) findViewById(R.id.auxilioAct);
        goExacto = findViewById(R.id.exactoAct);

        goAuxilio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this, auxilio.class);
                startActivity(i);
            }
        });

        goExacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent( MainActivity.this, exactolocalizate.class);
                startActivity(a);
            }
        });
    }
}