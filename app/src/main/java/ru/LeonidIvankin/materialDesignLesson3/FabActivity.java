package ru.LeonidIvankin.materialDesignLesson3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class FabActivity extends AppCompatActivity {

    private static final String TAG = "FabActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Toast", Snackbar.LENGTH_SHORT).show();
                Log.d(TAG, "onClick: ");
            }
        });


    }

}
