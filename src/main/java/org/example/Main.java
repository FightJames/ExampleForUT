package org.example;

import org.example.repo.BinaryResourceRepository;
import org.example.repo.ResourceRepository;
import org.example.repo.ZIPResourceRepository;
import org.example.service.localResource.SQLiteLocalResourceService;
import org.example.service.remoteResource.UrlConnectionRemoteResourceService;

public class Main {
    public static void main(String[] args) {
        /*
        because SQLiteLocalResourceService depends on SQLite, so if we want to test it, needing to mock SQLite db data.
         */
        SQLiteLocalResourceService localService = new SQLiteLocalResourceService();
        UrlConnectionRemoteResourceService remoteService = new UrlConnectionRemoteResourceService();
        /*
        because ResourceRepository depends on Services, so if we want to test it, needing to mock Services.
         */
        ResourceRepository repo = new ZIPResourceRepository(localService, remoteService);
        repo.getResourceDir("xxx");

        ResourceRepository repo1 = new BinaryResourceRepository(localService, remoteService);
        repo1.getResourceDir("xxx");
    }
}