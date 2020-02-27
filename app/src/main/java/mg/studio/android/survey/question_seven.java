package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question_seven extends AppCompatActivity {

    public static String answer;
    public String answer7;
    private RadioButton q7rb1;
    private RadioButton q7rb2;
    private RadioButton q7rb3;
    private RadioButton q7rb4;
    private RadioButton q7rb5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);

        //获取相关控件
        q7rb1 = (RadioButton) findViewById(R.id.q7rb1);
        q7rb2 = (RadioButton) findViewById(R.id.q7rb2);
        q7rb3 = (RadioButton) findViewById(R.id.q7rb3);
        q7rb4 = (RadioButton) findViewById(R.id.q7rb4);
        q7rb5 = (RadioButton) findViewById(R.id.q7rb5);

    }


    public void next7(View view)
    {

        if (q7rb1.isChecked()) {
            answer7=q7rb1.getText().toString();
        }
        if (q7rb2.isChecked()) {
            answer7=q7rb2.getText().toString();
        }
        if (q7rb3.isChecked()) {
            answer7=q7rb3.getText().toString();
        }
        if (q7rb4.isChecked()) {
            answer7=q7rb4.getText().toString();
        }
        if (q7rb5.isChecked()) {
            answer7=q7rb5.getText().toString();
        }

        answer = answer7;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this, question_eight.class);
        startActivity(intent);
    }

}