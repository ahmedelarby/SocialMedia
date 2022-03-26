package com.test.socialmedia;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.test.socialmedia.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity  {
    ActivityMainBinding binding;
//  OnMapReadyCallback  private GoogleMap mMap;
//    String restaurants = " restaurant";
//    String Restaurants = " Restaurant";
//    FusedLocationProviderClient client;
//    SupportMapFragment mapFragment;
//    double lat;
//    double longitut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


//        client = LocationServices.getFusedLocationProviderClient(this);
//        if (ActivityCompat.checkSelfPermission(MainActivity.this,
//                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
//
//            getloction();
//
//        }else {
//            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},44);
//        }
//
//        mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);

    }

//    private void getloction() {
//
//
//        Task<Location> task = client.getLastLocation();
//    task.addOnSuccessListener(new OnSuccessListener<Location>() {
//        @Override
//        public void onSuccess(Location location) {
//            if (location!=null){
//            lat= location.getLatitude();
//            longitut=location.getLongitude();
//
//                mapFragment.getMapAsync(new OnMapReadyCallback() {
//                    @Override
//                    public void onMapReady(@NonNull GoogleMap googleMap) {
//                        mMap=googleMap;
//                        LatLng loction = new LatLng(lat, longitut);
//                        mMap.addMarker(new MarkerOptions()
//                                .position(loction));
//                   mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
//                       @Override
//                       public boolean onMarkerClick(@NonNull Marker marker) {
//                           Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                           return false;
//                       }
//                   });
//                    }
//                });
//
//            }
//
//        }
//    });
//
//}

//    @Override
//    public void onMapReady(@NonNull GoogleMap googleMap) {
//        mMap = googleMap;
//
//
//
//        LatLng loction1 = new LatLng(33.85148430277257, 35.895525763213946);
//        mMap.addMarker(new MarkerOptions()
//                .position(loction1)
//                .title("Grand Kadri Hotel By Cristal Lebanon"));
//       // mMap.moveCamera(CameraUpdateFactory.newLatLng(loction1));
//        LatLng loction2 = new LatLng(33.85217073479985, 35.89477838111461);
//        mMap.addMarker(new MarkerOptions()
//                .position(loction2)
//                .title("Germanos - Pastry"));
//        LatLng loction3 = new LatLng(33.85334017189446, 35.89438946093824);
//        mMap.addMarker(new MarkerOptions()
//                .position(loction3)
//                .title("Malak el Tawook"));
//        LatLng loction4 = new LatLng(33.85454300475094, 35.894561122304474);
//        mMap.addMarker(new MarkerOptions()
//                .position(loction4)
//                .title("Burger House"));
//        LatLng loction5 = new LatLng(33.85129821373707,  35.89446263654391);
//        mMap.addMarker(new MarkerOptions()
//                .position(loction5)
//                .title("Collège Oriental"));
//        LatLng loction6 = new LatLng(33.85048738635312,  35.89664059012788);
//        mMap.addMarker(new MarkerOptions()
//                .position(loction6)
//                .title("VERO MODA"));
//
//        //mMap.moveCamera(CameraUpdateFactory.newLatLng(loction2));
//
//
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == 44) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//
//                getloction();
//
//
//
//
//            }
//        }
//
//
//    }
}