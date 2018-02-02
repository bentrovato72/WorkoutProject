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

public class ArmsWorkoutChooserActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arms_workout_chooser);
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

    private void setupWidgets() {
        Button mStandingDumbbellCurlBtn = findViewById(R.id.standingDumbbellCurlButton);
        Button mWideGripStandingBarbellCurlBtn = findViewById(R.id.wideGripStandingBarbellCurlButton);
        Button mBarbellCurlBtn = findViewById(R.id.barbellCurlButton);
        Button mZottmanCurlBtn = findViewById(R.id.zottmanCurlButton);
        Button mEZBarCurlBtn = findViewById(R.id.ezBarCurlButton);
        Button mHammerCurlBtn = findViewById(R.id.hammerCurlButton);
        Button mCableRopeHammerCurlBtn = findViewById(R.id.cableRopeHammerCurlButton);
        Button mSittingDumbbellCurlBtn = findViewById(R.id.sittingDumbbellCurlButton);
        Button mEZBarPreacherCurlBtn = findViewById(R.id.ezBarPreacherCurlButton);
        Button mInclineHammerCurlBtn = findViewById(R.id.inclineHammerCurlButton);
        Button mInclineDumbbellCurlBtn = findViewById(R.id.inclineDumbbellCurlButton);
        Button mInclineInnerBicepCurlBtn = findViewById(R.id.inclineInnerBicepsCurlButton);
        Button mOverheadCableCurlBtn = findViewById(R.id.overheadCableCurlButton);
        Button mStaticDumbbellCurlBtn = findViewById(R.id.staticDumbbellCurlButton);
        Button mDeclineDumbbellCurlBtn = findViewById(R.id.declineDumbbellCurlButton);
        Button mKneelingSingleArmCurlBtn = findViewById(R.id.kneelingSingleArmCurlButton);
        mStandingDumbbellCurlBtn.setOnClickListener(this);
        mWideGripStandingBarbellCurlBtn.setOnClickListener(this);
        mBarbellCurlBtn.setOnClickListener(this);
        mZottmanCurlBtn.setOnClickListener(this);
        mEZBarCurlBtn.setOnClickListener(this);
        mHammerCurlBtn.setOnClickListener(this);
        mCableRopeHammerCurlBtn.setOnClickListener(this);
        mSittingDumbbellCurlBtn.setOnClickListener(this);
        mEZBarPreacherCurlBtn.setOnClickListener(this);
        mInclineHammerCurlBtn.setOnClickListener(this);
        mInclineDumbbellCurlBtn.setOnClickListener(this);
        mInclineInnerBicepCurlBtn.setOnClickListener(this);
        mOverheadCableCurlBtn.setOnClickListener(this);
        mStaticDumbbellCurlBtn.setOnClickListener(this);
        mDeclineDumbbellCurlBtn.setOnClickListener(this);
        mKneelingSingleArmCurlBtn.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.standingDumbbellCurlButton) {

        } else if (view.getId() == R.id.wideGripStandingBarbellCurlButton) {

        } else if (view.getId() == R.id.barbellCurlButton) {

        } else if (view.getId() == R.id.zottmanCurlButton) {

        } else if (view.getId() == R.id.ezBarCurlButton) {

        } else if (view.getId() == R.id.hammerCurlButton) {

        } else if (view.getId() == R.id.cableRopeHammerCurlButton) {

        } else if (view.getId() == R.id.sittingDumbbellCurlButton) {

        } else if (view.getId() == R.id.ezBarPreacherCurlButton) {

        } else if (view.getId() == R.id.inclineHammerCurlButton) {

        } else if (view.getId() == R.id.inclineDumbbellCurlButton) {

        } else if (view.getId() == R.id.inclineInnerBicepsCurlButton) {

        } else if (view.getId() == R.id.overheadCableCurlButton) {

        } else if (view.getId() == R.id.staticDumbbellCurlButton) {

        } else if (view.getId() == R.id.declineDumbbellCurlButton) {

        } else if (view.getId() == R.id.kneelingSingleArmCurlButton) {

        }

    }
}