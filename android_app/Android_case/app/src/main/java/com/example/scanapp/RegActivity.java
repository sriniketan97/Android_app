package com.example.scanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {

    public static String Tag = RegActivity.class.getSimpleName();
    EditText username,password,repassword;
    Button signup,signin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        username=(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);
        repassword=(EditText) findViewById(R.id.repassword);
        signup=(Button)findViewById(R.id.btnsignup);
        signin=(Button) findViewById(R.id.btnsignin);
        DB=new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(RegActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(repass)){
                        Boolean checkuser=DB.checkusername(user);
                        if(checkuser==false) {
                            Boolean insert = DB.insertdata(user, pass);
                            if (insert == true) {

                                Log.i(Tag,"Registered successfully");
                                Toast.makeText(RegActivity.this, "Registered Sucessfully!!!", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(RegActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(RegActivity.this, "User already exists please signin!!", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(RegActivity.this, "Password Not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}