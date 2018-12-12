package com.zj.statusbar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置全屏
//        BarUtils.setFullScreen(this);
//        BarUtils.setWindowFlag(this);

        BarUtils.setColor(this, Color.GREEN);
        Toolbar toolbar=findViewById(R.id.tool_bar);
        toolbar.setBackgroundColor(Color.GREEN);
    }





}
