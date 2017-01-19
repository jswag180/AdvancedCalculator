package swagyyydevelopment.jswag180.com.advancedcalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ModeSelection extends AppCompatActivity {


    Button BVERTEX;


    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_selection);


        BVERTEX = (Button) findViewById(R.id.BVERTEX);
        Button BPUNN = (Button) findViewById(R.id.BPUNN);

        BVERTEX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent c = new Intent(context, VERTEX.class);
                    startActivity(c);

            }
        });

        BPUNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(context, PUNNETSQUARE.class);
                startActivity(d);
            }
        });


    }




}


