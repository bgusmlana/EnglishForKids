package bagusm.englishforkids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pakaian extends AppCompatActivity {

    ImageView btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaian);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara = MediaPlayer.create(Pakaian.this,R.raw.pbaju);
                suara.start();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara1 = MediaPlayer.create(Pakaian.this,R.raw.pcelana);
                suara1.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara2 = MediaPlayer.create(Pakaian.this,R.raw.psepatu);
                suara2.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara3 = MediaPlayer.create(Pakaian.this,R.raw.ptas);
                suara3.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara4 = MediaPlayer.create(Pakaian.this,R.raw.pdasi);
                suara4.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara5 = MediaPlayer.create(Pakaian.this,R.raw.ptopi);
                suara5.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara6 = MediaPlayer.create(Pakaian.this,R.raw.pkacamata);
                suara6.start();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara7 = MediaPlayer.create(Pakaian.this,R.raw.pjam);
                suara7.start();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara8 = MediaPlayer.create(Pakaian.this,R.raw.pcincin);
                suara8.start();
            }
        });
    }
}
