package aqiel.motionkalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText etBil1,etBil2;
    Button btnPlus,btnMinus,btnDevide,btnTimes;
    double a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.TvResult);
        etBil1 = findViewById(R.id.EtBil1);
        etBil2 = findViewById(R.id.EtBil2);
        btnDevide = findViewById(R.id.BtnDevide);
        btnPlus = findViewById(R.id.BtnPlus);
        btnMinus = findViewById(R.id.BtnMinus);
        btnTimes = findViewById(R.id.BtnDevide);
    }

    public void Oprate(View V){
        if(!TextUtils.isEmpty(etBil1.getText()) && !TextUtils.isEmpty(etBil2.getText())){
            a = Double.parseDouble(etBil1.getText().toString());
            b = Double.parseDouble(etBil2.getText().toString());
            Button btn = (Button) V;
            switch (btn.getId()){
                case R.id.BtnPlus: tvResult.setText(String.valueOf(a+b));break;
                case R.id.BtnMinus: tvResult.setText(String.valueOf(a-b));break;
                case R.id.BtnDevide: tvResult.setText(String.valueOf(a/b));break;
                case R.id.BtnTimes: tvResult.setText(String.valueOf(a*b));break;
            }
            etBil1.setText("");
            etBil2.setText("");
        }else if(!tvResult.getText().equals("Result!") && TextUtils.isEmpty(etBil1.getText())){
            etBil1.setText(tvResult.getText().toString());
            tvResult.setText("Result!");
        }

    }
}
