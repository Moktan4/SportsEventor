package com.sshrestha.android.sportsrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShresthaSailesh on 10/3/16.
 */
public class ParticipantActivity extends AppCompatActivity {
    Button GoToNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.participant_activity);
        GoToNewActivity = (Button) findViewById(R.id.submit);
        GoToNewActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(ParticipantActivity.this, CoordinatorActivity.class);
                startActivity(intent);

            }
        });
    }
}