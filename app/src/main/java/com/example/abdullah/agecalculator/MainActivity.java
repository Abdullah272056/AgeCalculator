package com.example.abdullah.agecalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        TextView nextBirthDayTextView,nextBirthMonthTextView;
    TextView mpresentYearTextView,mpresentMonthTextView,mpresentDayTextView;
    TextView  mextraYearTextView,mextraMonthTextView,mextraWeekTextView,mextraDayTextView,
            mextraHourTextView,mextraMinuteTextView,mextraSecondTextView;
    EditText mbirthYearEditText,mbirthMonthEditText,mbirthDayEditText,mcurrentYearEditText,
            mcurrentMonthEditText,mcurrentDayEditText;
    Button mcalculationbutton,mdeleteButton;
  int day=0,month,year;
    int pcd,pcm;
    int npcd,npcm,nday,nmonth;
    int totalmonth,totalDay,totalweek;
    int currentYear,currentMonth,currentDay;
    int mm_birthDayEditText,mm_birthMonthEditText ,mm_birthYearEditText;
    int birthDate,birthMonth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //extra information
        mextraYearTextView=findViewById(R.id.extraYearTextViewID);
        mextraMonthTextView=findViewById(R.id.extraMonthTextViewID);
        mextraWeekTextView=findViewById(R.id.extraWeekTextViewID);
        mextraDayTextView=findViewById(R.id.extraDayTextViewID);
        mextraHourTextView=findViewById(R.id.extraHourTextViewID);
        mextraMinuteTextView=findViewById(R.id.extraMinuteTextViewID);
        mextraSecondTextView=findViewById(R.id.extraSecondTextViewID);

        mpresentDayTextView=findViewById(R.id.presentDayTextViewID);
        mpresentMonthTextView=findViewById(R.id.presentMonthTextViewID);
        mpresentYearTextView=findViewById(R.id.presentYearTextViewID);

        mbirthYearEditText=findViewById(R.id.birthYearEditTextID);
        mbirthMonthEditText=findViewById(R.id.birthMonthEditTextID);
        mbirthDayEditText=findViewById(R.id.birthDayEditTextID);

        mcurrentYearEditText=findViewById(R.id.currentYearEditTextID);
        mcurrentMonthEditText=findViewById(R.id.currentMonthEditTextID);
        mcurrentDayEditText=findViewById(R.id.currentDayEditTextID);

        nextBirthDayTextView=findViewById(R.id.NextBirthDayTextViewId);
        nextBirthMonthTextView=findViewById(R.id.NextBirthMonthTextViewId);





        mcalculationbutton=findViewById(R.id.calculationButtonID);
        mdeleteButton=findViewById(R.id.deleteButtonID);
        mcalculationbutton.setOnClickListener(this);
        mdeleteButton.setOnClickListener(this);

        // Datepicker method for current date
        DatePicker datePicker=new DatePicker(this);
         currentYear=datePicker.getYear();
         currentMonth=datePicker.getMonth();
        currentDay=datePicker.getDayOfMonth();


       //Edittext set text
        mcurrentDayEditText.setText(Integer.toString(currentDay));
        mcurrentMonthEditText.setText(Integer.toString(currentMonth+1));
        mcurrentYearEditText.setText(Integer.toString(currentYear));

        //Next_BirthDate n= new Next_BirthDate(mcurrentMonthEditText,mcurrentDayEditText,mm_birthMonthEditText,mm_birthDayEditText);

        }

    @Override
    public void onClick(View view) {

////////////

        if (view.getId() == R.id.calculationButtonID) {
            mbirthYearEditText.onEditorAction(EditorInfo.IME_ACTION_DONE);
            mcurrentYearEditText.onEditorAction(EditorInfo.IME_ACTION_DONE);
            if(mcurrentYearEditText.length()<=0|mcurrentMonthEditText.length()<=0|mcurrentDayEditText.length()<=0|
                    mbirthYearEditText.length()<=0| mbirthMonthEditText.length()<=0|mbirthDayEditText.length()<=0){
                Toast.makeText(getApplicationContext(), "Please fill the gap", Toast.
                        LENGTH_LONG).show();
            }
            ////////////////
            else{


            int mm_currentYearEditText = Integer.parseInt(mcurrentYearEditText.getText().toString());
            int mm_currentMonthEditText = Integer.parseInt(mcurrentMonthEditText.getText().toString());
           int mm_currentDayEditText = Integer.parseInt(mcurrentDayEditText.getText().toString());

             mm_birthYearEditText = Integer.parseInt(mbirthYearEditText.getText().toString());
             mm_birthMonthEditText = Integer.parseInt(mbirthMonthEditText.getText().toString());
             mm_birthDayEditText = Integer.parseInt(mbirthDayEditText.getText().toString());

          birthDate =mm_birthDayEditText;
          birthMonth=mm_birthMonthEditText;




            if (mm_currentYearEditText > mm_birthYearEditText) {
                if (mm_currentDayEditText >= mm_birthDayEditText) {

                    day = (mm_currentDayEditText - mm_birthDayEditText);

                }else if (mm_currentDayEditText < mm_birthDayEditText) {

                    if (mm_currentMonthEditText == 1) {
                        pcd = (mm_currentDayEditText + 28);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 2) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 3) {
                        pcd = (mm_currentDayEditText + 30);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 4) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 5) {
                        pcd = (mm_currentDayEditText + 30);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 6) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 7) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 8){
                        pcd = (mm_currentDayEditText + 30);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 9) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 10) {
                        pcd = (mm_currentDayEditText + 30);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 11) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    if (mm_currentMonthEditText == 12) {
                        pcd = (mm_currentDayEditText + 31);
                        day = (pcd - mm_birthDayEditText);
                    }
                    // System.out.println("Day="+day);
                    mm_currentMonthEditText--;
                } else {
                    System.out.println("Day is Error");
                }


                // for month
                if (mm_currentMonthEditText >= mm_birthMonthEditText) {
                    month = (mm_currentMonthEditText - mm_birthMonthEditText);
                    System.out.println("Month is =" + month);

                } else if(mm_currentMonthEditText < mm_birthMonthEditText){
                    pcm = (mm_currentMonthEditText + 12);
                    month = (pcm - mm_birthMonthEditText);
                    //System.out.println("Month is ="+month);
                    mm_currentYearEditText--;


                } else {
                    //System.out.println("Month is Error");
                    //System.out.println("Year is Error");

                }

                // for Year
                if (mm_currentYearEditText >= mm_birthYearEditText) {
                    year = (mm_currentYearEditText - mm_birthYearEditText);
                    //System.out.println("Year is ="+year);
                } else {

                    Toast.makeText(getApplicationContext(), "Birth Date is bigger than ToDay", Toast.LENGTH_LONG).show();
                }
            }

            else {
                Toast.makeText(getApplicationContext(), "Birth Date is bigger than ToDay", Toast.
                        LENGTH_LONG).show();
            }


            Toast.makeText(getApplicationContext(), "Welcome", Toast.
                    LENGTH_LONG).show();


                    totalmonth=(year*12)+month;
                    totalDay= (int) ((30.42*totalmonth)+day+4)+1;
                    totalDay= (int) ((30.42*totalmonth)+day+4)+1;
                    totalweek=totalDay/7;


                    ///Start int npcd,npcm,nday,nmonth;
                if(birthDate>=currentDay){
                    nday=birthDate-currentDay;
                    }
                     else  if (birthDate<currentDay){
                        if (currentMonth == 1) {
                           npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 2) {
                            npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 3) {
                            npcd = (birthDate + 28);
                            nday = (npcd - currentDay);
                        } if (currentMonth == 4) {
                            npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 5) {
                            npcd = (birthDate + 30);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 6) {
                            npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 7) {
                            npcd = (birthDate + 30);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 8) {
                            npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 9) {
                            npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        }
                        if (currentMonth == 10) {
                            npcd = (birthDate + 30);
                            nday = (npcd - currentDay);
                        } if (currentMonth == 11) {
                            npcd = (birthDate + 31);
                            nday = (npcd - currentDay);
                        } if (currentMonth == 12) {
                            npcd = (birthDate + 30);
                            nday = (npcd - currentDay);
                        }
                        birthMonth--;
                        }


                        else{}
                           if(birthMonth>=(currentMonth+1)){
                    nmonth=birthMonth-(currentMonth+1);
                }
                else if(birthMonth<(currentMonth+1)){
                    npcm=birthMonth+12;
                    nmonth=npcm-(currentMonth+1);
                           }
                           else {

                           }


            mpresentDayTextView.setText(String.valueOf(day));
            mpresentMonthTextView.setText(String.valueOf(month));
            mpresentYearTextView.setText(String.valueOf(year));

            mextraYearTextView.setText(String.valueOf(year));
            mextraMonthTextView.setText(String.valueOf(totalmonth));
                mextraDayTextView.setText(String.valueOf(totalDay));
                mextraWeekTextView.setText(String.valueOf(totalweek));
            mextraHourTextView.setText(String.valueOf(totalDay*24));
            mextraMinuteTextView.setText(String.valueOf(totalDay*24*60));
            mextraSecondTextView.setText(String.valueOf(totalDay*24*60*60));


                nextBirthDayTextView.setText(String.valueOf(nday));
                nextBirthMonthTextView.setText(String.valueOf(nmonth));

            }



        }


        ////////////////////////

            // delete button clicked for data clear
            if(view.getId()==R.id.deleteButtonID){
                mpresentDayTextView.setText(String.valueOf(""));
                mpresentMonthTextView.setText(String.valueOf(""));
                mpresentYearTextView.setText(String.valueOf(""));
                mpresentDayTextView.setText(String.valueOf(""));

              mcurrentYearEditText.setText("");
              mcurrentMonthEditText.setText("");
              mcurrentDayEditText.setText("");
                mbirthDayEditText.setText("");
                mbirthMonthEditText.setText("");
                mbirthYearEditText.setText("");

                mextraYearTextView.setText("");
                mextraMonthTextView.setText("");
                mextraDayTextView.setText("");
                mextraWeekTextView.setText("");
                mextraHourTextView.setText("");
                mextraMinuteTextView.setText("");
                mextraSecondTextView.setText("");
                nextBirthDayTextView.setText("");
                nextBirthMonthTextView.setText("");
                }


            }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.shareID){
            Intent intent =new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="This is Simple App";
            String body="This is very simple";

            //Message passing
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            //this message can sent our destination
            intent.putExtra(Intent.EXTRA_TEXT,"My date of birth is " + mm_birthDayEditText+"/"+mm_birthMonthEditText+"/"+mm_birthYearEditText+"\n Now My Age is=\t"	+year+"\tYear\t"+month+"\tMonth\t"+day+"\tDay\t");
            // this message show share screen's top
            startActivity(Intent.createChooser(intent,"Share With"));
        }
        if (item.getItemId()==R.id.aboutID){
            Toast.makeText(this, " This app is very Useful.It helps us for calculation our Birth ", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId()==R.id.contactID){
            Toast.makeText(this, "Company Name : Boss public\\n Mobile : 01994215664\\nEmail : abdullah272056@gmail.com\\n Facebook: abdullah328338", Toast.LENGTH_LONG).show();
            }
        if (item.getItemId()==R.id.helpID){
            Toast.makeText(this, " For help contact this number 01994215664", Toast.LENGTH_LONG).show();

        }
        return super.onOptionsItemSelected(item);
    }


}



