package org.example.repo;

import org.example.model.LocalResource;
import org.example.service.localResource.LocalResourceService;
import org.example.service.remoteResource.RemoteResourceService;

public class BinaryResourceRepository extends ResourceRepository {

    public BinaryResourceRepository(LocalResourceService localSer, RemoteResourceService remoteSer) {
        super(localSer, remoteSer);
    }

    @Override
    public String getResourceDir(String id) {
        LocalResource localResource = super.getLocalResource(id);
        return localResource.getCachePath();
    }
}
