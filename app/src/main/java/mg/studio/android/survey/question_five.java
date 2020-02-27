package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question_five extends AppCompatActivity {

    public String answer5="NONE";
    public static String answer;

    private CheckBox q5ck1;
    private CheckBox q5ck2;
    private CheckBox q5ck3;
    private CheckBox q5ck4;
    private CheckBox q5ck5;
    private CheckBox q5ck6;
    private CheckBox q5ck7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);

        //获取相关控件

        q5ck1 = (CheckBox) findViewById(R.id.q5cb1);
        q5ck2 = (CheckBox) findViewById(R.id.q5cb2);
        q5ck3 = (CheckBox) findViewById(R.id.q5cb3);
        q5ck4 = (CheckBox) findViewById(R.id.q5cb4);
        q5ck5 = (CheckBox) findViewById(R.id.q5cb5);
        q5ck6 = (CheckBox) findViewById(R.id.q5cb6);
        q5ck7 = (CheckBox) findViewById(R.id.q5cb7);
    }
    public void next5(View view){
        if (q5ck1.isChecked()) {
            answer5 = q5ck1.getText().toString();
        }
        if (q5ck2.isChecked()) {
            if (answer5 == "NONE") {
                answer5= q5ck2.getText().toString();
            } else {
                answer5 = answer5 + " , " + q5ck2.getText().toString();
            }
        }
        if (q5ck3.isChecked()) {
            if (answer5 == "NONE") {
                answer5 = q5ck3.getText().toString();
            } else {
                answer5 = answer5 + " , " + q5ck3.getText().toString();
            }
        }
        if (q5ck4.isChecked()) {
            if (answer5 == "NONE") {
                answer5 = q5ck4.getText().toString();
            } else {
                answer5 = answer5 + " , " + q5ck4.getText().toString();
            }
        }
        if (q5ck5.isChecked()) {
            if (answer5 == "NONE") {
                answer5 = q5ck5.getText().toString();
            } else {
                answer5 = answer5 + " , " + q5ck5.getText().toString();
            }
        }
        if (q5ck6.isChecked()) {
            if (answer5 == "NONE") {
                answer5 = q5ck6.getText().toString();
            } else {
                answer5 = answer5 + " , " + q5ck6.getText().toString();
            }
        }
        if (q5ck7.isChecked()) {
            if (answer5 == "NONE") {
                answer5 = q5ck7.getText().toString();
            } else {
                answer5 =answer5 + " , " + q5ck7.getText().toString();
            }
        }
        answer = answer5;
        passDate();
    }
    //给按钮设置点击事件
     /*   next4.setOnClickListener(new View.OnClickListener()
        {
            int an1=question4.getCheckedRadioButtonId();
            public void onClick(View v)
            {
                if (an1==R.id.q4rb1)
                {
                    answer4=(TextView)findViewById(R.id.q4rb1);
                    passDate();
                }
            }
        });
        setContentView(R.layout.question_five);
*/

    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,question_six.class);

        //开启意图
        startActivity(intent);
    }

}