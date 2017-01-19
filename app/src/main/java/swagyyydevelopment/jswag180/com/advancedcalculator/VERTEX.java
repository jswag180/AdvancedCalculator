package swagyyydevelopment.jswag180.com.advancedcalculator;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VERTEX extends AppCompatActivity {

    Button BB;
    Button BER;
    EditText ETA;
    EditText ETB;
    EditText ETC;
    TextView TVAOS;
    TextView TVV;

    final Context context = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertex);

        BB = (Button) findViewById(R.id.BB);
        BER = (Button) findViewById(R.id.BER);
        ETA = (EditText) findViewById(R.id.ETA);
        ETB = (EditText) findViewById(R.id.ETB);
        ETC = (EditText) findViewById(R.id.ETC);
        TVAOS = (TextView) findViewById(R.id.TVAOS);
        TVV = (TextView) findViewById(R.id.TVV);







        BB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(context, ModeSelection.class);
                startActivity(c);
            }
        });

        BER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double A = Integer.parseInt(ETA.getText().toString());
                double B = Integer.parseInt(ETB.getText().toString());
                double C = Integer.parseInt(ETC.getText().toString());

            double AOS = (- (B)) / (2 * (A));
                double power = Math.pow( AOS,2);
            double VERTEX = (A * ( power)) + (B * (AOS)) + C;

                TVAOS.setText("" + AOS);
                TVV.setText("(" + AOS + "," + VERTEX + ")");


            }
        });



    }



}
