package org.example.model;

public class RemoteResource {

    private long maxAgeMilliSecond = 0L;
    private String downloadUrl = "";

    public RemoteResource(String downloadUrl, long maxAgeMilliSecond) {
        this.downloadUrl = downloadUrl;
        this.maxAgeMilliSecond = maxAgeMilliSecond;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public long getMaxAgeMilliSecond() {
        return maxAgeMilliSecond;
    }

}
