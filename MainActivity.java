package com.bentrovato.workoutapp;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {//implements View.OnClickListener {

    private Context context = this;
    private EditText mDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
    private Calendar dateSelected = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("");
        setupWidgets();

        //Sets up current date on date TextView
        Date today = new Date();
        String dateToday = sdf.format(today);
        mDate.setText(dateToday);

    }

    @Override
        public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater =  getMenuInflater();
        inflater.inflate(R.menu.menu_activity, menu);
        return true;
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
        ImageButton mPlusSymbol = findViewById(R.id.plusSymbol);
        ImageButton mRightArrow = findViewById(R.id.rightArrow);
        ImageButton mLeftArrow = findViewById(R.id.leftArrow);
        mDate = findViewById(R.id.date);
        ImageButton mCalendarBtn = findViewById(R.id.calendarBtn);
       /* mPlusSymbol.setOnClickListener(this);
        mRightArrow.setOnClickListener(this);
        mLeftArrow.setOnClickListener(this);
        mCalendarBtn.setOnClickListener(this);*/

    }

    DatePickerDialog.OnDateSetListener datePicker = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
            dateSelected.set(Calendar.YEAR, year);
            dateSelected.set(Calendar.MONTH, monthOfYear);
            dateSelected.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateDate();
        }
    };

    /*@Override
    public void onClick(View view) {
        if (view.getId() == R.id.plusSymbol) {
            Intent openWorkoutChooserActivity = new Intent(this, WorkoutChooserActivity.class);
            startActivity(openWorkoutChooserActivity);

        } else if (view.getId() == R.id.rightArrow) {
            dateSelected.add(Calendar.DAY_OF_MONTH, 1);
            updateDate();

        } else if (view.getId() == R.id.leftArrow) {
            dateSelected.add(Calendar.DAY_OF_MONTH, -1);
            updateDate();

        } else if (view.getId() == R.id.calendarBtn) {
            new DatePickerDialog(context, AlertDialog.THEME_DEVICE_DEFAULT_DARK, datePicker, dateSelected.get(Calendar.YEAR), dateSelected.get(Calendar.MONTH), dateSelected.get(Calendar.DAY_OF_MONTH)).show();
        }

    }*/
    private void updateDate(){mDate.setText(sdf.format(dateSelected.getTime()));}
}

