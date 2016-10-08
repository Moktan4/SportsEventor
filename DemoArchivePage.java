package com.sshrestha.android.sportsrecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ShresthaSailesh on 10/3/16.
 */
public class DemoArchivePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_archive_page);
        Button btn1 = (Button) findViewById(R.id.btn1);
    }

        public void onClick(View v) {
            // TODO Auto-generated method stub
            finish();
            System.exit(0);
}

}