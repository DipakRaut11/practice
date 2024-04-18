package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notification();
            }
        });
    }
    public void notification(){
        String channel_id = "CHANNEL_ID";
        NotificationCompat.Builder builder =new NotificationCompat.Builder(getApplicationContext(),channel_id)
                .setSmallIcon(R.drawable.notification)
                .setContentTitle("Hello").
                setContentText("Hello how are you")
                .setAutoCancel(true)
                .setPriority(Notification.PRIORITY_HIGH);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("Data", "Hello how are you");



    }
}