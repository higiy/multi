package com.example.yaapo.multi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by yaapo on 2018-03-19.
 */

public class second extends Activity {
    Button call;
    View.OnClickListener cl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        call = (Button)findViewById(R.id.call_main);
        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        };

        call.setOnClickListener(cl);
    }
}
