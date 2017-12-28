package com.mars.android122802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Intent it = new Intent();
        it.setAction("DD123123");//讓有設定聽取這個動作代號的程式啟動
        it = Intent.createChooser(it, "請選擇一個App 來執行!");//提示使用者要選哪一個程式來做
        startActivity(it);
    }

}
