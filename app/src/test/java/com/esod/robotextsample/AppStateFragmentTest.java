package com.esod.robotextsample;

import android.os.Build;

import com.esod.robotextsample.fragment.AppStateFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Jedidiah on 15/02/2017.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class AppStateFragmentTest {

    private AppStateFragment fragment;

    @Before
    public void setUp() throws Exception {
        fragment = AppStateFragment.newInstance();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }
}
