package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Question_ThreeActivity extends AppCompatActivity {

    public static String answer;
    public String answer3="None";
    private RadioButton q3rb1;
    private RadioButton q3rb2;
    private RadioButton q3rb3;
    private RadioButton q3rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);

        //获取相关控件
        q3rb1 = (RadioButton) findViewById(R.id.q3rb1);
        q3rb2 = (RadioButton) findViewById(R.id.q3rb2);
        q3rb3 = (RadioButton) findViewById(R.id.q3rb3);
        q3rb4 = (RadioButton) findViewById(R.id.q3rb4);


    }
    public void next3(View view)
    {

        if (q3rb1.isChecked()) {
            answer3=q3rb1.getText().toString();
        }
        if (q3rb2.isChecked()) {
            answer3=q3rb2.getText().toString();
        }
        if (q3rb3.isChecked()) {
            answer3=q3rb3.getText().toString();
        }
        if (q3rb4.isChecked()) {
            answer3=q3rb4.getText().toString();
        }



        answer = answer3;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,Question_FourActivity.class);
        startActivity(intent);
    }

}
