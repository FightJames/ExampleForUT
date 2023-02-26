package org.example.repo;

import org.example.model.LocalResource;
import org.example.service.localResource.LocalResourceService;
import org.example.service.remoteResource.RemoteResourceService;

import java.io.File;

public class ZIPResourceRepository extends ResourceRepository {

    public ZIPResourceRepository(LocalResourceService localSer, RemoteResourceService remoteSer) {
        super(localSer, remoteSer);
    }

    @Override
    public String getResourceDir(String id) {
        LocalResource localResource = super.getLocalResource(id);
        File file = new File(localResource.getCachePath());
        if (isUnzipped(file.getAbsolutePath())) return file.getParent();
        /*
        unzip the file;
        * */
        return file.getParent();

    }

    private boolean isUnzipped(String path) {
        return false;
    }
}
