package com.sshrestha.android.sportsrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShresthaSailesh on 10/3/16.
 */
public class ArchiveActivity extends AppCompatActivity {

Button archiveActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.archive_activity);
       Button b2 = (Button) findViewById(R.id.archive);
    }
    public void onClick(View v) {

        if (v.getId() == R.id.archive) {

            Intent intent = new Intent(ArchiveActivity.this, DemoArchivePage.class);
            startActivity(intent);

    }
}}