package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question_four extends AppCompatActivity {
    public String answer4="NONE";
    public static String answer;

    private CheckBox q4ck1;
    private CheckBox q4ck2;
    private CheckBox q4ck3;
    private CheckBox q4ck4;
    private CheckBox q4ck5;
    private CheckBox q4ck6;
    private CheckBox q4ck7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);

        //获取相关控件

        q4ck1 = (CheckBox) findViewById(R.id.q4cb1);
        q4ck2 = (CheckBox) findViewById(R.id.q4cb2);
        q4ck3 = (CheckBox) findViewById(R.id.q4cb3);
        q4ck4 = (CheckBox) findViewById(R.id.q4cb4);
        q4ck5 = (CheckBox) findViewById(R.id.q4cb5);
        q4ck6 = (CheckBox) findViewById(R.id.q4cb6);
        q4ck7 = (CheckBox) findViewById(R.id.q4cb7);
    }
    public void next4(View view){
        if (q4ck1.isChecked()) {
            answer4 = q4ck1.getText().toString();
        }
        if (q4ck2.isChecked()) {
            if (answer4 == "NONE") {
                answer4 = q4ck2.getText().toString();
            } else {
                answer4 = answer4 + " , " + q4ck2.getText().toString();
            }
        }
        if (q4ck3.isChecked()) {
            if (answer4 == "NONE") {
                answer4 = q4ck3.getText().toString();
            } else {
                answer4 = answer4 + " , " + q4ck3.getText().toString();
            }
        }
        if (q4ck4.isChecked()) {
            if (answer4 == "NONE") {
                answer4 = q4ck4.getText().toString();
            } else {
                answer4 = answer4 + " , " + q4ck4.getText().toString();
            }
        }
        if (q4ck5.isChecked()) {
            if (answer4 == "NONE") {
                answer4 = q4ck5.getText().toString();
            } else {
                answer4 = answer4 + " , " + q4ck5.getText().toString();
            }
        }
        if (q4ck6.isChecked()) {
            if (answer4 == "NONE") {
                answer4 = q4ck6.getText().toString();
            } else {
                answer4 = answer4 + " , " + q4ck6.getText().toString();
            }
        }
        if (q4ck7.isChecked()) {
            if (answer4 == "NONE") {
                answer4 = q4ck7.getText().toString();
            } else {
                answer4 =answer4 + " , " + q4ck7.getText().toString();
            }
        }
        answer = answer4;
        passDate();
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this, question_five.class);

        //开启意图
        startActivity(intent);
    }

}
