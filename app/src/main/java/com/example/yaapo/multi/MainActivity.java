package com.example.yaapo.multi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button call;
    TextView show;
    View.OnClickListener cl;
    CheckBox apple, grape, banana;
    CompoundButton.OnCheckedChangeListener ccl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = (Button)findViewById(R.id.call_sub);
        show = (TextView) findViewById(R.id.show);
        apple = (CheckBox)findViewById(R.id.apple);
        grape = (CheckBox)findViewById(R.id.grape);
        banana = (CheckBox)findViewById(R.id.banana);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i;
               i = new Intent(getApplicationContext(), second.class);
               startActivity(i);
            }
        };

        ccl = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch (compoundButton.getId()){
                    case R.id.apple :
                        if(b == true){
                            show.setText("당신은 사과를 좋아하네요.^*^");
                        } else {
                            show.setText("당신은 사과를 싫어하네요.T*T");
                        }
                        break;
                    case R.id.grape :
                        if(b == true){
                            show.setText("당신은 포도를 좋아하네요.^*^");
                        } else {
                            show.setText("당신은 포도를 싫어하네요.T*T");
                        }
                        break;
                    case R.id.banana :
                        if(b == true){
                            show.setText("당신은 바나나를 좋아하네요.^*^");
                        } else {
                            show.setText("당신은 바나나를 싫어하네요.T*T");
                        }
                        break;

                }
            }
        };

        call.setOnClickListener(cl);
        apple.setOnCheckedChangeListener(ccl);
        grape.setOnCheckedChangeListener(ccl);
        banana.setOnCheckedChangeListener(ccl);

    }
}
