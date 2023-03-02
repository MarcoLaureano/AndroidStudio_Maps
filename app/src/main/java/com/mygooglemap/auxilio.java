package com.mygooglemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class auxilio extends AppCompatActivity {
    Button toastTheLocation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auxilio);

        toastTheLocation = findViewById(R.id.toastAuxilio);
        toastTheLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                try {
                    Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                    if (location != null) {
                        double latitud = location.getLatitude();
                        double longitud = location.getLongitude();
                        Toast.makeText(getApplicationContext(), "Latitud: " + latitud + ", Longitud: " + longitud, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "No se pudo obtener la ubicación actual", Toast.LENGTH_LONG).show();
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Porfavor otorga permisos de ubicacion esta MyGoogleMap", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}