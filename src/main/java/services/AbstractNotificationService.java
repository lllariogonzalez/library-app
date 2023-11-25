package services;

import interfaces.NotificationInterface;

public abstract class AbstractNotificationService implements NotificationInterface {

  protected abstract void showMessageDialog(String message, String title, int messageType);

}