package a67yjh00.com.example.lg.javawidgetcontrol;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//!중요! 이 파일을 실행시켜줌

        TextView text1=(TextView)findViewById(R.id.text1);
        TextView text2=(TextView)findViewById(R.id.text2);
        TextView text3=(TextView)findViewById(R.id.text3);
        TextView text4=(TextView)findViewById(R.id.text4);

        text1.setText("First TextView");
        text1.setTextSize(30);
        text1.setBackgroundColor(Color.rgb(255,0,255));
        text1.setTextColor(Color.WHITE);

        text2.setText(R.string.text2_str);//출력글
        text2.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);//글꼴

        text3.setText("Third TextView");
        text3.setBackgroundColor(Color.argb(200,0,0,255));
        text3.setTextColor(Color.rgb(0,0,0));

        text4.setText("Forth TextView");
        text4.setTextSize(15);

    }
}
