package com.sshrestha.android.sportsrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShresthaSailesh on 10/3/16.
 */
public class EventListActivity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);

        b1 = (Button) findViewById(R.id.select1);
        b2 = (Button) findViewById(R.id.select2);
        b3 = (Button) findViewById(R.id.select3);
    }

            public void onClick(View v) {

                // Intent code for open new activity through intent.
                if(v.getId()==R.id.select1 || v.getId()==R.id.select2 || v.getId()==R.id.select3) {
                    Intent intent = new Intent(EventListActivity.this, SportsSelect.class);
                    startActivity(intent);
                }

            }

    }



