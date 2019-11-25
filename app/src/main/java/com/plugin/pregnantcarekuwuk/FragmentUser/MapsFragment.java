package com.plugin.pregnantcarekuwuk.FragmentUser;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.plugin.pregnantcarekuwuk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapsFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private View mapView;
    SupportMapFragment mapFragment;
    private PlacesClient placesClient;
    private FusedLocationProviderClient mFusedLocationProviderClient;


    public MapsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_maps, container, false);
        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(getActivity());
        Places.initialize(getActivity(), getString(R.string.google_maps_key));
        placesClient = Places.createClient(getActivity());
        mapView = mapFragment.getView();
        return v;
    }

    private void setMapStyle() {

        boolean result = mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(getActivity(), R.raw.maps_style));
        if (result){
            Log.e("MAP", "error set Map Style");
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoomLevel = 16.0f; //This goes up to 21
        LatLng tegal = new LatLng(-6.8694, 109.1402);
        mMap.addMarker(new MarkerOptions().position(tegal).title("Darurat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tegal));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tegal, zoomLevel));
        setMapStyle();
    }
}
