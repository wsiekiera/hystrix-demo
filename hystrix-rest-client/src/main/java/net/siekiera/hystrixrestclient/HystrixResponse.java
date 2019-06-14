package net.siekiera.hystrixrestclient;

import java.util.UUID;

public class HystrixResponse {
    private Integer errorCode;
    private String packageId;
    private String serverName;

    public HystrixResponse() {
        this.errorCode = 0;
        this.packageId = UUID.randomUUID().toString();
        this.serverName = "None";
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public String toString() {
        return "HystrixResponse{" +
                "errorCode=" + errorCode +
                ", packageId='" + packageId + '\'' +
                ", serverName='" + serverName + '\'' +
                '}';
    }
}
