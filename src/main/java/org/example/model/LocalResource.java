package org.example.model;

public class LocalResource {
    private long expiredMilliSecond = 0L;
    private String cachePath = "";

    public LocalResource(String cachePath, long expiredMilliSecond) {
        this.cachePath = cachePath;
        this.expiredMilliSecond = expiredMilliSecond;
    }

    public String getCachePath() {
        return cachePath;
    }

    public long getExpiredMilliSecond() {
        return expiredMilliSecond;
    }
}
