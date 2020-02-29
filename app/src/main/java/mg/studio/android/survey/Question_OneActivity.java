package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Question_OneActivity extends AppCompatActivity {
    public static String answer;
    public String answer1;
    private RadioButton q1rb1;
    private RadioButton q1rb2;
    private RadioButton q1rb3;
    private RadioButton q1rb4;
    private RadioButton q1rb5;
    private RadioButton q1rb6;
    private RadioButton q1rb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);

        //获取相关控件
        q1rb1 = (RadioButton) findViewById(R.id.q1rb1);
        q1rb2 = (RadioButton) findViewById(R.id.q1rb2);
        q1rb3 = (RadioButton) findViewById(R.id.q1rb3);
        q1rb4 = (RadioButton) findViewById(R.id.q1rb4);
        q1rb5 = (RadioButton) findViewById(R.id.q1rb5);
        q1rb6 = (RadioButton) findViewById(R.id.q1rb6);
        q1rb7 = (RadioButton) findViewById(R.id.q1rb7);
    }


    public void next1(View view)
    {

        if (q1rb1.isChecked()) {
            answer1=q1rb1.getText().toString();
        }
        if (q1rb2.isChecked()) {
            answer1=q1rb2.getText().toString();
        }
        if (q1rb3.isChecked()) {
            answer1=q1rb3.getText().toString();
        }
        if (q1rb4.isChecked()) {
            answer1=q1rb4.getText().toString();
        }
        if (q1rb5.isChecked()) {
            answer1=q1rb5.getText().toString();
        }
        if (q1rb6.isChecked()) {
            answer1=q1rb6.getText().toString();
        }
        if (q1rb7.isChecked()) {
            answer1=q1rb7.getText().toString();
        }
        answer = answer1;

        if (q1rb1.isChecked()||q1rb2.isChecked()||q1rb3.isChecked()||q1rb4.isChecked()
                ||q1rb5.isChecked()||q1rb6.isChecked()||q1rb7.isChecked())
        {
            passDate();
        }


     //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,Question_TwoActivity.class);
        startActivity(intent);
    }

}
