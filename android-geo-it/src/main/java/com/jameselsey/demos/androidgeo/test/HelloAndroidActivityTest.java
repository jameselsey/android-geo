package com.jameselsey.demos.androidgeo.test;

import android.test.ActivityInstrumentationTestCase2;
import com.jameselsey.demos.androidgeo.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

