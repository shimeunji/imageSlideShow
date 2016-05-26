package kr.hs.emirim.kokopink1.imageslidingshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    EditText text;
    int time;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        text=(EditText)findViewById(R.id.text);
        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butStop=(Button)findViewById(R.id.but_stop);
        butStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_start:
                time=(int)Double.parseDouble(text.getText().toString())*1000;
                flip.setFlipInterval(time);
                flip.startFlipping(); //이전화면

                break;
            case R.id.but_stop:
                flip.stopFlipping(); //다음화면
                break;
        }
    }

}
