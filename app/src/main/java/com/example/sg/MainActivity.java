package com.example.sg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 TextView number;
 int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.number);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        int action,keycode;
        action=event.getAction();
        keycode=event.getKeyCode();
        switch (keycode){
            case KeyEvent.KEYCODE_VOLUME_UP:
            {
                if(KeyEvent.ACTION_UP==action)
                {
                    count++;
                    String num=String.valueOf(count);
                    number.setText(num);
                    if(count==3)
                    {
                        Toast.makeText(MainActivity.this,"volume button is pressed 3times",Toast.LENGTH_SHORT).show();
                        count=0;
                    }

                }
                break;
             }
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (KeyEvent.ACTION_DOWN==action){
                    count=0;
                    String num=String.valueOf(count);
                    number.setText(num);
                }
                break;
        }

        return super.dispatchKeyEvent(event);
    }
}
