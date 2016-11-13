package com.google.firebase.Reach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Search for the map fragment to finish setup by calling init().
        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapfragment);
        com.here.android.mpa.common.MapSettings.setIsolatedDiskCacheRootPath(
                "/sdcard/foo/myservice"
                , "com.example.my.mapservice");
        mapFragment.init(new OnEngineInitListener() {
    }
}
