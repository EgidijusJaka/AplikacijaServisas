package com.autoservice.autoservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="autoservice")
public class AutoService {
    @Id
    private Integer autoServiceId;
    private String autoServiceName;

    private String autoServiceAddress;

    private String autoServiceManager;

    private Integer autoServicePoint;

    public void setAutoServiceId(Integer autoServiceId) {
        this.autoServiceId = autoServiceId;
    }

    public void setAutoServiceName(String autoServiceName) {
        this.autoServiceName = autoServiceName;
    }

    public void setAutoServiceAddress(String autoServiceAddress) {
        this.autoServiceAddress = autoServiceAddress;
    }

    public void setAutoServiceManager(String autoServiceManager) {
        this.autoServiceManager = autoServiceManager;
    }

    public void setAutoServicePoint(Integer autoServicePoint) {
        this.autoServicePoint = autoServicePoint;
    }

    public Integer getAutoServiceId() {
        return autoServiceId;
    }

    public String getAutoServiceName() {
        return autoServiceName;
    }

    public String getAutoServiceAddress() {
        return autoServiceAddress;
    }

    public String getAutoServiceManager() {
        return autoServiceManager;
    }

    public Integer getAutoServicePoint() {
        return autoServicePoint;
    }




}
