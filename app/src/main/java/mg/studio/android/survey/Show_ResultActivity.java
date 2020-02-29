package mg.studio.android.survey;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Show_ResultActivity extends AppCompatActivity {
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

        qa1.setText("Q1: "+Question_OneActivity.answer);
        qa2.setText("Q2: "+Question_TwoActivity.answer);
        qa3.setText("Q3: "+Question_ThreeActivity.answer);
        qa4.setText("Q4: "+Question_FourActivity.answer);
        qa5.setText("Q5: "+Question_FiveActivity.answer);
        qa6.setText("Q6: "+Question_SixActivity.answer);
        qa7.setText("Q7: "+Question_SevenActivity.answer);
        qa8.setText("Q8: "+Question_EightActivity.answer);
        qa9.setText("Q9: "+Question_NineActivity.answer);
        qa10.setText("Q10: "+Question_TenActivity.answer);
        qa11.setText("Q11:"+Question_ElevenActivity.answer);
        qa12.setText("Q12:"+Question_TwelveActivity.answer);


        final String q1="\n"+"{question:1,answer:'"+Question_OneActivity.answer+"'}"+"\n"+
                "{question:2,answer:'"+Question_TwoActivity.answer+"'}"+"\n"+
                "{question:3,answer:'"+Question_ThreeActivity.answer+"'}"+"\n"+
                "{question:4,answer:'"+Question_FourActivity.answer+"'}"+"\n"+
                "{question:5,answer:'"+Question_FiveActivity.answer+"'}"+"\n"+
                "{question:6,answer:'"+Question_SixActivity.answer+"'}"+"\n"+
                "{question:7,answer:'"+Question_SevenActivity.answer+"'}"+"\n"+
                "{question:8,answer:'"+Question_EightActivity.answer+"'}"+"\n"+
                "{question:9,answer:'"+Question_NineActivity.answer+"'}"+"\n"+
                "{question:10,answer:'"+Question_TenActivity.answer+"'}"+"\n"+
                "{question:11,answer:'"+Question_ElevenActivity.answer+"'}"+"\n"+
                "{question:12,answer:'"+Question_TwelveActivity.answer+"'}"+"\n";


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
            @RequiresApi(api = Build.VERSION_CODES.M)
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

        File sdFile=getExternalFilesDir(null);
        FileOutputStream fout=null;
        File saveData1=new File(sdFile,"saveData.json");
        File saveData2=new File(sdFile,"saveData.txt");
        if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
        try {
            //FileOutputStream fout=new FileOutputStream(saveData);
            fout=new FileOutputStream(saveData1,true);
            fout.write(msg.getBytes());
            fout.flush();
            fout.close();


            fout=new FileOutputStream(saveData2,true);
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
