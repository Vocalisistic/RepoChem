package com.example.vocalisistic.chemarmenu;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void showCredits(View view) {
        Intent intent  = new Intent(this, credits.class);
        this.startActivity(intent);
    }

    public void showHow(View view) {
        Intent intent  = new Intent(this, credits.class);
        this.startActivity(intent);
    }
    
}
