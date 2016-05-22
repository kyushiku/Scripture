package com.example.kate.favscripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FavoriteScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView fScrip = (TextView) findViewById(R.id.scripture);
        Intent Nin = getIntent();
        Bundle b = Nin.getExtras();
        if(b != null) {
        String scrip =(String) b.get("Scripture");
            fScrip.setText(scrip);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_scripture);
    }
}
