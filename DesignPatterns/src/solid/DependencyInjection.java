/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

/**
 *
 * @author fawad
 */
interface NotificationService {
    void sendNotification(String message);
}

class EmailService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Send email logic
    }
}

class UserController {
    private NotificationService notificationService;

    public UserController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.sendNotification("Welcome!");
    }
}

