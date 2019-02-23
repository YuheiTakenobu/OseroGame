package com.example.yu05h.osero;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.GridLayout;

import java.net.MalformedURLException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout GD = new GridLayout(this);
        GD = (GridLayout)findViewById(R.id.main_grid);

        int grigNum = 8;

        for (int i=0; i < grigNum; i++) {
            for (int j = 0; j <grigNum; j++){
                Button Masu = new Button(this);
                Masu.setText(i + "." + j);
                GridLayout.LayoutParams MasuLayoutParams = new GridLayout.LayoutParams();
                MasuLayoutParams.width = GD.getWidth();
                System.out.println("GD.getWidth() : " + GD.getWidth());
                MasuLayoutParams.height = GD.getHeight();
                System.out.println("GD.getHeight() : " + GD.getHeight());
                if (Build.VERSION.SDK_INT >= 21) {
                    System.out.println("IN");
                    MasuLayoutParams.rowSpec = GridLayout.spec(i, GridLayout.FILL, 1);
                    MasuLayoutParams.columnSpec = GridLayout.spec(j, GridLayout.FILL, 1);
                }

            /*
            MasuLayoutParams.rowSpec = GridLayout.spec(1);
            MasuLayoutParams.columnSpec =  GridLayout.spec(i);
            */
                Masu.setLayoutParams(MasuLayoutParams);

                Masu.setBackgroundResource(R.drawable.frame_style);
                GD.addView(Masu);

            }
        }
    }
}
