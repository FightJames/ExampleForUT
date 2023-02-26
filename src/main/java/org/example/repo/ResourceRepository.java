package org.example.repo;

import org.example.model.LocalResource;
import org.example.model.RemoteResource;
import org.example.service.localResource.LocalResourceService;
import org.example.service.remoteResource.RemoteResourceService;

public abstract class ResourceRepository {
    // Depends on interface, so we can change any type of service we want, if the service apply the interface.
    private LocalResourceService localSer;
    private RemoteResourceService remoteSer;
    ResourceRepository(LocalResourceService localSer, RemoteResourceService remoteSer) {
        this.localSer = localSer;
        this.remoteSer = remoteSer;
    }

    //In subclasses, we can reuse this to get localResource
    protected LocalResource getLocalResource(String id) {
        LocalResource localResource = localSer.getLocalService(id);
        if (localResource == null || System.currentTimeMillis() > localResource.getExpiredMilliSecond()) {
             RemoteResource remoteResource = remoteSer.fetchRemoteResource(id);
             String downloadPath = "";
             try {
                 remoteSer.downloadResource(remoteResource.getDownloadUrl(), downloadPath);
             } catch (Throwable e) {
                 //download error
             }
             localResource = new LocalResource(downloadPath, System.currentTimeMillis() + remoteResource.getMaxAgeMilliSecond());
             localSer.saveLocalService(id, localResource);
        }
        return localResource;
    }

    public abstract String getResourceDir(String id);
}
