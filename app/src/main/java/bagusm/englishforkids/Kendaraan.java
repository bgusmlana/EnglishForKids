package bagusm.englishforkids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Kendaraan extends AppCompatActivity {

    ImageView btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendaraan);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara = MediaPlayer.create(Kendaraan.this,R.raw.ksepeda);
                suara.start();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara1 = MediaPlayer.create(Kendaraan.this,R.raw.kmotor);
                suara1.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara2 = MediaPlayer.create(Kendaraan.this,R.raw.kmobil);
                suara2.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara3 = MediaPlayer.create(Kendaraan.this,R.raw.kbus);
                suara3.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara4 = MediaPlayer.create(Kendaraan.this,R.raw.ktruk);
                suara4.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara5 = MediaPlayer.create(Kendaraan.this,R.raw.kkereta);
                suara5.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara6 = MediaPlayer.create(Kendaraan.this,R.raw.kkapal);
                suara6.start();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara7 = MediaPlayer.create(Kendaraan.this,R.raw.kpesawat);
                suara7.start();
            }
        });
    }
}
