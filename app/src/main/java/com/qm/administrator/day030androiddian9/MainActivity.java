package com.qm.administrator.day030androiddian9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Canvas canvas = new Canvas();
        Paint paint = new Paint();
        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP){
            canvas.drawOval(100,200,300,400,paint);
        }
    }
}
