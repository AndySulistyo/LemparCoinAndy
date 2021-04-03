package com.andysssttt.lemparcoincoy;

import android.app.Activity;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class LemparCoin extends Activity implements View.OnClickListener {
    private Button buttonToss;
    private Button buttonRepeat;
    private Button buttonExit;
    private Random rand;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rand-new Random();
        setContentView(R.layout.activity_lempar_coin);
        buttonToss=(Button)findViewById(R.id.button_1);
        buttonRepeat=(Button)findViewById(R.id.button2);
        buttonExit=(Button)findViewById(R.id.button3);
        buttonToss.setOnClickListener(this);
        buttonRepeat.setOnClickListener(this);
        buttonExit.setOnClickListener(this);
    }
    @Override
    public void onClick (View view){
        if(view=buttonToss) {
            Log.d("CLICK EVENT", "Toss button Clicked");
            TextView tw = (TextView) findViewById(R.id.textView1);
            ImageView iw = (ImageView) findViewById(R.id.imageView);

            if (rand.nextDouble() < 0,5){
                tw.setText("Kepala");
                iw.setImageResource(R.drawable.gambar1);
            }else{
                tw.setText("Cross");
                iw.setImageResource(R.drawable.gambar3);
            }
            buttonToss.setVisibility(View.INVISIBLE);
            buttonRepeat.setVisibility(View.VISIBLE);
            buttonExit.setVisibility(View.VISIBLE);
        }
        else if (View=buttonRepeat) {
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView);

            buttonToss.setVisibility(View.VISIBLE);
            buttonRepeat.setVisibility(View.INVISIBLE);
            buttonExit.setVisibility(View.INVISIBLE);
            tw.setText(" ");
            iw.setImageResource(R.drawable.gambar2);
        }else if (view=buttonExit){
            this.finish();
        }
    }
}
