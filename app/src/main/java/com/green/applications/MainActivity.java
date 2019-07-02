package com.green.applications;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView layout1,layout2,layout3,layout4,layout5,layout6;
    boolean checked1=false;
    boolean checked2=false;
    boolean checked3=false;
    boolean checked4=false;
    boolean checked5=false;
    boolean checked6=false;

    boolean onclick=false;
    int count=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1=findViewById(R.id.layout1);
        layout2=findViewById(R.id.layout2);
        layout3=findViewById(R.id.layout3);
        layout4=findViewById(R.id.layout4);
        layout5=findViewById(R.id.layout5);
        layout6=findViewById(R.id.layout6);

        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
        layout3.setOnClickListener(this);
        layout4.setOnClickListener(this);
        layout5.setOnClickListener(this);
        layout6.setOnClickListener(this);

        layout1.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout1.setBackgroundColor(Color.MAGENTA);
                checked1 = true;
                onclick=true;


                return true;
            }

        });
        layout2.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout2.setBackgroundColor(Color.MAGENTA);
                checked2=true;
                onclick=true;

                return true;
            }
        });
        layout3.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout3.setBackgroundColor(Color.MAGENTA);
                checked4=true;
                onclick=true;

                return true;
            }
        });
        layout4.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout4.setBackgroundColor(Color.MAGENTA);
                checked1=true;
                onclick=true;

                return true;
            }
        });  layout5.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout5.setBackgroundColor(Color.MAGENTA);
                checked1=true;
                onclick=true;

                return true;
            }
        });
        layout6.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout6.setBackgroundColor(Color.MAGENTA);
                checked1=true;
                onclick=true;

                return true;
            }
        });

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.layout1:
                if(checked1 && onclick) {
                    layout1.setBackgroundColor(Color.TRANSPARENT);
                    checked1 = false;


                }else if(onclick) {
                    if(count<2) {
                        layout1.setBackgroundColor(Color.MAGENTA);
                        checked1 = true;
                        count++;
                    }

                }else {
                    layout1.setBackgroundColor(Color.TRANSPARENT);
                }

                break;
            case R.id.layout2:
                if(checked2 && onclick) {
                    layout2.setBackgroundColor(Color.TRANSPARENT);
                    checked2= false;
                }else if(onclick) {
                    layout2.setBackgroundColor(Color.MAGENTA);
                    checked2=true;

                }else {
                    layout2.setBackgroundColor(Color.TRANSPARENT);
                }
                break;
            case R.id.layout3:
                if(checked3 && onclick) {
                    layout3.setBackgroundColor(Color.TRANSPARENT);
                    checked3 = false;
                }else if(onclick){
                    layout3.setBackgroundColor(Color.MAGENTA);
                    checked3=true;

                }else {
                    layout3.setBackgroundColor(Color.TRANSPARENT);
                }
                break;
            case R.id.layout4:
                if(checked4 && onclick) {
                    layout4.setBackgroundColor(Color.TRANSPARENT);
                    checked4 = false;
                }else if(onclick) {
                    layout4.setBackgroundColor(Color.MAGENTA);
                    checked4=true;
                }else {
                    layout4.setBackgroundColor(Color.TRANSPARENT);

                }
                break;
            case R.id.layout5:
                if(checked5) {
                    layout5.setBackgroundColor(Color.TRANSPARENT);
                    checked5 = false;
                }else if(onclick) {
                    layout5.setBackgroundColor(Color.MAGENTA);
                    checked5=true;
                    }else {
                    layout5.setBackgroundColor(Color.TRANSPARENT);
                }
                break;
            case R.id.layout6:
                if(checked6) {
                    layout6.setBackgroundColor(Color.TRANSPARENT);
                    checked6 = false;
                }else if(onclick){
                    layout6.setBackgroundColor(Color.MAGENTA);
                    checked6=true;

                }else {
                    layout6.setBackgroundColor(Color.TRANSPARENT);

                }
                break;
                default:
                    layout1.setBackgroundColor(Color.GRAY);
                    layout2.setBackgroundColor(Color.GRAY);
                    layout3.setBackgroundColor(Color.GRAY);
                    layout4.setBackgroundColor(Color.GRAY);
                    layout5.setBackgroundColor(Color.GRAY);
                    layout6.setBackgroundColor(Color.GRAY);

        }

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
