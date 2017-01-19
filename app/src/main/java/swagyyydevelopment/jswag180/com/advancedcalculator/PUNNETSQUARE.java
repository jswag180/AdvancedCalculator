package swagyyydevelopment.jswag180.com.advancedcalculator;



import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PUNNETSQUARE extends AppCompatActivity {


    final Context context = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneortwo);

        Button choseOne = (Button) findViewById(R.id.choseOne);
        Button choseTwo = (Button) findViewById(R.id.choseTwo);
        Button BACKBUTTON = (Button) findViewById(R.id.BACKBUTTON);

        choseOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(context, InfoGatheringPunnet.class);
                c.putExtra("Trait","1");
                startActivity(c);
            }
        });

        choseTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(context, InfoGatheringPunnet.class);
                d.putExtra("Trait","2");
                startActivity(d);
            }
        });

        BACKBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(context, ModeSelection.class);
                startActivity(e);
            }
        });
    }
}
