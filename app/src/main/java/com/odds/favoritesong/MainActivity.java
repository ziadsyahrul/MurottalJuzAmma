package com.odds.favoritesong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String isPlaying = "media is playing";

    MediaPlayer player;

    Button btn1,btn2,btn3,btn4,btn5,btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(1);
            }
        });


        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(2);
            }
        });

        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(3);
            }
        });

        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(4);
            }
        });

        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(5);
            }
        });

        btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(6);
            }
        });


        btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(7);
            }
        });


        btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(8);
            }
        });


        btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(9);
            }
        });


        btn10 = (Button)findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(10);
            }
        });


        btn11 = (Button)findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(11);
            }
        });


        btn12 = (Button)findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(12);
            }
        });


        btn13 = (Button)findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(13);
            }
        });


        btn14 = (Button)findViewById(R.id.button14);
        btn14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(14);
            }
        });

        btn15 = (Button)findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(15);
            }
        });

        btn16 = (Button)findViewById(R.id.button16);
        btn16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(16);
            }
        });

        btn17 = (Button)findViewById(R.id.button17);
        btn17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(17);
            }
        });

        btn18 = (Button)findViewById(R.id.button18);
        btn18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(18);
            }
        });

        btn19 = (Button)findViewById(R.id.button19);
        btn19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(19);
            }
        });

        btn20 = (Button)findViewById(R.id.button20);
        btn20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(20);
            }
        });

        btn21 = (Button)findViewById(R.id.button21);
        btn21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(21);
            }
        });

        btn22 = (Button)findViewById(R.id.button22);
        btn22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(22);
            }
        });

        btn23 = (Button)findViewById(R.id.button23);
        btn23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(23);
            }
        });

        btn24 = (Button)findViewById(R.id.button24);
        btn24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(24);
            }
        });

        btn25 = (Button)findViewById(R.id.button25);
        btn25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(25);
            }
        });

        btn26 = (Button)findViewById(R.id.button26);
        btn26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(26);
            }
        });

        btn27 = (Button)findViewById(R.id.button27);
        btn27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(27);
            }
        });

        btn28 = (Button)findViewById(R.id.button28);
        btn28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(28);
            }
        });

        btn29 = (Button)findViewById(R.id.button29);
        btn29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(29);
            }
        });

        btn30 = (Button)findViewById(R.id.button30);
        btn30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(30);
            }
        });

        btn31 = (Button)findViewById(R.id.button31);
        btn31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(31);
            }
        });

        btn32 = (Button)findViewById(R.id.button32);
        btn32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(32);
            }
        });

        btn33 = (Button)findViewById(R.id.button33);
        btn33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(33);
            }
        });

        btn34 = (Button)findViewById(R.id.button34);
        btn34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(34);
            }
        });

        btn35 = (Button)findViewById(R.id.button35);
        btn35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(35);
            }
        });

        btn36 = (Button)findViewById(R.id.button36);
        btn36.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(36);
            }
        });

        btn37 = (Button)findViewById(R.id.button37);
        btn37.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View arg0){
                playSound(37);
            }
        });





    }

    public void onPause(){

        try{

            super.onPause();

            player.pause();

        }catch (Exception e){

        }

    }

    private void playSound(int arg){

        try{

            if (player.isPlaying()){

                player.stop();

                player.release();

            }

        }catch (Exception e){
            Toast.makeText(this, " Mulai Memutar ", Toast.LENGTH_LONG).show();
        }

        if (arg ==1){
            Toast.makeText(this, isPlaying+ " Surah An-naba ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.an_naba);

        }else if (arg ==2){
            Toast.makeText(this, isPlaying+ " Surah An-naziat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.an_naziat);

        }else if (arg ==3){

            Toast.makeText(this, isPlaying+ " Surah Abasa ", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.abasa);

        }else if (arg ==4){

            Toast.makeText(this, isPlaying+ " Surah At-takwir", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.at_takwir);

        }else if (arg == 5){

            Toast.makeText(this, isPlaying+ " Surah Al-infitar", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.al_infitar);

        }else if (arg ==6){

            Toast.makeText(this, isPlaying+ " Surah Al-muthaffifin", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.al_mutaffifin);

        }else if (arg == 7){
            Toast.makeText(this, isPlaying + " Surah Al-insyiqaq", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_insyiqaq);

        } else if (arg == 8) {
            Toast.makeText(this, isPlaying + "Surah Al-Buruj", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_buruj);
        } else if (arg == 9) {
            Toast.makeText(this, isPlaying + "Surah At_Thariq", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.at_tariq);
        } else if (arg == 10) {
            Toast.makeText(this, isPlaying + "Surah Al_A'la", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_ala);
        } else if (arg == 11) {
            Toast.makeText(this, isPlaying + "Surah Al-Gashiyah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_ghashiyah);
        } else if (arg == 12) {
            Toast.makeText(this, isPlaying + "Surah Al-Fajr", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_fajr);
        } else if (arg == 13) {
            Toast.makeText(this, isPlaying + " Surah Al-Balad ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_balad);
        } else if (arg == 14) {
            Toast.makeText(this, isPlaying + " Surah As-Syams ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.as_syams);
        } else if (arg == 15) {
            Toast.makeText(this, isPlaying + " Surah Al-Lail ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_lail);
        } else if (arg == 16) {
            Toast.makeText(this, isPlaying + " Surah Ad-Dhuha ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ad_dhuha);
        } else if (arg == 17) {
            Toast.makeText(this, isPlaying + " Surah Al-insyirah ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_insyirah);
        } else if (arg == 18) {
            Toast.makeText(this, isPlaying + " Surah At-tin ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.at_tin);
        } else if (arg == 19) {
            Toast.makeText(this, isPlaying + " Surah Al-Alaq ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_alaq);
        } else if (arg == 20) {
            Toast.makeText(this, isPlaying + " Surah Al-qadr ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_qadr);
        } else if (arg == 21) {
            Toast.makeText(this, isPlaying + " Surah Al-bayyinah ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_bayyinah);
        } else if (arg == 22) {
            Toast.makeText(this, isPlaying + " Surah Al-zalzalah ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_zalzalah);
        } else if (arg == 23) {
            Toast.makeText(this, isPlaying + " Surah Al-adiyat ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_adiyat);
        } else if (arg == 24) {
            Toast.makeText(this, isPlaying + " Surah Al-qariah ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_qariah);
        } else if (arg == 25) {
            Toast.makeText(this, isPlaying + " Surah At-takatsur ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.at_takatsur);
        } else if (arg == 26) {
            Toast.makeText(this, isPlaying + " Surah Al-Asr ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_asr);
        } else if (arg == 27) {
            Toast.makeText(this, isPlaying + " Surah Al-humazah ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_humazah);
        } else if (arg == 28) {
            Toast.makeText(this, isPlaying + " Surah Al-fil ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_fil);
        } else if (arg == 29) {
            Toast.makeText(this, isPlaying + " Surah Al-quraisy ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_quraisy);
        } else if (arg == 30) {
            Toast.makeText(this, isPlaying + " Surah Al-maun ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_maun);
        } else if (arg == 31) {
            Toast.makeText(this, isPlaying + " Surah Al-kautsar ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_kautsar);
        } else if (arg == 32) {
            Toast.makeText(this, isPlaying + " Surah Al-kafirun ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_kafirun);
        } else if (arg == 33) {
            Toast.makeText(this, isPlaying + " Surah An-nasr ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.an_nasr);
        } else if (arg == 34) {
            Toast.makeText(this, isPlaying + " Surah Al-Lahab ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.al_lahab);
        } else if (arg == 35) {
            Toast.makeText(this, isPlaying + " Surah Al-Ikhlas ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ikhlas);
        } else if (arg == 36) {
            Toast.makeText(this, isPlaying + " Surah Al-Falaq ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.falaq);
        } else if (arg == 37) {
            Toast.makeText(this, isPlaying + " Surah An-nas ", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.naas);
        }
        player.setLooping(true);
        player.start();

    }
}

