package com.delivery.Delivery.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "db_ notification")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Device extends BaseEntity {
    private String device_id;
    private String device_type;
    private String device_model;
    private String os_version;
    private String app_version;
    private String last_login;
    private boolean trusted;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private User user;

}
