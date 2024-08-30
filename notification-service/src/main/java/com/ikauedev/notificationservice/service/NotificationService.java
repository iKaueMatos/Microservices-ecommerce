package com.ikauedev.notificationservice.service;

import com.ikauedev.notificationservice.entity.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Optional<Notification> getNotificationById(String id);
    Notification saveNotification(Notification notification);
    void deleteNotificationById(String id);
}
