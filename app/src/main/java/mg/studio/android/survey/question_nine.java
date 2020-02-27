package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question_nine extends AppCompatActivity {
    public static String answer;
    public String answer9;
    private RadioButton q9rb1;
    private RadioButton q9rb2;
    private RadioButton q9rb3;
    private RadioButton q9rb4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);

        //获取相关控件
        q9rb1 = (RadioButton) findViewById(R.id.q9rb1);
        q9rb2 = (RadioButton) findViewById(R.id.q9rb2);
        q9rb3 = (RadioButton) findViewById(R.id.q9rb3);
        q9rb4 = (RadioButton) findViewById(R.id.q9rb4);


    }


    public void next9(View view)
    {

        if (q9rb1.isChecked()) {
            answer9=q9rb1.getText().toString();
        }
        if (q9rb2.isChecked()) {
            answer9=q9rb2.getText().toString();
        }
        if (q9rb3.isChecked()) {
            answer9=q9rb3.getText().toString();
        }
        if (q9rb4.isChecked()) {
            answer9=q9rb4.getText().toString();
        }


        answer = answer9;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,question_ten.class);
        startActivity(intent);
    }

}
