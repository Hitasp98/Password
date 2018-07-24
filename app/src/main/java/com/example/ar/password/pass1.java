package com.example.ar.password;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Armin on 7/23/2018.
 */
 class pass1 {
     TextView text3;
    Button bt1;
    EditText edit1;
    EditText edit2;

    public void btn(String s1,String s2)
    {

        int a[]=new int[50];
        int i=-1,count=0;

            //char[50] c=new char[];
            char c[]=s2.toCharArray();

            for (char c1:c) {  i++;
                a[i]=Integer.valueOf(c1);
                count++;
            } int b=Integer.parseInt(s1);
            for(int j=0;j<b;j++) {
                Random r1 = new Random();
                // for (i = 0; i <= count; i++)
                int min=1,max=i+1;
                int f=r1.nextInt(max);
                char c2=(char)a[f];
                text3.append(c2+"");}

}}
