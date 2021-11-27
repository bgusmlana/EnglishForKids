package bagusm.englishforkids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Huruf extends AppCompatActivity {



    ImageView aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt,uu,vv,ww,xx,yy,zz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

        aa = findViewById(R.id.buttonA);
        bb = findViewById(R.id.buttonB);
        cc = findViewById(R.id.buttonC);
        dd = findViewById(R.id.buttonD);
        ee = findViewById(R.id.buttonE);
        ff = findViewById(R.id.buttonF);
        gg = findViewById(R.id.buttonG);
        hh = findViewById(R.id.buttonH);
        ii = findViewById(R.id.buttonI);
        jj = findViewById(R.id.buttonJ);
        kk = findViewById(R.id.buttonK);
        ll = findViewById(R.id.buttonL);
        mm = findViewById(R.id.buttonM);
        nn = findViewById(R.id.buttonN);
        oo = findViewById(R.id.buttonO);
        pp = findViewById(R.id.buttonP);
        qq = findViewById(R.id.buttonQ);
        rr = findViewById(R.id.buttonR);
        ss = findViewById(R.id.buttonS);
        tt = findViewById(R.id.buttonT);
        uu = findViewById(R.id.buttonU);
        vv = findViewById(R.id.buttonV);
        ww = findViewById(R.id.buttonW);
        xx = findViewById(R.id.buttonX);
        yy = findViewById(R.id.buttonY);
        zz = findViewById(R.id.buttonZ);

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara = MediaPlayer.create(Huruf.this,R.raw.suaraa);
                suara.start();
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara2 = MediaPlayer.create(Huruf.this,R.raw.suarab);
                suara2.start();
            }
        });
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara3 = MediaPlayer.create(Huruf.this,R.raw.suarac);
                suara3.start();
            }
        });
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara4 = MediaPlayer.create(Huruf.this,R.raw.suarad);
                suara4.start();
            }
        });
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara5 = MediaPlayer.create(Huruf.this,R.raw.suarae);
                suara5.start();
            }
        });
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara6 = MediaPlayer.create(Huruf.this,R.raw.suaraf);
                suara6.start();
            }
        });
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara7 = MediaPlayer.create(Huruf.this,R.raw.suarag);
                suara7.start();
            }
        });
        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara8 = MediaPlayer.create(Huruf.this,R.raw.suarah);
                suara8.start();
            }
        });
        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara9 = MediaPlayer.create(Huruf.this,R.raw.suarai);
                suara9.start();
            }
        });
        jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara10 = MediaPlayer.create(Huruf.this,R.raw.suaraj);
                suara10.start();
            }
        });
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara11 = MediaPlayer.create(Huruf.this,R.raw.suarak);
                suara11.start();
            }
        });
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara12 = MediaPlayer.create(Huruf.this,R.raw.suaral);
                suara12.start();
            }
        });
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara13 = MediaPlayer.create(Huruf.this,R.raw.suaram);
                suara13.start();
            }
        });
        nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara14 = MediaPlayer.create(Huruf.this,R.raw.suaran);
                suara14.start();
            }
        });
        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara15 = MediaPlayer.create(Huruf.this,R.raw.suarao);
                suara15.start();
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara16 = MediaPlayer.create(Huruf.this,R.raw.suarap);
                suara16.start();
            }
        });
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara17 = MediaPlayer.create(Huruf.this,R.raw.suaraq);
                suara17.start();
            }
        });
        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara18 = MediaPlayer.create(Huruf.this,R.raw.suarar);
                suara18.start();
            }
        });
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara19 = MediaPlayer.create(Huruf.this,R.raw.suaras);
                suara19.start();
            }
        });
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara20 = MediaPlayer.create(Huruf.this,R.raw.suarat);
                suara20.start();
            }
        });
        uu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara21 = MediaPlayer.create(Huruf.this,R.raw.suarau);
                suara21.start();
            }
        });
        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara22 = MediaPlayer.create(Huruf.this,R.raw.suarav);
                suara22.start();
            }
        });
        ww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara23 = MediaPlayer.create(Huruf.this,R.raw.suaraw);
                suara23.start();
            }
        });
        xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara24 = MediaPlayer.create(Huruf.this,R.raw.suarax);
                suara24.start();
            }
        });
        yy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara25 = MediaPlayer.create(Huruf.this,R.raw.suaray);
                suara25.start();
            }
        });
        zz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer suara26 = MediaPlayer.create(Huruf.this,R.raw.suaraz);
                suara26.start();
            }
        });

    }
}
