package mx.edu.utng.ejercicoevaluacion;

import android.content.Intent;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnGoes1;
    private Button btnGoes2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoes1 = (Button) findViewById(R.id.btn_goes_1);
        btnGoes2 = (Button) findViewById(R.id.btn_goes_2);
        btnGoes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FirstActivity.class));

            }
        });
        btnGoes2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SecondOperation.class));
            }
        });
    }
}
