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

public class WorkoutChooserActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_chooser);
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
         Button mArmsSelector = findViewById(R.id.armsSelectorButton);
         Button mLegsSelector = findViewById(R.id.legsSelectorButton);
         Button mChestSelector = findViewById(R.id.chestSelectorButton);
         Button mBackSelector = findViewById(R.id.backSelectorButton);
         Button mShouldersSelector = findViewById(R.id.shouldersSelectorButton);
        mArmsSelector.setOnClickListener(this);
        mLegsSelector.setOnClickListener(this);
        mChestSelector.setOnClickListener(this);
        mBackSelector.setOnClickListener(this);
        mShouldersSelector.setOnClickListener(this);
     }

    public void onClick(View view){
        if (view.getId() == R.id.armsSelectorButton){
            Intent openWorkoutChooserActivity = new Intent(this, ArmsWorkoutChooserActivity.class);
            startActivity(openWorkoutChooserActivity);
        }
        else if (view.getId() == R.id.legsSelectorButton){
            Intent openWorkoutChooserActivity = new Intent(this, LegsWorkoutChooserActivity.class);
            startActivity(openWorkoutChooserActivity);
        }
        else if (view.getId() == R.id.chestSelectorButton){
            Intent openWorkoutChooserActivity = new Intent(this, ChestWorkoutChooserActivity.class);
            startActivity(openWorkoutChooserActivity);
        }
        else if (view.getId() == R.id.backSelectorButton){
            Intent openWorkoutChooserActivity = new Intent(this, BackWorkoutChooserActivity.class);
            startActivity(openWorkoutChooserActivity);
        }
        else if(view.getId() == R.id.shouldersSelectorButton){
            Intent openWorkoutChooserActivity = new Intent(this, ShouldersWorkoutChooserActivity.class);
            startActivity(openWorkoutChooserActivity);
        }
    }

}
