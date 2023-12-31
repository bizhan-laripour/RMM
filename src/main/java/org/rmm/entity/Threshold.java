package org.rmm.entity;

import jakarta.persistence.*;
import org.rmm.enums.Category;
import org.rmm.enums.ServiceName;
import org.rmm.enums.SourceFolder;
import org.rmm.enums.WindowsEventSeverity;


import java.util.List;

@Entity
public class Threshold extends BaseEntity{


    private Boolean isActive;


    @Enumerated(value = EnumType.STRING)
    private Category category;

    private Integer percentage;

    private Double timePeriod;

    private Integer mbs;

    private Integer temperature;

    private String excludedDrives;

    private boolean applyFor;

    private Double systemDrive;

    private Integer roundPerMinute;

    private String eventToExclude;

    @Enumerated(EnumType.STRING)
    private SourceFolder sourceFolder;

    private String customFolder;

    @Enumerated(EnumType.STRING)
    private WindowsEventSeverity windowsEventSeverity;

    private String sourceNameOrEventIds;

    private Integer gbs;

    @Enumerated(EnumType.STRING)
    private ServiceName serviceName;

    private boolean alertIfServiceDoesntExist;

    private String processName;

    private Integer failAttempt;

    private Integer days;

    private Integer items;

    /**
     * this property must be cleared
     * @return
     */
//    private Product product;
//

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Double getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Double timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Integer getMbs() {
        return mbs;
    }

    public void setMbs(Integer mbs) {
        this.mbs = mbs;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getExcludedDrives() {
        return excludedDrives;
    }

    public void setExcludedDrives(String excludedDrives) {
        this.excludedDrives = excludedDrives;
    }

    public boolean isApplyFor() {
        return applyFor;
    }

    public void setApplyFor(boolean applyFor) {
        this.applyFor = applyFor;
    }

    public Double getSystemDrive() {
        return systemDrive;
    }

    public void setSystemDrive(Double systemDrive) {
        this.systemDrive = systemDrive;
    }

    public Integer getRoundPerMinute() {
        return roundPerMinute;
    }

    public void setRoundPerMinute(Integer roundPerMinute) {
        this.roundPerMinute = roundPerMinute;
    }

    public String getEventToExclude() {
        return eventToExclude;
    }

    public void setEventToExclude(String eventToExclude) {
        this.eventToExclude = eventToExclude;
    }

    public SourceFolder getSourceFolder() {
        return sourceFolder;
    }

    public void setSourceFolder(SourceFolder sourceFolder) {
        this.sourceFolder = sourceFolder;
    }

    public String getCustomFolder() {
        return customFolder;
    }

    public void setCustomFolder(String customFolder) {
        this.customFolder = customFolder;
    }

    public WindowsEventSeverity getWindowsEventSeverity() {
        return windowsEventSeverity;
    }

    public void setWindowsEventSeverity(WindowsEventSeverity windowsEventSeverity) {
        this.windowsEventSeverity = windowsEventSeverity;
    }

    public String getSourceNameOrEventIds() {
        return sourceNameOrEventIds;
    }

    public void setSourceNameOrEventIds(String sourceNameOrEventIds) {
        this.sourceNameOrEventIds = sourceNameOrEventIds;
    }

    public Integer getGbs() {
        return gbs;
    }

    public void setGbs(Integer gbs) {
        this.gbs = gbs;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }

    public void setServiceName(ServiceName serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isAlertIfServiceDoesntExist() {
        return alertIfServiceDoesntExist;
    }

    public void setAlertIfServiceDoesntExist(boolean alertIfServiceDoesntExist) {
        this.alertIfServiceDoesntExist = alertIfServiceDoesntExist;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public Integer getFailAttempt() {
        return failAttempt;
    }

    public void setFailAttempt(Integer failAttempt) {
        this.failAttempt = failAttempt;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

}
