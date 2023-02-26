package org.example.service.localResource;

import org.example.model.LocalResource;

public class SQLiteLocalResourceService implements LocalResourceService {
    @Override
    public boolean saveLocalService(String id, LocalResource res) {
        // save LocalResource to SQLite db
        return true;
    }

    @Override
    public LocalResource getLocalService(String id) {
        // get LocalResource from SQLite db
        return new LocalResource("", 0L);
    }
}
