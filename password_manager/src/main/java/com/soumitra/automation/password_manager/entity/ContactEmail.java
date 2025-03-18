package com.soumitra.automation.password_manager.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_emails")
public class ContactEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_pk")
    private long email_id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "is_primary")
    private boolean isPrimary;
    @Column(name = "deleted_row")
    private LocalDateTime deletedRow;
    @Column(name = "created_dt")
    private LocalDateTime createdDt;
    @Column(name = "updated_dt")
    private LocalDateTime updatedDt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")  // Foreign key to Users
    private Users user;

    public ContactEmail() {
    }

    public ContactEmail(String email, boolean isPrimary, LocalDateTime deletedRow, LocalDateTime createdDt,
            LocalDateTime updatedDt) {
        this.email = email;
        this.isPrimary = isPrimary;
        this.deletedRow = deletedRow;
        this.createdDt = createdDt;
        this.updatedDt = updatedDt;
    }

    public long getEmail_id() {
        return email_id;
    }

    public void setEmail_id(long email_id) {
        this.email_id = email_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public LocalDateTime getDeletedRow() {
        return deletedRow;
    }

    public void setDeletedRow(LocalDateTime deletedRow) {
        this.deletedRow = deletedRow;
    }

    public LocalDateTime getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(LocalDateTime createdDt) {
        this.createdDt = createdDt;
    }

    public LocalDateTime getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(LocalDateTime updatedDt) {
        this.updatedDt = updatedDt;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

}
