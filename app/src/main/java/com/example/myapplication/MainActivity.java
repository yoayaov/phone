package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {{

        //得到文本框对象
        EditText et = (EditText) findViewById(R.id.editTextTextPersonName);

        //获取用户输入的内容
        String input = et.getText().toString();

        //定义一个正则表达式
        String rgx = "^(1[3|4|5|6|7|8|9][0-9])\\d{8}$";

        //编译正则表达式
        Pattern p = Pattern.compile(rgx);

        Matcher m = p.matcher(input);//检验

        if (!m.matches()) {

            //弹框
            String msg = "无效的手机号";
            Toast t = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
            t.show();
        }
    }

    }
}