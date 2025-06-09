package net.mobctrl.views;

import android.app.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class SuperSwipeRefreshLayoutTest {

    @Test
    public void defaultTargetScrollWithLayout_isTrue() {
        Application app = RuntimeEnvironment.getApplication();
        SuperSwipeRefreshLayout layout = new SuperSwipeRefreshLayout(app);
        assertTrue(layout.isTargetScrollWithLayout());
    }

    @Test
    public void setTargetScrollWithLayout_changesValue() {
        Application app = RuntimeEnvironment.getApplication();
        SuperSwipeRefreshLayout layout = new SuperSwipeRefreshLayout(app);
        layout.setTargetScrollWithLayout(false);
        assertFalse(layout.isTargetScrollWithLayout());
    }
}
