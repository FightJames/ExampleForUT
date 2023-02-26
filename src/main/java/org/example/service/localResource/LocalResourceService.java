package org.example.service.localResource;

import org.example.model.LocalResource;

public interface LocalResourceService {
    public boolean saveLocalService(String id, LocalResource res);

    public LocalResource getLocalService(String id);
}
