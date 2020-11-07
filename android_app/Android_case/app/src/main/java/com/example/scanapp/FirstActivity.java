package com.example.scanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {
    RecyclerView rcv;
    Adap adapter;

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setTitle("Product List");

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adap(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Mod> dataqueue()
    {
        ArrayList<Mod> holder=new ArrayList<>();

        Mod ob1=new Mod();
        ob1.setHeader("IPhone 12");
        ob1.setDesc("Fastest phone in Market");
        ob1.setImgname(R.drawable.iphone);

        holder.add(ob1);

        Mod ob2=new Mod();
        ob2.setHeader("Apple MacBook Pro");
        ob2.setDesc("Seamless performance");
        ob2.setImgname(R.drawable.mac);
        holder.add(ob2);

        Mod ob3=new Mod();
        ob3.setHeader("Google Home");
        ob3.setDesc("Power your life with Google AI");
        ob3.setImgname(R.drawable.home);
        holder.add(ob3);

        Mod ob4=new Mod();
        ob4.setHeader("Air Pods Pro");
        ob4.setDesc("Immersive sound experience with noise cancelling");
        ob4.setImgname(R.drawable.pods);
        holder.add(ob4);

        Mod ob5=new Mod();
        ob5.setHeader("Samsung Tab 4");
        ob5.setDesc("Enjoy OLED big Screen");
        ob5.setImgname(R.drawable.samsung);
        holder.add(ob5);

        Mod ob6=new Mod();
        ob6.setHeader("Wordpress Framework");
        ob6.setDesc("PHP based Blogging Framework");
        ob6.setImgname(R.drawable.wordpress);
        holder.add(ob6);

        Mod ob7=new Mod();
        ob7.setHeader("Magento Framework");
        ob7.setDesc("PHP Based e-Comm Framework");
        ob7.setImgname(R.drawable.php);
        holder.add(ob7);

        Mod ob8=new Mod();
        ob8.setHeader("Shopify Framework");
        ob8.setDesc("PHP based e-Comm Framework");
        ob8.setImgname(R.drawable.shopify);
        holder.add(ob8);

        Mod ob9=new Mod();
        ob9.setHeader("Angular Programming");
        ob9.setDesc("Web Programming");
        ob9.setImgname(R.drawable.angular);
        holder.add(ob9);

        Mod ob10=new Mod();
        ob10.setHeader("Python Programming");
        ob10.setDesc("Desktop/Web based Progamming");
        ob10.setImgname(R.drawable.python);
        holder.add(ob10);

        Mod ob11=new Mod();
        ob11.setHeader("Node JS Programming");
        ob11.setDesc("Web based Programming");
        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);


        return holder;
    }


}