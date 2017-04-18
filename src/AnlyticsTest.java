import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by admin on 4/18/17.
 */
public class AnlyticsTest {
    Analytics analytics;

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        analytics = new AnalyticsImpl();

    }

    @Test
    public void testGetStringLength() throws Exception {
        try {
            analytics.addEvent(null);
            fail("addEvent with null argument should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        Event event = new Event();
        try {
            analytics.addEvent(event);
            fail("Name and action with null argument should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        event.setAction("can this change");
        event.setName("Hello");
        event.setLocalDateTime(LocalDateTime.now());
        boolean result = analytics.addEvent(event);

        Assert.assertTrue(result);
    }
}

