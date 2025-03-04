package duke;
public class Event extends Task{
    public String time;
    public Event(String description, String time) {
        super(description);
        this.time = time;
    }
    @Override
    public String toString(){
        return String.format("[E]%s (at: %s)", super.toString(), time);
    }
}
