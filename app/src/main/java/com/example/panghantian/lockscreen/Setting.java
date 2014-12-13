package com.example.panghantian.lockscreen;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class Setting extends Activity
        implements View.OnClickListener,View.OnTouchListener{
    int count;
    TextView text;
    Button num_1;
    Button num_2;
    Button num_3;
    Button num_4;
    Button num_5;
    Button num_6;
    Button num_7;
    Button num_8;
    Button num_9;
    Button num_0;
    Button clear;
    Button ok;
    String password="";
    String tmp_password="";
    String hint="";
    Vector<Vector<Long>> hold_time=new Vector<Vector<Long>>();
    Vector<Long> tmp_hold_time=new Vector<Long>();
    long down_time_num_1;
    long down_time_num_2;
    long down_time_num_3;
    long down_time_num_4;
    long down_time_num_5;
    long down_time_num_6;
    long down_time_num_7;
    long down_time_num_8;
    long down_time_num_9;
    long down_time_num_0;
    Vector<Vector<Vector<Float>>> pressure=new Vector<Vector<Vector<Float>>>();
    Vector<Vector<Float>> tmp_pressure=new Vector<Vector<Float>>();
    Vector<Float> pressure_num_1=new Vector<Float>();
    Vector<Float> pressure_num_2=new Vector<Float>();
    Vector<Float> pressure_num_3=new Vector<Float>();
    Vector<Float> pressure_num_4=new Vector<Float>();
    Vector<Float> pressure_num_5=new Vector<Float>();
    Vector<Float> pressure_num_6=new Vector<Float>();
    Vector<Float> pressure_num_7=new Vector<Float>();
    Vector<Float> pressure_num_8=new Vector<Float>();
    Vector<Float> pressure_num_9=new Vector<Float>();
    Vector<Float> pressure_num_0=new Vector<Float>();
    Vector<Vector<Vector<Float>>> size=new Vector<Vector<Vector<Float>>>();
    Vector<Vector<Float>> tmp_size=new Vector<Vector<Float>>();
    Vector<Float> size_num_1=new Vector<Float>();
    Vector<Float> size_num_2=new Vector<Float>();
    Vector<Float> size_num_3=new Vector<Float>();
    Vector<Float> size_num_4=new Vector<Float>();
    Vector<Float> size_num_5=new Vector<Float>();
    Vector<Float> size_num_6=new Vector<Float>();
    Vector<Float> size_num_7=new Vector<Float>();
    Vector<Float> size_num_8=new Vector<Float>();
    Vector<Float> size_num_9=new Vector<Float>();
    Vector<Float> size_num_0=new Vector<Float>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_setting);
