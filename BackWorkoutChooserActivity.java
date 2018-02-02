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

public class BackWorkoutChooserActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back_workout_chooser);
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
        Button mBarbellDeadliftBtn = findViewById(R.id.barbellDeadliftButton);
        Button mWideGripPullUpBtn = findViewById(R.id.wideGripPullUpButton);
        Button mWideGripPullDownBtn = findViewById(R.id.wideGripPullDownButton);
        Button mCloseGripPullDownBtn = findViewById(R.id.closeGripPullDownButton);
        Button mPullUpBtn = findViewById(R.id.pullUpButton);
        Button mStandingTBarRowBtn = findViewById(R.id.standingTBarRowButton);
        Button mWideGripSeatedCableRowBtn = findViewById(R.id.wideGripSeatedCableRowButton);
        Button mSeatedCableRowBtn = findViewById(R.id.seatedCableRowButton);
        Button mReverseGripSmithMachineRowBtn = findViewById(R.id.reverseGripSmithMachineRowButton);
        Button mSingleArmDumbbellRowBtn = findViewById(R.id.singleArmDumbbellRowButton);
        mBarbellDeadliftBtn.setOnClickListener(this);
        mWideGripPullUpBtn.setOnClickListener(this);
        mWideGripPullDownBtn.setOnClickListener(this);
        mCloseGripPullDownBtn.setOnClickListener(this);
        mPullUpBtn.setOnClickListener(this);
        mStandingTBarRowBtn.setOnClickListener(this);
        mWideGripSeatedCableRowBtn.setOnClickListener(this);
        mSeatedCableRowBtn.setOnClickListener(this);
        mReverseGripSmithMachineRowBtn.setOnClickListener(this);
        mSingleArmDumbbellRowBtn.setOnClickListener(this);
    }

    public void onClick(View view){
        if (view.getId() == R.id.barbellDeadliftButton){

        }
        else if (view.getId() == R.id.wideGripPullUpButton){

        }
        else if (view.getId() == R.id.wideGripPullDownButton){

        }
        else if (view.getId() == R.id.closeGripPullDownButton){

        }
        else if (view.getId() == R.id.pullUpButton){

        }
        else if (view.getId() == R.id.standingTBarRowButton){

        }
        else if (view.getId() == R.id.wideGripSeatedCableRowButton){

        }
        else if (view.getId() == R.id.seatedCableRowButton){

        }
        else if (view.getId() == R.id.reverseGripSmithMachineRowButton){

        }
        else if (view.getId() == R.id.singleArmDumbbellRowButton){

        }
    }
}

