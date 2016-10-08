package com.sshrestha.android.sportsrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.orgPage);
        b2 = (Button) findViewById(R.id.parPage);
    }
            public void onClick(View v) {

                if (v.getId() == R.id.orgPage) {

                    Intent intent = new Intent(MainActivity.this, SecondMainActivity.class);
                    startActivity(intent);
                } else if (v.getId() == R.id.parPage) {

                    Intent intent = new Intent(MainActivity.this, ArchiveActivity.class);
                    startActivity(intent);
                }


    }
}