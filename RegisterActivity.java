package com.sshrestha.android.sportsrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShresthaSailesh on 10/2/16.
 */
public class RegisterActivity extends AppCompatActivity {

    Button GoToNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        GoToNewActivity = (Button) findViewById(R.id.submit);

        GoToNewActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(RegisterActivity.this, EventListActivity.class);
                startActivity(intent);

            }
        });
    }



}