package service.impl;
import service.NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.printf("[EMAIL] На адрес <%s> отправлено письмо: %s%n", recipient, message);
    }
}