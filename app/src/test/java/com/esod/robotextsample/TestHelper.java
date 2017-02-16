package com.esod.robotextsample;

import android.view.View;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Jedidiah on 16/02/2017.
 */

public class TestHelper {

    public static void assertViewIsVisible(View view){
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }
}
