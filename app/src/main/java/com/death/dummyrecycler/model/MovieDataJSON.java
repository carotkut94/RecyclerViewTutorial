
package com.death.dummyrecycler.model;


import com.google.gson.annotations.SerializedName;

public class MovieDataJSON {

    @SerializedName("data")
    private com.death.dummyrecycler.model.Data Data;
    @SerializedName("@meta")
    private com.death.dummyrecycler.model.Meta Meta;
    @SerializedName("status")
    private String Status;
    @SerializedName("status_message")
    private String StatusMessage;

    public com.death.dummyrecycler.model.Data getData() {
        return Data;
    }

    public void setData(com.death.dummyrecycler.model.Data data) {
        Data = data;
    }

    public com.death.dummyrecycler.model.Meta getMeta() {
        return Meta;
    }

    public void setMeta(com.death.dummyrecycler.model.Meta meta) {
        Meta = meta;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStatusMessage() {
        return StatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        StatusMessage = statusMessage;
    }

}
