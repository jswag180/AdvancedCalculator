package swagyyydevelopment.jswag180.com.advancedcalculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class InfoGatheringPunnet extends AppCompatActivity {

    //Intent intent = new Intent(this, InfoGatheringPunnet.class);
    final Context context = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infogatheringpunnet);

        Button BackButton = (Button) findViewById(R.id.BackButton);
        Button ButtonEnter = (Button) findViewById(R.id.ButtonEnter);

            if (getIntent().getExtras().get("Trait").equals("1")) {

                Toast.makeText(context, "ONE", Toast.LENGTH_LONG).show();

            } else if (getIntent().getExtras().get("Trait").equals("2")) {

                Toast.makeText(context, "TWO", Toast.LENGTH_LONG).show();

            }


        //

        ButtonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(context, ModeSelection.class);
                startActivity(c);
            }
        });

    }
}
