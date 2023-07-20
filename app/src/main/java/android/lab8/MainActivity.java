package android.lab8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button BtnHomePage1 , BtnHomePage2 ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnHomePage1 = findViewById(R.id.btnOpenHomePage1);
        BtnHomePage2 = findViewById(R.id.btnOpenHomePage2);

        BtnHomePage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , BT1.class);
                startActivity(intent);
            }
        });

        BtnHomePage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , BT2.class);
                startActivity(intent);
            }
        });
    }
}