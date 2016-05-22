package com.example.kate.favscripture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOnClick(View v){

        Intent startNewActivity = new Intent(this, FavoriteScripture.class);
        // taking in text from user
        EditText book = (EditText) findViewById(R.id.Book);
        EditText chapter = (EditText) findViewById(R.id.Chapter);
        EditText verse = (EditText) findViewById(R.id.Verse);

        String Book = book.getText().toString();
        String Chapter = chapter.getText().toString();
        String Verse = verse.getText().toString();
        String scriptures = "Your favorite scriptures is: " + Book + " " + Chapter + ":" + Verse;

        startNewActivity.putExtra("scriptures", scriptures);
        startActivity(startNewActivity);
}

}