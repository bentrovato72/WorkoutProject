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

public class ChestWorkoutChooserActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest_workout_chooser);
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
        Button mBarbellBenchPressBtn = findViewById(R.id.barbellBenchPressButton);
        Button mDumbbellBenchPressBtn = findViewById(R.id.dumbbellBenchPressButton);
        Button mLowInclineBarbellBenchPressBtn = findViewById(R.id.lowInclineBarbellBenchPressButton);
        Button mLowInclineDumbbellBenchPressBtn = findViewById(R.id.lowInclineDumbbellBenchPressButton);
        Button mInclineBarbellBenchPressBtn = findViewById(R.id.inclineBarbellBenchPressButton);
        Button mInclineDumbbellBenchPressBtn = findViewById(R.id.inclineDumbbellBenchPressButton);
        Button mDumbbellFlyesBtn = findViewById(R.id.dumbbellFlyesButton);
        Button mInclineDumbbellFlyesBtn = findViewById(R.id.inclineDumbbellFlyesButton);
        Button mMachineChestPressBtn = findViewById(R.id.machineChestPressButton);
        Button mChestDipsBtn = findViewById(R.id.chestDipsButton);
        Button mInclineCableFlyBtn = findViewById(R.id.inclineCableFlyButton);
        Button mDumbbellPulloverBtn = findViewById(R.id.dumbbellPulloverButton);
        Button mInclineDumbbellPulloverBtn = findViewById(R.id.inclineDumbbellPulloverButton);
        Button mMachineChestFlyBtn = findViewById(R.id.machineChestFlyButton);
        mBarbellBenchPressBtn.setOnClickListener(this);
        mDumbbellBenchPressBtn.setOnClickListener(this);
        mLowInclineBarbellBenchPressBtn.setOnClickListener(this);
        mLowInclineDumbbellBenchPressBtn.setOnClickListener(this);
        mInclineBarbellBenchPressBtn.setOnClickListener(this);
        mInclineDumbbellBenchPressBtn.setOnClickListener(this);
        mDumbbellFlyesBtn.setOnClickListener(this);
        mInclineDumbbellFlyesBtn.setOnClickListener(this);
        mMachineChestPressBtn.setOnClickListener(this);
        mChestDipsBtn.setOnClickListener(this);
        mInclineCableFlyBtn.setOnClickListener(this);
        mDumbbellPulloverBtn.setOnClickListener(this);
        mInclineDumbbellPulloverBtn.setOnClickListener(this);
        mMachineChestFlyBtn.setOnClickListener(this);
    }

    public void onClick(View view){
        if (view.getId() == R.id.barbellBenchPressButton){

        }
        else if (view.getId() == R.id.dumbbellBenchPressButton){

        }
        else if (view.getId() == R.id.lowInclineBarbellBenchPressButton){

        }
        else if (view.getId() == R.id.lowInclineDumbbellBenchPressButton){

        }
        else if (view.getId() == R.id.inclineBarbellBenchPressButton){

        }
        else if (view.getId() == R.id.inclineDumbbellBenchPressButton){

        }
        else if (view.getId() == R.id.dumbbellFlyesButton){

        }
        else if (view.getId() == R.id.inclineDumbbellFlyesButton){

        }
        else if (view.getId() == R.id.machineChestPressButton){

        }
        else if (view.getId() == R.id.chestDipsButton){

        }
        else if (view.getId() == R.id.inclineCableFlyButton){

        }
        else if (view.getId() == R.id.dumbbellPulloverButton){

        }
        else if (view.getId() == R.id.inclineDumbbellPulloverButton){

        }
        else if (view.getId() == R.id.machineChestFlyButton){

        }
    }
}
