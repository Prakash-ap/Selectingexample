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
    int count=0;


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
               // checked1 = true;
                onclick=true;
                count++;
                layout1.setTag("true");
                return true;



            }

        });
        layout2.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout2.setBackgroundColor(Color.MAGENTA);
             //   checked2=true;
                onclick=true;
                count++;
                layout2.setTag("true");


                return true;
            }
        });
        layout3.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout3.setBackgroundColor(Color.MAGENTA);
             //   checked4=true;
                onclick=true;
                count++;
                layout3.setTag("true");


                return true;
            }
        });
        layout4.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout4.setBackgroundColor(Color.MAGENTA);
            //    checked1=true;
                onclick=true;
                count++;
                layout4.setTag("true");


                return true;
            }
        });  layout5.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout5.setBackgroundColor(Color.MAGENTA);
               // checked1=true;
                onclick=true;
                count++;
                layout5.setTag("true");


                return true;
            }
        });
        layout6.setOnLongClickListener(new  View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                layout6.setBackgroundColor(Color.MAGENTA);
               // checked1=true;
                onclick=true;
                count++;
                layout6.setTag("true");


                return true;
            }
        });

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.layout1:
                if(layout1.getTag().toString().equals("true") && onclick) {
                    layout1.setBackgroundColor(Color.TRANSPARENT);
                  //  checked1 = false;
                    layout1.setTag("false");
                    count--;


                }else if(onclick) {
                    if(count<2) {
                        layout1.setBackgroundColor(Color.MAGENTA);
                       // checked1 = true;
                        layout1.setTag("true");
                        count++;
                    }

                }else {
                    layout1.setBackgroundColor(Color.TRANSPARENT);
                }

                break;
            case R.id.layout2:
                if(layout2.getTag().toString().equals("true") && onclick) {
                    layout2.setBackgroundColor(Color.TRANSPARENT);
//                    checked2= false;
                    layout2.setTag("false");
                    count--;
                }else if(onclick) {
                    if(count<2) {
                        layout2.setBackgroundColor(Color.MAGENTA);
//                        checked2 = true;
                        layout2.setTag("true");
                        count++;
                    }

                }else {
                    layout2.setBackgroundColor(Color.TRANSPARENT);
                }
                break;
            case R.id.layout3:
                if(layout3.getTag().toString().equals("true") && onclick) {
                    layout3.setBackgroundColor(Color.TRANSPARENT);
//                    checked3 = false;
                    layout3.setTag("false");
                    count--;
                }else if(onclick){
                    if(count<2) {
                        layout3.setBackgroundColor(Color.MAGENTA);
//                        checked3 = true;
                        layout3.setTag("true");
                        count++;
                    }

                }else {
                    layout3.setBackgroundColor(Color.TRANSPARENT);
                }
                break;
            case R.id.layout4:
                if(layout4.getTag().toString().equals("true") && onclick) {
                    layout4.setBackgroundColor(Color.TRANSPARENT);
//                    checked4 = false;
                    layout4.setTag("false");
                    count--;
                }else if(onclick) {
                    if(count<2) {
                        layout4.setBackgroundColor(Color.MAGENTA);
//                        checked4 = true;
                        layout4.setTag("true");
                        count++;
                    }
                }else {
                    layout4.setBackgroundColor(Color.TRANSPARENT);

                }
                break;
            case R.id.layout5:
                if(layout5.getTag().toString().equals("true") && onclick) {
                    layout5.setBackgroundColor(Color.TRANSPARENT);
//                    checked5 = false;
                    layout5.setTag("false");
                    count--;
                }else if(onclick) {
                    if(count<2) {
                        layout5.setBackgroundColor(Color.MAGENTA);
//                        checked5 = true;
                        layout5.setTag("true");
                        count++;
                    }
                    }else {
                    layout5.setBackgroundColor(Color.TRANSPARENT);
                }
                break;
            case R.id.layout6:
                if(layout6.getTag().toString().equals("true") && onclick) {
                    layout6.setBackgroundColor(Color.TRANSPARENT);
//                    checked6 = false;
                    layout6.setTag("false");
                    count--;
                }else if(onclick){
                    if(count<2) {
                        layout6.setBackgroundColor(Color.MAGENTA);
//                        checked6 = true;
                        layout6.setTag("true");
                        count++;
                    }

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
