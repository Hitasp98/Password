package com.example.ar.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    TextView text3;
    Button bt1;
    EditText edit1;
    EditText edit2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text3=(TextView)findViewById(R.id.text3);
        Button bt1=(Button)findViewById(R.id.bt1);
        final EditText edit1=(EditText)findViewById(R.id.edit1);
        final EditText edit2=(EditText)findViewById(R.id.edit2);
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       text3.setText("");
                                       String s1 = edit1.getText().toString();
                                       String s2 = edit2.getText().toString();
                                       int b = Integer.parseInt(s1);
                                       Random r1 = new Random();
//if(String s1.length())
                                       int a[] = new int[50];
                                       int i = -1, count = 0;
                                       if (s2 != null) {
                                           //char[50] c=new char[];
                                           char c[] = s2.toCharArray();

                                           for (char c1 : c) {
                                               i++;
                                               a[i] = Integer.valueOf(c1);
                                               count++;
                                           }

                                           //    for(i=0;i<count;i++)   text3.append(a[i]+"\n");

                                           int f;char c2;
                                           for (int j = 0; j < b; j++) {

                                               // for (i = 0; i <= count; i++)
                                               int l=r1.nextInt(5)+1;
                                               if(l==2)
                                               { f = r1.nextInt(190)+32;c2=(char)f;}
                                               else{int min = 1, max = i;
                                                   f = r1.nextInt(max);

                                                   c2 = (char) a[f];}
                                               text3.append(c2 + "");}
/*if(s2==null)
{
for(i=0;i<b;i++)
{
    int s=r1.nextInt(190)+32;
    char ss=(char)s;
    text3.append("\nss");
}

                                           }*/
                                       }
                                   }
                               }
        );
    }
}