package com.komori.jobqueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.birbit.android.jobqueue.JobManager;

public class MainActivity extends AppCompatActivity {
    private JobManager jobManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jobManager = MyApp.getInstance().getJobManager();

        jobManager.addJobInBackground(new MJob("1"));
        jobManager.addJobInBackground(new MJob("2"));
        jobManager.addJobInBackground(new MJob("3"));
        jobManager.addJobInBackground(new MJob("4"));
        jobManager.addJobInBackground(new MJob("5"));
        jobManager.addJobInBackground(new MJob("6"));
    }
}
