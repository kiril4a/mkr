public class CompressionDecorator implements MessageDecorator {
    private MessageDecorator message;

    public CompressionDecorator(MessageDecorator message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText().replaceAll("\\s+", " ");
    }
}
