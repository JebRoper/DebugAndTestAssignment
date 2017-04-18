import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 4/18/17.
 */
public class AnalyticsImpl implements Analytics {
    private static final Logger LOGGER = Logger.getLogger("com.example");

    Random random = new Random();
    Event event;

    @Override
    public boolean addEvent(Event event) throws IllegalArgumentException, InterruptedException {

        System.out.println("The method starts");
        Instant firstInstant = Instant.now();

        if (event == null) {
            throw new IllegalArgumentException("Parameter cannot be null");

        }
        if (event.getAction() == null || event.getName() == null || event.getLocalDateTime() == null) {
            throw new IllegalArgumentException("One of these must be set");
        }
        System.out.println(event);

        Thread.sleep(random.nextInt(3000));
        System.out.println("The method ends");
        Instant secondInstant = Instant.now();
        System.out.println(Duration.between(firstInstant, secondInstant));
        Object times = (Duration.between(firstInstant, secondInstant));

        LOGGER.info("It ran" + String.valueOf(times));
        int value = random.nextInt(10);
        if (value == 2) {
            return false;
        }

        return true;
    }

}




