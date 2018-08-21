package com.cseku.noman.tasbihcouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Info;
    private TextView forAllah;
    private Button Press;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Info = (TextView)findViewById(R.id.tvInfo2);
        forAllah = (TextView)findViewById(R.id.tvInfo1);
        Press = (Button)findViewById(R.id.btnPress);
        Info.setText("0");

        Press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                Info.setText(String.valueOf(counter));
            }
        });
    }
}
