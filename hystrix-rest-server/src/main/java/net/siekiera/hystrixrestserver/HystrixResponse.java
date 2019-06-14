package net.siekiera.hystrixrestserver;

import java.util.UUID;

public class HystrixResponse {
    private Integer errorCode;
    private String packageid;

    public HystrixResponse() {
        this.errorCode = 0;
        this.packageid = UUID.randomUUID().toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid;
    }
}
