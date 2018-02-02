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

public class ShouldersWorkoutChooserActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulders_workout_chooser);
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
        Button mDumbbellShoulderPressBtn = findViewById(R.id.dumbbellShoulderPressButton);
        Button mBarbellShoulderPressBtn = findViewById(R.id.barbellShoulderPressButton);
        Button mSeatedBentOverRearDeltRaiseBtn = findViewById(R.id.seatedBentOverRearDeltRaiseButton);
        Button mSideLateralRaiseBtn = findViewById(R.id.sideLateralRaiseButton);
        Button mStandingFrontBarbellRaiseBtn = findViewById(R.id.standingFrontBarbellRaiseButton);
        Button mStandingFrontDumbbellRaiseBtn = findViewById(R.id.standingFrontDumbbellRaiseButton);
        Button mSeatedBarbellMilitaryPressBtn = findViewById(R.id.seatedBarbellMilitaryPressButton);
        Button mStandingBarbellMilitaryPressBtn = findViewById(R.id.standingBarbellMilitaryPressButton);
        Button mStandingDumbbellMilitaryPressBtn = findViewById(R.id.standingDumbbellMilitaryPressButton);
        Button mFrontCableRaiseBtn = findViewById(R.id.frontCableRaiseButton);
        Button mCableLateralRaiseBtn = findViewById(R.id.cableLateralRaiseButton);
        Button mUprightCableRowBtn = findViewById(R.id.uprightCableRowButton);
        Button mReverseMachineFlyesBtn = findViewById(R.id.reverseMachineFlyesButton);
        mDumbbellShoulderPressBtn.setOnClickListener(this);
        mBarbellShoulderPressBtn.setOnClickListener(this);
        mSeatedBentOverRearDeltRaiseBtn.setOnClickListener(this);
        mSideLateralRaiseBtn.setOnClickListener(this);
        mStandingFrontBarbellRaiseBtn.setOnClickListener(this);
        mStandingFrontDumbbellRaiseBtn.setOnClickListener(this);
        mSeatedBarbellMilitaryPressBtn.setOnClickListener(this);
        mStandingBarbellMilitaryPressBtn.setOnClickListener(this);
        mStandingDumbbellMilitaryPressBtn.setOnClickListener(this);
        mFrontCableRaiseBtn.setOnClickListener(this);
        mCableLateralRaiseBtn.setOnClickListener(this);
        mUprightCableRowBtn.setOnClickListener(this);
        mReverseMachineFlyesBtn.setOnClickListener(this);
    }

    public void onClick(View view){
        if (view.getId() == R.id.dumbbellShoulderPressButton){

        }
        else if (view.getId() == R.id.barbellShoulderPressButton){

        }
        else if (view.getId() == R.id.seatedBentOverRearDeltRaiseButton){

        }
        else if (view.getId() == R.id.sideLateralRaiseButton){

        }
        else if (view.getId() == R.id.standingFrontBarbellRaiseButton){

        }
        else if (view.getId() == R.id.standingFrontDumbbellRaiseButton){

        }
        else if (view.getId() == R.id.seatedBarbellMilitaryPressButton){

        }
        else if (view.getId() == R.id.standingBarbellMilitaryPressButton){

        }
        else if (view.getId() == R.id.standingDumbbellMilitaryPressButton){

        }
        else if (view.getId() == R.id.frontCableRaiseButton){

        }
        else if (view.getId() == R.id.cableLateralRaiseButton){

        }
        else if (view.getId() == R.id.uprightCableRowButton){

        }
        else if (view.getId() == R.id.reverseMachineFlyesButton){

        }
    }
}
