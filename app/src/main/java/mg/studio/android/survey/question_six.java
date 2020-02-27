package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class question_six extends AppCompatActivity {
    public String answer6="NONE";
    public static String answer="None";
    private EditText q6et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
        q6et1= (EditText) findViewById(R.id.q6et1);

    }
    public void next6(View view){
        answer6 = q6et1.getText().toString();
        answer = answer6;
        passDate();
    }

    public void passDate()
    {//创建意图对象
        Intent intent =new Intent(this, question_seven.class);
        //把数据存入intent对象
        //开启意图
        startActivity(intent);
    }
}
