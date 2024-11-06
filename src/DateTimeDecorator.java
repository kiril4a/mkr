import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDecorator implements MessageDecorator {
    private MessageDecorator message;

    public DateTimeDecorator(MessageDecorator message) {
        this.message = message;
    }

    @Override
    public String getText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = LocalDateTime.now().format(formatter);
        return message.getText() + " [" + dateTime + "]";
    }
}
