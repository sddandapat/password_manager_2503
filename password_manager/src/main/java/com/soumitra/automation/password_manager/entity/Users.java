package com.soumitra.automation.password_manager.entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_pk")
    private Long userId;
    @Column(name = "user_name",nullable = false,unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "deleted_row")
    private LocalDateTime deletedRow;
    @Column(name = "created_dt")
    private LocalDateTime createdDt;
    @Column(name = "updated_dt")
    private LocalDateTime updatedDt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch  = FetchType.LAZY)
    private Set<ContactEmail> contactEmails;

    public Users() {
    }

    public Users(String username, String password, LocalDateTime deletedRow, LocalDateTime createdDt,
            LocalDateTime updatedDt) {
        this.username = username;
        this.password = password;
        this.deletedRow = deletedRow;
        this.createdDt = createdDt;
        this.updatedDt = updatedDt;
    }

    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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


    public Set<ContactEmail> getContactEmails() {
        return contactEmails;
    }

    public void setContactEmails(Set<ContactEmail> contactEmails) {
        this.contactEmails = contactEmails;
    }


}
