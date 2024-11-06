public class Main {
    public static void main(String[] args) {
        // Початкове повідомлення
        Message baseMessage = new Message("Привіт, це тестове повідомлення!");

        // Обгортання повідомлення декораторами
        MessageDecorator encryptedMessage = new EncryptionDecorator(() -> baseMessage.getText());
        System.out.println("Шифрування: " + encryptedMessage.getText());

        MessageDecorator compressedMessage = new CompressionDecorator(encryptedMessage);
        System.out.println("Стиснення: " + compressedMessage.getText());

        MessageDecorator dateTimeMessage = new DateTimeDecorator(compressedMessage);
        System.out.println("Додана дата і час: " + dateTimeMessage.getText());

        MessageDecorator authorMessage = new AuthorDecorator(dateTimeMessage);
        System.out.println("Доданий автор: " + authorMessage.getText());
    }
}
