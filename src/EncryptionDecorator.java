public class EncryptionDecorator implements MessageDecorator {
    private MessageDecorator message;

    public EncryptionDecorator(MessageDecorator message) {
        this.message = message;
    }

    @Override
    public String getText() {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : message.getText().toCharArray()) {
            encryptedText.append((char)(c + 1));
        }
        return encryptedText.toString();
    }
}
