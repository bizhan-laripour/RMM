package org.rmm.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class ThresholdProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany
    @JoinTable(name = "SITE_THRESHOLD" , joinColumns = @JoinColumn(name = "PROFILE_ID") , inverseJoinColumns = @JoinColumn(name = "SITE_ID"))
    private List<Site> sites;

    @ManyToMany
    @JoinTable(name = "CUSTOMER_THRESHOLD" , joinColumns = @JoinColumn(name = "PROFILE_ID") , inverseJoinColumns = @JoinColumn(name = "CUSTOMER_ID"))
    private List<Customer> customers;

    @ManyToMany
    @JoinTable(name = "AGENT_THRESHOLD" , joinColumns = @JoinColumn(name = "PROFILE_ID") , inverseJoinColumns = @JoinColumn(name = "DEVICE_ID"))
    private List<Device> devices;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
