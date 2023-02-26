package org.example.service.localResource;

import org.example.model.LocalResource;

public class MongodbLocalResourceService implements LocalResourceService {

    @Override
    public boolean saveLocalService(String id, LocalResource res) {
        // save LocalResource to Mongodb
        return true;
    }

    @Override
    public LocalResource getLocalService(String id) {
        // get LocalResource from Mongodb
        return new LocalResource("", 0L);
    }

}
