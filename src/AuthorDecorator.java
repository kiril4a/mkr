public class AuthorDecorator implements MessageDecorator {
    private MessageDecorator message;

    public AuthorDecorator(MessageDecorator message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText() + " (Автор: Кирило Матюшенко)";
    }
}
