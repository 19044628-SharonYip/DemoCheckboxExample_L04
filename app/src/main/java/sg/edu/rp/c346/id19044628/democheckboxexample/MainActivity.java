package sg.edu.rp.c346.id19044628.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCheck;
    CheckBox chckBoxDist;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheck=findViewById(R.id.buttonCheck);
        chckBoxDist=findViewById(R.id.checkBoxDiscount);
        tvDisplay=findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");

                if(chckBoxDist.isChecked())
                {
                    double pay= calcPay(100,20);
                    tvDisplay.setText("The discount is given, you need to pay "+pay);

                }
                else
                {
                    double pay= calcPay(100,0);
                    tvDisplay.setText("The discount is not given, you need to pay "+pay);

                }
                Toast.makeText(MainActivity.this,"Button Clicked", Toast.LENGTH_LONG).show();

            }
        });

    }

    private double calcPay(double price, double discount)
    {
        double pay=price*(1-discount/100);
        return pay;
    }
}