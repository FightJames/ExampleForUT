package org.example.service.remoteResource;

import org.example.model.RemoteResource;

public class UrlConnectionRemoteResourceService implements RemoteResourceService{
    @Override
    public RemoteResource fetchRemoteResource(String id) {
        return new RemoteResource("", 100L);
    }

    @Override
    public void downloadResource(String url, String downloadPath) {
        // throw exception if download error
    }
}
