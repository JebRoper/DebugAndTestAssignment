import java.time.LocalDateTime;

/**
 * Created by admin on 4/18/17.
 */
public class Event {

    private String name;
    private String action;
    private LocalDateTime localDateTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }



    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
