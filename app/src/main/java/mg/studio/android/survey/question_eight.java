package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question_eight extends AppCompatActivity {
    public static String answer;
    public String answer8;
    private RadioButton q8rb1;
    private RadioButton q8rb2;
    private RadioButton q8rb3;
    private RadioButton q8rb4;
    private RadioButton q8rb5;
    private RadioButton q8rb6;
    private RadioButton q8rb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);

        //获取相关控件
        q8rb1 = (RadioButton) findViewById(R.id.q8rb1);
        q8rb2 = (RadioButton) findViewById(R.id.q8rb2);
        q8rb3 = (RadioButton) findViewById(R.id.q8rb3);
        q8rb4 = (RadioButton) findViewById(R.id.q8rb4);
        q8rb5 = (RadioButton) findViewById(R.id.q8rb5);
        q8rb6 = (RadioButton) findViewById(R.id.q8rb6);
        q8rb7 = (RadioButton) findViewById(R.id.q8rb7);
    }


    public void next8(View view)
    {

        if (q8rb1.isChecked()) {
            answer8=q8rb1.getText().toString();
        }
        if (q8rb2.isChecked()) {
            answer8=q8rb2.getText().toString();
        }
        if (q8rb3.isChecked()) {
            answer8=q8rb3.getText().toString();
        }
        if (q8rb4.isChecked()) {
            answer8=q8rb4.getText().toString();
        }
        if (q8rb5.isChecked()) {
            answer8=q8rb5.getText().toString();
        }
        if (q8rb6.isChecked()) {
            answer8=q8rb6.getText().toString();
        }
        if (q8rb7.isChecked()) {
            answer8=q8rb7.getText().toString();
        }
        answer = answer8;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,question_nine.class);
        startActivity(intent);
    }

}
