
package com.death.dummyrecycler.model;

import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("api_version")
    private Long ApiVersion;
    @SerializedName("execution_time")
    private String ExecutionTime;
    @SerializedName("server_time")
    private Long ServerTime;
    @SerializedName("server_timezone")
    private String ServerTimezone;

    public Long getApiVersion() {
        return ApiVersion;
    }

    public void setApiVersion(Long apiVersion) {
        ApiVersion = apiVersion;
    }

    public String getExecutionTime() {
        return ExecutionTime;
    }

    public void setExecutionTime(String executionTime) {
        ExecutionTime = executionTime;
    }

    public Long getServerTime() {
        return ServerTime;
    }

    public void setServerTime(Long serverTime) {
        ServerTime = serverTime;
    }

    public String getServerTimezone() {
        return ServerTimezone;
    }

    public void setServerTimezone(String serverTimezone) {
        ServerTimezone = serverTimezone;
    }

}