//        startService(new Intent(Setting.this,Launcher.class));
//        name=(EditText)findViewById(R.id.name);
        text=(TextView)findViewById(R.id.text);
        text.setText("请输入密码");
        num_1=(Button)findViewById(R.id.num_1);
        num_2=(Button)findViewById(R.id.num_2);
        num_3=(Button)findViewById(R.id.num_3);
        num_4=(Button)findViewById(R.id.num_4);
        num_5=(Button)findViewById(R.id.num_5);
        num_6=(Button)findViewById(R.id.num_6);
        num_7=(Button)findViewById(R.id.num_7);
        num_8=(Button)findViewById(R.id.num_8);
        num_9=(Button)findViewById(R.id.num_9);
        num_0=(Button)findViewById(R.id.num_0);
        clear=(Button)findViewById(R.id.clear);
        ok=(Button)findViewById(R.id.ok);

        num_1.setOnClickListener(this);
        num_2.setOnClickListener(this);
        num_3.setOnClickListener(this);
        num_4.setOnClickListener(this);
        num_5.setOnClickListener(this);
        num_6.setOnClickListener(this);
        num_7.setOnClickListener(this);
        num_8.setOnClickListener(this);
        num_9.setOnClickListener(this);
        num_0.setOnClickListener(this);
        clear.setOnClickListener(this);
        ok.setOnClickListener(this);

        num_1.setOnTouchListener(this);
        num_2.setOnTouchListener(this);
        num_3.setOnTouchListener(this);
        num_4.setOnTouchListener(this);
        num_5.setOnTouchListener(this);
        num_6.setOnTouchListener(this);
        num_7.setOnTouchListener(this);
        num_8.setOnTouchListener(this);
        num_9.setOnTouchListener(this);
        num_0.setOnTouchListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouch(View v,MotionEvent event){
        if(event.getActionMasked()==MotionEvent.ACTION_DOWN){
            switch (v.getId()){
                case R.id.num_1:
                    down_time_num_1=SystemClock.uptimeMillis();
                    pressure_num_1=new Vector<Float>();
                    size_num_1=new Vector<Float>();
                    break;
                case R.id.num_2:
                    down_time_num_2=SystemClock.uptimeMillis();
                    pressure_num_2=new Vector<Float>();
                    size_num_2=new Vector<Float>();
                    break;
                case R.id.num_3:
                    down_time_num_3=SystemClock.uptimeMillis();
                    pressure_num_3=new Vector<Float>();
                    size_num_3=new Vector<Float>();
                    break;
                case R.id.num_4:
                    down_time_num_4=SystemClock.uptimeMillis();
                    pressure_num_4=new Vector<Float>();
                    size_num_4=new Vector<Float>();
                    break;
                case R.id.num_5:
                    down_time_num_5=SystemClock.uptimeMillis();
                    pressure_num_5=new Vector<Float>();
                    size_num_5=new Vector<Float>();
                    break;
                case R.id.num_6:
                    down_time_num_6=SystemClock.uptimeMillis();
                    pressure_num_6=new Vector<Float>();
                    size_num_6=new Vector<Float>();
                    break;
                case R.id.num_7:
                    down_time_num_7=SystemClock.uptimeMillis();
                    pressure_num_7=new Vector<Float>();
                    size_num_7=new Vector<Float>();
                    break;
                case R.id.num_8:
                    down_time_num_8=SystemClock.uptimeMillis();
                    pressure_num_8=new Vector<Float>();
                    size_num_8=new Vector<Float>();
                    break;
                case R.id.num_9:
                    down_time_num_9=SystemClock.uptimeMillis();
                    pressure_num_9=new Vector<Float>();
                    size_num_9=new Vector<Float>();
                    break;
                case R.id.num_0:
                    down_time_num_0=SystemClock.uptimeMillis();
                    pressure_num_0=new Vector<Float>();
                    size_num_0=new Vector<Float>();
                    break;
            }
        }
        else if(event.getActionMasked()==MotionEvent.ACTION_UP){
            switch (v.getId()){
                case R.id.num_1:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_1);
                    tmp_pressure.add(pressure_num_1);
                    tmp_size.add(size_num_1);
                    break;
                case R.id.num_2:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_2);
                    tmp_pressure.add(pressure_num_2);
                    tmp_size.add(size_num_2);
                    break;
                case R.id.num_3:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_3);
                    tmp_pressure.add(pressure_num_3);
                    tmp_size.add(size_num_3);
                    break;
                case R.id.num_4:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_4);
                    tmp_pressure.add(pressure_num_4);
                    tmp_size.add(size_num_4);
                    break;
                case R.id.num_5:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_5);
                    tmp_pressure.add(pressure_num_5);
                    tmp_size.add(size_num_5);
                    break;
                case R.id.num_6:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_6);
                    tmp_pressure.add(pressure_num_6);
                    tmp_size.add(size_num_6);
                    break;
                case R.id.num_7:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_7);
                    tmp_pressure.add(pressure_num_7);
                    tmp_size.add(size_num_7);
                    break;
                case R.id.num_8:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_8);
                    tmp_pressure.add(pressure_num_8);
                    tmp_size.add(size_num_8);
                    break;
                case R.id.num_9:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_9);
                    tmp_pressure.add(pressure_num_9);
                    tmp_size.add(size_num_9);
                    break;
                case R.id.num_0:
                    tmp_hold_time.add(SystemClock.uptimeMillis()-down_time_num_0);
                    tmp_pressure.add(pressure_num_0);
                    tmp_size.add(size_num_0);
                    break;
            }
        }
        switch (v.getId()){
            case R.id.num_1:
                pressure_num_1.add(event.getPressure());
                size_num_1.add(event.getSize());
                return false;
            case R.id.num_2:
                pressure_num_2.add(event.getPressure());
                size_num_2.add(event.getSize());
                return false;
            case R.id.num_3:
                pressure_num_3.add(event.getPressure());
                size_num_3.add(event.getSize());
                return false;
            case R.id.num_4:
                pressure_num_4.add(event.getPressure());
                size_num_4.add(event.getSize());
                return false;
            case R.id.num_5:
                pressure_num_5.add(event.getPressure());
                size_num_5.add(event.getSize());
                return false;
            case R.id.num_6:
                pressure_num_6.add(event.getPressure());
                size_num_6.add(event.getSize());
                return false;
            case R.id.num_7:
                pressure_num_7.add(event.getPressure());
                size_num_7.add(event.getSize());
                return false;
            case R.id.num_8:
                pressure_num_8.add(event.getPressure());
                size_num_8.add(event.getSize());
                return false;
            case R.id.num_9:
                pressure_num_9.add(event.getPressure());
                size_num_9.add(event.getSize());
                return false;
            case R.id.num_0:
                pressure_num_0.add(event.getPressure());
                size_num_0.add(event.getSize());
                return false;
            default:
                return super.onTouchEvent(event);
        }
    }

    @Override
    public  void onClick(View v){
        switch (v.getId()){
            case R.id.num_1:
                text.setText(hint+="*");
                tmp_password+="1";
                break;
            case R.id.num_2:
                text.setText(hint+="*");
                tmp_password+="2";
                break;
            case R.id.num_3:
                text.setText(hint+="*");
                tmp_password+="3";
                break;
            case R.id.num_4:
                text.setText(hint+="*");
                tmp_password+="4";
                break;
            case R.id.num_5:
                text.setText(hint+="*");
                tmp_password+="5";
                break;
            case R.id.num_6:
                text.setText(hint+="*");
                tmp_password+="6";
                break;
            case R.id.num_7:
                text.setText(hint+="*");
                tmp_password+="7";
                break;
            case R.id.num_8:
                text.setText(hint+="*");
                tmp_password+="8";
                break;
            case R.id.num_9:
                text.setText(hint+="*");
                tmp_password+="9";
                break;
            case R.id.num_0:
                text.setText(hint+="*");
                tmp_password+="0";
                break;
            case R.id.clear:
                text.setText("请重新输入");
                hint="";
                tmp_password="";
                tmp_hold_time=new Vector<Long>();
                tmp_pressure=new Vector<Vector<Float>>();
                tmp_size=new Vector<Vector<Float>>();
                break;
            case R.id.ok:
                Log.d("Setting","tmp_password : "+tmp_password);
                if (count==0)
                    password=tmp_password;
                if (tmp_password.equals(password)){
                    text.setText("请再次输入");
                    Log.d("Setting","tmp_hold_time : "+tmp_hold_time.toString());
                    hold_time.add(tmp_hold_time);
                    Log.d("Setting","tmp_pressure : "+tmp_pressure.toString());
                    pressure.add(tmp_pressure);
                    Log.d("Setting","tmp_size : "+tmp_size.toString());
                    size.add(tmp_size);
                    ++count;
                }else{
                    text.setText("输入错误");
                }
                hint="";
                tmp_password="";
                tmp_hold_time=new Vector<Long>();
                tmp_pressure=new Vector<Vector<Float>>();
                tmp_size=new Vector<Vector<Float>>();
//                Thread thread=new Thread(this);
//                thread.start();
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                if (count==5){
                    try {
                        FileOutputStream fileOutputStream = openFileOutput("password",MODE_PRIVATE);
                        fileOutputStream.write(password.getBytes());
                        fileOutputStream.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    setResult(RESULT_OK);
                    finish();
                }
                break;
        }
    }

    @Override
    protected void onDestroy (){
        super.onDestroy();
        setResult(RESULT_CANCELED);
    }
//    @Override
//    public void run(){
//        try {
//            Socket socket=new Socket("115.29.168.27",9000);
//            OutputStream outputStream=socket.getOutputStream();
//            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(name.getText().toString());
//            objectOutputStream.writeObject(password);
//            objectOutputStream.writeObject(hold_time);
//            objectOutputStream.writeObject(pressure);
//            objectOutputStream.writeObject(size);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
