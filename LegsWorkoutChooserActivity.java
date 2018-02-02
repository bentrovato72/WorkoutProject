package com.bentrovato.workoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by deaven on 1/9/2018.
 */

public class LegsWorkoutChooserActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legs_workout_chooser);
        getSupportActionBar().setTitle("");
        setupWidgets();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home_button:
                Intent openMainActivity = new Intent(this, MainActivity.class);
                openMainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(openMainActivity);

            case R.id.back_button:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setupWidgets(){
        Button mSquatsBtn = findViewById(R.id.squatsButton);
        Button mDumbbellLungesBtn = findViewById(R.id.dumbbellLungesButton);
        Button mLyingLegCurlsBtn = findViewById(R.id.lyingLegCurlsButton);
        Button mLegCurlsBtn = findViewById(R.id.legCurlsButton);
        Button mLegExtensionsBtn = findViewById(R.id.legExtensionsButton);
        Button mStandingCalfRaisesBtn = findViewById(R.id.standingCalfRaisesButton);
        Button mCalfRaisesBtn = findViewById(R.id.calfRaisesButton);
        mSquatsBtn.setOnClickListener(this);
        mDumbbellLungesBtn.setOnClickListener(this);
        mLyingLegCurlsBtn.setOnClickListener(this);
        mLegCurlsBtn.setOnClickListener(this);
        mLegExtensionsBtn.setOnClickListener(this);
        mStandingCalfRaisesBtn.setOnClickListener(this);
        mCalfRaisesBtn.setOnClickListener(this);
    }


    public void onClick(View view){
        if (view.getId() == R.id.squatsButton){

        }
        else if (view.getId() == R.id.dumbbellLungesButton){

        }
        else if (view.getId() == R.id.lyingLegCurlsButton){

        }
        else if (view.getId() == R.id.legCurlsButton){

        }
        else if (view.getId() == R.id.legExtensionsButton){

        }
        else if (view.getId() == R.id.standingCalfRaisesButton){

        }
        else if (view.getId() == R.id.calfRaisesButton){

        }
    }

}
