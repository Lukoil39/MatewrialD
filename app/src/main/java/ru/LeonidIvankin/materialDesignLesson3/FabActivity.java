package ru.LeonidIvankin.materialDesignLesson3;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

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
