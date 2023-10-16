package org.rmm.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Threshold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean isActive;

    @ManyToMany
    @JoinTable(name = "THRESHOLD_PAUSED_CONDITION" , joinColumns = @JoinColumn(name = "THRESHOLD_ID") , inverseJoinColumns = @JoinColumn(name = "DEVICE_ID"))
    private List<Device> devices;

    @OneToOne
    @JoinColumn(name = "ALERT_SEVERITY_ID")
    private AlertSeverity alertSeverity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public AlertSeverity getAlertSeverity() {
        return alertSeverity;
    }

    public void setAlertSeverity(AlertSeverity alertSeverity) {
        this.alertSeverity = alertSeverity;
    }
}
