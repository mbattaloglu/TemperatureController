package com.example.temperature;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    static String PERCENTAGE_SIGN = "%";
    static String DEGREE_SIGN = "º";

    //boolean isEngineWorking;

    TextView txtTemperatureValue;
    TextView txtHumidityValue;
    TextView txtWifiInformation;
    TextView txtEngineStatus;

    //Button btnStartFan;

    FirebaseDatabase database;
    DatabaseReference mainReference;

    Value value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTemperatureValue = findViewById(R.id.txtTemperatureValue);
        txtHumidityValue = findViewById(R.id.txtHumidityValue);
        txtWifiInformation = findViewById(R.id.txtWifiInformation);
        //txtEngineStatus = findViewById(R.id.txtEngineStatusValue);

        //btnStartFan = findViewById(R.id.btnStartFan);

        database = FirebaseDatabase.getInstance();
        mainReference = database.getReference();



        DatabaseReference ref = database.getReference();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Value value = dataSnapshot.getValue(Value.class);

                    txtTemperatureValue.setText(value.getTemperature() + DEGREE_SIGN);
                    txtHumidityValue.setText(PERCENTAGE_SIGN + value.getHumidity());
                    txtWifiInformation.setText("WiFi:" + value.getWifi());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /*
        btnStartFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setIsEngineWorking(!value.getIsEngineWorking());
                String text = value.getIsEngineWorking() ? "Fan Started" : "Fan Stopped";

                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("values");
                reference.removeValue();
                reference.push().setValue(value);
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}