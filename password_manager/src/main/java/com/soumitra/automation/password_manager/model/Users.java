package com.soumitra.automation.password_manager.model;

import java.time.LocalDateTime;

public class Users {

    private Long userId;
    private String username;
    private String password;
    private LocalDateTime deletedRow;
    private LocalDateTime createdDt;
    private LocalDateTime updatedDt;

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

}
