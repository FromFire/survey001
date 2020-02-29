package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox CheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        CheckBox = (CheckBox) findViewById(R.id.checkBox1);
    }

    public void Welcome(View view)
    {//创建意图对象
        if(CheckBox.isChecked()){
            Intent intent =new Intent(this,Question_OneActivity.class);

            //开启意图
            startActivity(intent);
        }

    }
}