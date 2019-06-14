package net.siekiera.hystrixrestserver;

import java.util.UUID;

public class HystrixResponse {
    private Integer errorCode;
    private String packageId;
    private String serverName;

    public HystrixResponse(String serverName) {
        this.errorCode = 0;
        this.packageId = UUID.randomUUID().toString();
        this.serverName = serverName;
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
}
