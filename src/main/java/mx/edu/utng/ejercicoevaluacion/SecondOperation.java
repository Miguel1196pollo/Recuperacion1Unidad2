package mx.edu.utng.ejercicoevaluacion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Toshiba on 19/01/2017.
 */
public class SecondOperation extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumer2;
    private EditText edtNumber3;
    private EditText edtNumber4;
    private Button btnCalculate;
    private TextView txvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);
        edtNumber1 = (EditText)findViewById(R.id.edt_number_1);
        edtNumer2 = (EditText)findViewById(R.id.edt_number_2);
        edtNumber3 = (EditText)findViewById(R.id.edt_number_3);
        edtNumber4 = (EditText)findViewById(R.id.edt_number_4);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        txvResult = (TextView)findViewById(R.id.txv_result);

         btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(edtNumber1.getText().toString());
                float number2 = Float.parseFloat(edtNumer2.getText().toString());
                float number3 = Float.parseFloat(edtNumber3.getText().toString());
                float number4 = Float.parseFloat(edtNumber4.getText().toString());
                float result = 0;

                        result = (number1 - (2 * number2)  - number3 + number4)*(number1+ (2 * number2) + number2 + number3+number4)
                                +(2*(number4*number1))*(5*(number1*number1)*(number2)*(number3*number3*number3));


                txvResult.setText(""+result);
                }


        });


    }
}
