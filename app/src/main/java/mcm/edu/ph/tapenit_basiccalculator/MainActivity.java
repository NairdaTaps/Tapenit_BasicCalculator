package mcm.edu.ph.tapenit_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnModulo,btnDivision,btnMultiply,btnSubtraction,btnAddition;
        EditText txtOperand1,txtOperand2;
        TextView textView4;

        btnModulo = findViewById(R.id.btnModulo);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnAddition = findViewById(R.id.btnAddition);



        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        EditText txtOperand1,txtOperand2;
        TextView textView4;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        textView4 = findViewById(R.id.textView4);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAddition:
                answer = op1 + op2;
                textView4.setText(Double.toString(answer));
                break;
            case R.id.btnSubtraction:
                answer = op1 - op2;
                textView4.setText(Double.toString(answer));

                break;
            case R.id.btnMultiply:
                answer = op1 * op2;
                textView4.setText(Double.toString(answer));

                break;
            case R.id.btnDivision:
                answer = op1 / op2;
                textView4.setText(Double.toString(answer));

                break;
            case R.id.btnModulo:
                answer = op1 % op2;
                textView4.setText(Double.toString(answer));

                break;
        }

    }
}