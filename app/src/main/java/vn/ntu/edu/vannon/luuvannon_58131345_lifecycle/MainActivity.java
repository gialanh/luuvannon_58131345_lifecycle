package vn.ntu.edu.vannon.luuvannon_58131345_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txttg ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("life" ,"oncreate") ;
        txttg=findViewById(R.id.thoigian);
        SimpleDateFormat spf =new SimpleDateFormat("HH:mm:ss");
        String stradate =spf.format(new Date());
        txttg.setText(stradate);
        Toast.makeText(getApplicationContext(), "oncreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life" ,"onstart") ;
        Toast.makeText(getApplicationContext(), "onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life" ,"onstop") ;
        Toast.makeText(getApplicationContext(), "onstop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life" ,"ondestroy") ;
        Toast.makeText(getApplicationContext(), "ondestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life" ,"onpause") ;
        Toast.makeText(getApplicationContext(), "onpause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life" ,"onresume") ;
        Toast.makeText(getApplicationContext(), "onresume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life" ,"onrestart") ;
        Toast.makeText(getApplicationContext(), "onrestart", Toast.LENGTH_SHORT).show();
    }


}
