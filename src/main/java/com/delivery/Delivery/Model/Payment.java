package com.delivery.Delivery.Model;

import com.delivery.Delivery.enumeration.Notification_Status;
import com.delivery.Delivery.enumeration.Payment_method;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "db_payment")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends BaseEntity {
    private double amount;
    @Enumerated(EnumType.STRING)
    private Payment_method payment_method;
    @Enumerated(EnumType.STRING)
    private Notification_Status notification_status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date payment_date;
    private String Description;
    private Long oederid;
}
