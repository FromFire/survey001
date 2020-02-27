package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class question_eleven extends AppCompatActivity {

    public static String answer;
    public String answer11;
    private RadioButton q11rb1;
    private RadioButton q11rb2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);

        //获取相关控件
        q11rb1 = (RadioButton) findViewById(R.id.q11rb1);
        q11rb2 = (RadioButton) findViewById(R.id.q11rb2);



    }


    public void next11(View view)
    {

        if (q11rb1.isChecked()) {
            answer11=q11rb1.getText().toString();
        }
        if (q11rb2.isChecked()) {
            answer11=q11rb2.getText().toString();
        }


        answer = answer11;

        passDate();
        //    setContentView(R.layout.question_two);
    }


    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this,question_twelve.class);
        startActivity(intent);
    }

}
