package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
    private Button save1;

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
        save1=(Button)findViewById(R.id.save1);

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


        final String q1="{question:1,answer:'"+question_one.answer+"'}"+"\n"+
                "{question:2,answer:'"+question_two.answer+"'}"+"\n"+
                "{question:3,answer:'"+question_three.answer+"'}"+"\n"+
                "{question:4,answer:'"+question_four.answer+"'}"+"\n"+
                "{question:5,answer:'"+question_five.answer+"'}"+"\n"+
                "{question:6,answer:'"+question_six.answer+"'}"+"\n"+
                "{question:7,answer:'"+question_seven.answer+"'}"+"\n"+
                "{question:8,answer:'"+question_eight.answer+"'}"+"\n"+
                "{question:9,answer:'"+question_nine.answer+"'}"+"\n"+
                "{question:10,answer:'"+question_ten.answer+"'}"+"\n"+
                "{question:11,answer:'"+question_eleven.answer+"'}"+"\n"+
                "{question:12,answer:'"+question_twelve.answer+"'}";
      /*
        final String q2="{question:2,answer:'"+question_two.answer+"'}";
        final String q3="{question:3,answer:'"+question_three.answer+"'}";
        final String q4="{question:4,answer:'"+question_four.answer+"'}";
        final String q5="{question:5,answer:'"+question_five.answer+"'}";
        final String q6="{question:6,answer:'"+question_six.answer+"'}";
        final String q7="{question:7,answer:'"+question_seven.answer+"'}";
        final String q8="{question:8,answer:'"+question_eight.answer+"'}";
        final String q9="{question:9,answer:'"+question_nine.answer+"'}";
        final String q10="{question:10,answer:'"+question_ten.answer+"'}";
        final String q11="{question:11,answer:'"+question_eleven.answer+"'}";
        final String q12="{question:12,answer:'"+question_twelve.answer+"'}";
*/

            //为按钮添加点击事件更新
        save1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                save2File(q1);
                /*save2File(q2);
                save2File(q3);
                save2File(q4);
                save2File(q5);
                save2File(q6);
                save2File(q7);
                save2File(q8);
                save2File(q9);
                save2File(q10);
                save2File(q11);
                save2File(q12);*/
            }

        });

    }

    private void save2File(String msg)  {
        //获得要保存的稳健对象，使用输出流写入内容
        //获得sd卡文件
        /*File sdFire= Environment.getExternalStorageDirectory();
        File saveDate=new File(sdFire,"saveDate.txt");

        try {
            FileOutputStream fout=new FileOutputStream(saveDate);
            fout.write(msg.getBytes());
            fout.flush();
            fout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

         */
        File sdFile=Environment.getExternalStorageDirectory();
        File saveData=new File(sdFile,"saveData.txt");
        try {
            FileOutputStream fout=new FileOutputStream(saveData);
            fout.write(msg.getBytes());
            fout.flush();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
