package org.rmm.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AlertSeverity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    private Boolean sms;

    private Boolean email;

    private Boolean ticket;

    private Date delayToCreateTicket;

    @OneToOne
    @JoinColumn(name = "criteria_id")
    private Criteria criteria;

    private String emailText;

    private String smsText;

    private String ticketText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getSms() {
        return sms;
    }

    public void setSms(Boolean sms) {
        this.sms = sms;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Boolean getTicket() {
        return ticket;
    }

    public void setTicket(Boolean ticket) {
        this.ticket = ticket;
    }

    public Date getDelayToCreateTicket() {
        return delayToCreateTicket;
    }

    public void setDelayToCreateTicket(Date delayToCreateTicket) {
        this.delayToCreateTicket = delayToCreateTicket;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getTicketText() {
        return ticketText;
    }

    public void setTicketText(String ticketText) {
        this.ticketText = ticketText;
    }
}
