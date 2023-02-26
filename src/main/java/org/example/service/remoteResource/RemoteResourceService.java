package org.example.service.remoteResource;

import org.example.model.RemoteResource;

public interface RemoteResourceService {

    public RemoteResource fetchRemoteResource(String id);

    public void downloadResource(String url, String downloadPath) throws Exception;

}
