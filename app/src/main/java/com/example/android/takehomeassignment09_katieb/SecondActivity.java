package com.example.android.takehomeassignment09_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    private EditText songTitle;
    private EditText songLength;
    private CheckBox songVinyl;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference songRef = database.getReference("Playlist");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        songTitle = (EditText) findViewById(R.id.song_title);
        songLength = (EditText) findViewById(R.id.song_length);
        songVinyl = (CheckBox) findViewById(R.id.on_vinyl);
    }

    public void anotherSong(View view) {
        String title = songTitle.getText().toString();
        int length = Integer.parseInt(songLength.getText().toString());
        boolean vinyl = songVinyl.isChecked();

        Song s = new Song(title, length, vinyl);
        songRef.push().setValue(s);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
