package com.example.crush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView btnKYeu;
    private ImageView btnYeu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKYeu = (ImageView) findViewById(R.id.btnKYeu);
        btnYeu = (ImageView) findViewById(R.id.btnYeu);

        btnKYeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    RelativeLayout.LayoutParams btnRelay = new RelativeLayout.LayoutParams(270,270);
                    Random random = new Random();

                    btnRelay.addRule(random.nextInt(23));


                    Random random1 = new Random();
                    if(random1.nextInt(4) == 1){
                        btnRelay.topMargin = random.nextInt(1900);
                    }else if(random1.nextInt(4) ==2){
                        btnRelay.leftMargin = random.nextInt(900);
                    }else if(random1.nextInt(4) ==3){
                        btnRelay.bottomMargin = random.nextInt(1900);
                    }else{
                        btnRelay.rightMargin = random.nextInt(900);
                    }

                    btnKYeu.setLayoutParams(btnRelay);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Chảnh vừa thui bạn ơi",Toast.LENGTH_LONG);
                }
            }
        });
        btnYeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Yeu.class));
            }
        });

    }

}