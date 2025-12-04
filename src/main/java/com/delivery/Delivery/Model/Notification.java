package com.delivery.Delivery.Model;

import com.delivery.Delivery.enumeration.NotificationTyope;
import com.delivery.Delivery.enumeration.Notification_Channnel;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "db_notification")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Notification extends BaseEntity{
    private String title;
    private String content;
    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private NotificationTyope notificationTyope;
    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private Notification_Channnel notificationChannnel;
    private boolean read;
    private Long deliveryId;
    private Long userId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;
}
