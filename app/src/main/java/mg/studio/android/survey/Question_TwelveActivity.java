package mg.studio.android.survey;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_TwelveActivity extends AppCompatActivity {

    public static String answer;
    public String answer12;
    private RadioButton q12rb1;
    private RadioButton q12rb2;
    private RadioButton q12rb3;
    private RadioButton q12rb4;
    private RadioButton q12rb5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);

        //获取相关控件
        q12rb1 = (RadioButton) findViewById(R.id.q12rb1);
        q12rb2 = (RadioButton) findViewById(R.id.q12rb2);
        q12rb3 = (RadioButton) findViewById(R.id.q12rb3);
        q12rb4 = (RadioButton) findViewById(R.id.q12rb4);
        q12rb5 = (RadioButton) findViewById(R.id.q12rb5);

    }


    public void next12(View view)
    {

        if (q12rb1.isChecked()) {
            answer12=q12rb1.getText().toString();
        }
        if (q12rb2.isChecked()) {
            answer12=q12rb2.getText().toString();
        }
        if (q12rb3.isChecked()) {
            answer12=q12rb3.getText().toString();
        }
        if (q12rb4.isChecked()) {
            answer12=q12rb4.getText().toString();
        }
        if (q12rb5.isChecked()) {
            answer12=q12rb5.getText().toString();
        }

        answer = answer12;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this, Finish_SurveyActivity.class);
        startActivity(intent);
    }

}
