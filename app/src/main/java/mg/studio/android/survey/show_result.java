package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class show_result extends AppCompatActivity {
    private TextView qa1;
    private TextView qa2;
    private TextView qa3;
    private TextView qa4;
    private TextView qa5;
    private TextView qa6;
    private TextView qa7;
    private TextView qa8;
    private TextView qa9;
    private TextView qa10;
    private TextView qa11;
    private TextView qa12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_result);


        qa1= (TextView) findViewById(R.id.qa1);
        qa2= (TextView) findViewById(R.id.qa2);
        qa3= (TextView) findViewById(R.id.qa3);
        qa4= (TextView) findViewById(R.id.qa4);
        qa5= (TextView) findViewById(R.id.qa5);
        qa6= (TextView) findViewById(R.id.qa6);
        qa7= (TextView) findViewById(R.id.qa7);
        qa8= (TextView) findViewById(R.id.qa8);
        qa9= (TextView) findViewById(R.id.qa9);
        qa10= (TextView) findViewById(R.id.qa10);
        qa11= (TextView) findViewById(R.id.qa11);
        qa12= (TextView) findViewById(R.id.qa12);

        qa1.setText("Q1: "+question_one.answer);
        qa2.setText("Q2: "+question_two.answer);
        qa3.setText("Q3: "+question_three.answer);
        qa4.setText("Q4: "+question_four.answer);
        qa5.setText("Q5: "+question_five.answer);
        qa6.setText("Q6: "+question_six.answer);
        qa7.setText("Q7: "+question_seven.answer);
        qa8.setText("Q8: "+question_eight.answer);
        qa9.setText("Q9: "+question_nine.answer);
        qa10.setText("Q10: "+question_ten.answer);
        qa11.setText("Q11:"+question_eleven.answer);
        qa12.setText("Q12:"+question_twelve.answer);
    }
}
