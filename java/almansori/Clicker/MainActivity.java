package almansori.Clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnClick;
    Button btnReset;
    TextView txtcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.buttonClick);
        btnReset = (Button) findViewById(R.id.buttonReset);
        txtcount = (TextView) findViewById(R.id.textViewcount);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String countvalue = txtcount.getText().toString();
                int intCountValue = Integer.parseInt(countvalue);
                intCountValue++;

                txtcount.setText(String.valueOf(intCountValue));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtcount.setText(String.valueOf(0));

            }
        });


    }}