
package com.death.dummyrecycler.model;

import com.google.gson.annotations.SerializedName;

public class Torrent {

    @SerializedName("date_uploaded")
    private String DateUploaded;
    @SerializedName("date_uploaded_unix")
    private Long DateUploadedUnix;
    @SerializedName("hash")
    private String Hash;
    @SerializedName("peers")
    private Long Peers;
    @SerializedName("quality")
    private String Quality;
    @SerializedName("seeds")
    private Long Seeds;
    @SerializedName("size")
    private String Size;
    @SerializedName("size_bytes")
    private Long SizeBytes;
    @SerializedName("url")
    private String Url;

    public String getDateUploaded() {
        return DateUploaded;
    }

    public void setDateUploaded(String dateUploaded) {
        DateUploaded = dateUploaded;
    }

    public Long getDateUploadedUnix() {
        return DateUploadedUnix;
    }

    public void setDateUploadedUnix(Long dateUploadedUnix) {
        DateUploadedUnix = dateUploadedUnix;
    }

    public String getHash() {
        return Hash;
    }

    public void setHash(String hash) {
        Hash = hash;
    }

    public Long getPeers() {
        return Peers;
    }

    public void setPeers(Long peers) {
        Peers = peers;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public Long getSeeds() {
        return Seeds;
    }

    public void setSeeds(Long seeds) {
        Seeds = seeds;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public Long getSizeBytes() {
        return SizeBytes;
    }

    public void setSizeBytes(Long sizeBytes) {
        SizeBytes = sizeBytes;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

}
