package com.blogspot.salvadorhm.componentestic51;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //ciudad de mexico
        LatLng mexico = new LatLng(19.4326009, -99.1333416);
        mMap.addMarker(new MarkerOptions().position(mexico).title("Ciudad de Mexico").icon(BitmapDescriptorFactory.fromResource(R.drawable.mexico    )));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mexico));

        //valle del bravo
        LatLng valle = new LatLng(32.6437953, -115.4492121);
        mMap.addMarker(new MarkerOptions().position(valle).title("Valle de Bravo").icon(BitmapDescriptorFactory.fromResource(R.drawable.valle  )));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(valle));

        //zacatecas
        LatLng zacatecas = new LatLng( 23.0000001, -103.0000001);
        mMap.addMarker(new MarkerOptions().position(zacatecas).title("Zacatecas").icon(BitmapDescriptorFactory.fromResource(R.drawable.zacatecas  )));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zacatecas));
        //Hermosillo
        LatLng hermosillo = new LatLng( 29.0948207,  -110.9692202);
        mMap.addMarker(new MarkerOptions().position(hermosillo).title("Hermosillo").icon(BitmapDescriptorFactory.fromResource(R.drawable.hermosillo  )));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hermosillo));




    }
}
