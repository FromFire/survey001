package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Question_TenActivity extends AppCompatActivity {

    public static String answer;
    public String answer10;
    private RadioButton q10rb1;
    private RadioButton q10rb2;
    private RadioButton q10rb3;
    private RadioButton q10rb4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);

        //获取相关控件
        q10rb1 = (RadioButton) findViewById(R.id.q10rb1);
        q10rb2 = (RadioButton) findViewById(R.id.q10rb2);
        q10rb3 = (RadioButton) findViewById(R.id.q10rb3);
        q10rb4 = (RadioButton) findViewById(R.id.q10rb4);


    }


    public void next10(View view)
    {

        if (q10rb1.isChecked()) {
            answer10=q10rb1.getText().toString();
        }
        if (q10rb2.isChecked()) {
            answer10=q10rb2.getText().toString();
        }
        if (q10rb3.isChecked()) {
            answer10=q10rb3.getText().toString();
        }
        if (q10rb4.isChecked()) {
            answer10=q10rb4.getText().toString();
        }


        answer = answer10;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,Question_ElevenActivity.class);
        startActivity(intent);
    }

}
