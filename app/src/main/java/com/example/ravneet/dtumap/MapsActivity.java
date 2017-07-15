package com.example.ravneet.dtumap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng SPS9_10_11_12 = new LatLng(28.748798, 77.120030);
        mMap.addMarker(new MarkerOptions().position(SPS9_10_11_12).title("SPS 9-12"));

        LatLng SPS1_2_3_4 = new LatLng(28.751450, 77.118808);
        mMap.addMarker(new MarkerOptions().position(SPS1_2_3_4).title("SPS 1-4"));

        LatLng SPS5_8 = new LatLng(28.751209, 77.119144);
        mMap.addMarker(new MarkerOptions().position(SPS5_8).title("SPS 5-8"));

        LatLng SPS13 = new LatLng(28.750642, 77.115991);
        mMap.addMarker(new MarkerOptions().position(SPS13).title("SPS 13"));

        LatLng SPS14 = new LatLng(28.750596, 77.115426);
        mMap.addMarker(new MarkerOptions().position(SPS14).title("SPS 14"));

        LatLng Wind_Tunnel = new LatLng(28.752810, 77.118023);
        mMap.addMarker(new MarkerOptions().position(Wind_Tunnel).title("Wind-Tunnel"));

        LatLng Sports_Complex_gym = new LatLng(28.753503, 77.115100);
        mMap.addMarker(new MarkerOptions().position(Sports_Complex_gym).title("Sports Complex GYM"));

        LatLng Mech = new LatLng(28.749963, 77.118720);
        mMap.addMarker(new MarkerOptions().position(Mech).title("Mechanical/Production Department"));

        LatLng Physica_lab = new LatLng(28.750925, 77.117574);
        mMap.addMarker(new MarkerOptions().position(Physica_lab).title("Physics Lab"));

        LatLng Chem_lab = new LatLng(28.751373, 77.118015);
        mMap.addMarker(new MarkerOptions().position(Chem_lab).title("Chemistry Lab"));

        LatLng basket = new LatLng(28.752512, 77.116158);
        mMap.addMarker(new MarkerOptions().position(basket).title("Basket Ball Court"));

        LatLng civil_dep = new LatLng(28.749035, 77.117924);
        mMap.addMarker(new MarkerOptions().position(civil_dep).title("Civil Department"));

        LatLng admin = new LatLng(28.749676, 77.116194);
        mMap.addMarker(new MarkerOptions().position(admin).title("Admin Block"));

        LatLng comp = new LatLng(28.748960, 77.117529);
        mMap.addMarker(new MarkerOptions().position(comp).title("ECE/CS/IT/SE Department"));

        LatLng elec = new LatLng(28.749011, 77.117090);
        mMap.addMarker(new MarkerOptions().position(elec).title("Electrical Department"));

        LatLng trans = new LatLng(28.747913, 77.119912);
        mMap.addMarker(new MarkerOptions().position(trans).title("Transit Hostel"));

        LatLng GH = new LatLng(28.747173, 77.118818);
        mMap.addMarker(new MarkerOptions().position(GH).title("Girls Hostel Type I&II"));

        LatLng abh = new LatLng(28.745848, 77.117588);
        mMap.addMarker(new MarkerOptions().position(abh).title("Aryabhatta Ground"));

        LatLng football = new LatLng(28.752757, 77.117207);
        mMap.addMarker(new MarkerOptions().position(football).title("Football Ground"));

        LatLng gate = new LatLng(28.745626, 77.117056);
        mMap.addMarker(new MarkerOptions().position(gate).title("DTU Gate"));


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            mMap.setMyLocationEnabled(true);
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gate));
    }
}
