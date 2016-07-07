package pl.vlad.fbird;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Vlad on 03.07.2016.
 */
public class ActivityTest {
    @Rule
    public Timeout time = new Timeout(1000);

    @Test
    public void run() throws Exception {
        Activity activity = new Activity();
        assertNotNull(activity);

    }

}