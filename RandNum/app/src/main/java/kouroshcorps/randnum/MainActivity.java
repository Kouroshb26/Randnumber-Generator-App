package kouroshcorps.randnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Button generate = (Button) findViewById(R.id.generate);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.start);
                Integer start = null,end = null,result;
                if(!tv.getText().toString().equals("")) {
                    start = Integer.parseInt(tv.getText().toString());
                }

                tv = (TextView) findViewById(R.id.end);
                if(!tv.getText().toString().equals("")) {
                    end = Integer.parseInt(tv.getText().toString());
                }

                tv = (TextView) findViewById(R.id.result);

                if ( end != null && start!= null && end >= start){
                    result = (int) (start + Math.random()*(end-start+1));

                    tv.setText(result+"");
                }
                else{
                    tv.setText("Invalid Input");
                }

            }
        });

        Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.start);
                tv.setText("");
                tv = (TextView) findViewById(R.id.end);
                tv.setText("");
                tv = (TextView) findViewById(R.id.result);
                tv.setText("");
            }
        });


    }
}
