package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Question_TwoActivity extends AppCompatActivity {
    public static String answer;
    public String answer2="None";
    private RadioButton q2rb1;
    private RadioButton q2rb2;
    private RadioButton q2rb3;
    private RadioButton q2rb4;
    private RadioButton q2rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);

        //获取相关控件
        q2rb1 = (RadioButton) findViewById(R.id.q2rb1);
        q2rb2 = (RadioButton) findViewById(R.id.q2rb2);
        q2rb3 = (RadioButton) findViewById(R.id.q2rb3);
        q2rb4 = (RadioButton) findViewById(R.id.q2rb4);
        q2rb5 = (RadioButton) findViewById(R.id.q2rb5);

    }
    public void next2(View view)
    {

        if (q2rb1.isChecked()) {
            answer2=q2rb1.getText().toString();
        }
        if (q2rb2.isChecked()) {
            answer2=q2rb2.getText().toString();
        }
        if (q2rb3.isChecked()) {
            answer2=q2rb3.getText().toString();
        }
        if (q2rb4.isChecked()) {
            answer2=q2rb4.getText().toString();
        }
        if (q2rb5.isChecked()) {
            answer2=q2rb5.getText().toString();
        }


        answer = answer2;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,Question_ThreeActivity.class);
        startActivity(intent);
    }

}
