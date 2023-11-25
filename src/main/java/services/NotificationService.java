package services;

import javax.swing.JOptionPane;

public class NotificationService extends AbstractNotificationService  {

  @Override
  public void showErrorNotification(String message) {
    JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
  }

  @Override
  public void showSuccessNotification(String message) {
    JOptionPane.showMessageDialog(null, message, "Realizado", JOptionPane.INFORMATION_MESSAGE);
  }

  @Override
  public void showInformationNotification(String message) {
    JOptionPane.showMessageDialog(null, message, "Información", javax.swing.JOptionPane.ERROR_MESSAGE);
  }

  public void showMessageDialog(String message, String title, int messageType){
    JOptionPane.showMessageDialog(null, message, title, messageType);
  }

}