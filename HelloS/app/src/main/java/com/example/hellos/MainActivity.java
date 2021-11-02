package com.example.hellos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Resources resourse = this.getResources();
//    String[] data = resourse.getStringArray(R.array.list);
    String[] data = {"Aa","Bb","Cc","Dd","Ee","Ff","Gg","Hh","Ii","Jj","Kk","Ll","Mm","Nn","Oo","Pp","Kk","Rr","Ss","Tt","Uu","Vv","Ww","Xx","Yy","Zz"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOk=findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new MyOnClickListener());

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

            if(view.getId()==R.id.buttonOk){
                EditText editTextName=findViewById(R.id.editTextName);
                Toast.makeText(MainActivity.this,"欢迎您："+editTextName.getText(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}