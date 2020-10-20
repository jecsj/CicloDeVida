package com.example.cronometro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class StopwatchActivity extends AppCompatActivity {

    private int seconds =0;
    private int contadorvuelta =0;

    private int tiempo1 =0;
    private int tiempo2 =0;
    private int tiempo3 =0;
    private int tiempo4 =0;
    private int tiempo5 =0;
    private int tiempo6 =0;
    private int tiempo7 =0;
    private int tiempo8 =0;
    private int tiempo9 =0;
    private int tiempo10 =0;
    private boolean running;
    private  String time="";
    private  String timevuelt="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if (savedInstanceState!=null)
        {
            seconds=savedInstanceState.getInt("seconds");
            running=savedInstanceState.getBoolean("running");
        }
        runTimer();
    }
    public void OnSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
        super.onSaveInstanceState(savedInstanceState);
    }
    public void onClickStart(View view)
    {
        running=true;
    }

    public void onClickStop(View view)
    {
        running=false;
    }

    public void onClickReset(View view)
    {
        running=false;
        seconds=0;
        contadorvuelta=0;
    }
    public void onClickVuelta(View view)
    {
        if(contadorvuelta<=10) {

            contadorvuelta++;
            if(contadorvuelta==1) {
                tiempo1=seconds;
                int hours = tiempo1 / 3600;
                int minutes = (tiempo1 % 3600) / 60;
                int secs = tiempo1 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);

            }
            if(contadorvuelta==2) {
                tiempo2=seconds-tiempo1;

                int hours = tiempo2 / 3600;
                int minutes = (tiempo2 % 3600) / 60;
                int secs = tiempo2 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);


            }
            if(contadorvuelta==3) {
                tiempo3=seconds-tiempo1-tiempo2;

                int hours = tiempo3 / 3600;
                int minutes = (tiempo3 % 3600) / 60;
                int secs = tiempo3 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);

            }
            if(contadorvuelta==4) {
                tiempo4=seconds-tiempo1-tiempo2-tiempo3;

                int hours = tiempo4 / 3600;
                int minutes = (tiempo4 % 3600) / 60;
                int secs = tiempo4 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }
            if(contadorvuelta==5) {
                tiempo5=seconds-tiempo1-tiempo2-tiempo3-tiempo4;

                int hours = tiempo5 / 3600;
                int minutes = (tiempo5 % 3600) / 60;
                int secs = tiempo5 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }
            if(contadorvuelta==6) {
                tiempo6=seconds-tiempo1-tiempo2-tiempo3-tiempo4-tiempo5;

                int hours = tiempo6 / 3600;
                int minutes = (tiempo6 % 3600) / 60;
                int secs = tiempo6 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }
            if(contadorvuelta==7) {
                tiempo7=seconds-tiempo1-tiempo2-tiempo3-tiempo4-tiempo5-tiempo6;

                int hours = tiempo7 / 3600;
                int minutes = (tiempo7 % 3600) / 60;
                int secs = tiempo7 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }
            if(contadorvuelta==8) {
                tiempo8=seconds-tiempo1-tiempo2-tiempo3-tiempo4-tiempo5-tiempo6-tiempo7;

                int hours = tiempo8 / 3600;
                int minutes = (tiempo8 % 3600) / 60;
                int secs = tiempo8 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }
            if(contadorvuelta==9) {
                tiempo9=seconds-tiempo1-tiempo2-tiempo3-tiempo4-tiempo5-tiempo6-tiempo7-tiempo8;

                int hours = tiempo9 / 3600;
                int minutes = (tiempo9 % 3600) / 60;
                int secs = tiempo9 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }
            if(contadorvuelta==10) {
                tiempo10=seconds-tiempo1-tiempo2-tiempo3-tiempo4-tiempo5-tiempo6-tiempo7-tiempo8-tiempo9;

                int hours = tiempo10 / 3600;
                int minutes = (tiempo10 % 3600) / 60;
                int secs = tiempo10 % 60;
                timevuelt = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
            }


        }
    }
    private void runTimer(){
        final TextView timeView = (TextView)findViewById(R.id.time_view);
        final TextView timevuelta1 = (TextView)findViewById(R.id.time_vuelta1);
        final TextView timevuelta2 = (TextView)findViewById(R.id.time_vuelta2);
        final TextView timevuelta3 = (TextView)findViewById(R.id.time_vuelta3);
        final TextView timevuelta4 = (TextView)findViewById(R.id.time_vuelta4);
        final TextView timevuelta5 = (TextView)findViewById(R.id.time_vuelta5);
        final TextView timevuelta6 = (TextView)findViewById(R.id.time_vuelta6);
        final TextView timevuelta7 = (TextView)findViewById(R.id.time_vuelta7);
        final TextView timevuelta8 = (TextView)findViewById(R.id.time_vuelta8);
        final TextView timevuelta9 = (TextView)findViewById(R.id.time_vuelta9);
        final TextView timevuelta10 = (TextView)findViewById(R.id.time_vuelta10);
        final Handler handler= new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                   int hours = seconds / 3600;
                    int minutes = (seconds % 3600) / 60;
                    int secs = seconds % 60;
                    time = String.format(Locale.getDefault(),
                            "%d:%02d:%02d", hours, minutes, secs);
                    timeView.setText(time);
                if(contadorvuelta==0) {
                    timevuelta1.setText("");
                    timevuelta2.setText("");
                    timevuelta3.setText("");
                    timevuelta4.setText("");
                    timevuelta5.setText("");
                    timevuelta6.setText("");
                    timevuelta7.setText("");
                    timevuelta8.setText("");
                    timevuelta9.setText("");
                    timevuelta10.setText("");
                }
                    if(contadorvuelta==1) {
                        timevuelta1.setText("Vuelta 1: "+timevuelt);
                    }
                if(contadorvuelta==2) {
                    timevuelta2.setText("Vuelta 2: "+timevuelt);
                }
                if(contadorvuelta==3) {
                    timevuelta3.setText("Vuelta 3: "+timevuelt);
                }
                if(contadorvuelta==4) {
                    timevuelta4.setText("Vuelta 4: "+timevuelt);
                }
                if(contadorvuelta==5) {
                    timevuelta5.setText("Vuelta 5: "+timevuelt);
                }
                if(contadorvuelta==6) {
                    timevuelta6.setText("Vuelta 6: "+timevuelt);
                }
                if(contadorvuelta==7) {
                    timevuelta7.setText("Vuelta 7: "+timevuelt);
                }
                if(contadorvuelta==8) {
                    timevuelta8.setText("Vuelta 8: "+timevuelt);
                }
                if(contadorvuelta==9) {
                    timevuelta9.setText("Vuelta 9: "+timevuelt);
                }
                if(contadorvuelta==10) {
                    timevuelta10.setText("Vuelta 10: "+timevuelt);
                }
                    if (running) {
                        seconds++;
                    }
                    handler.postDelayed(this, 1000);

            }

        });

    }
}