package com.example.demo;


public class CloudStorageServiceAdapter implements StorageProvider {
    private final CloudStorageService cloudStorageService;

    public CloudStorageServiceAdapter() {
        this.cloudStorageService = new CloudStorageService();
    }

    @Override
    public void save(String key, String data) {
        cloudStorageService.uploadData(key, data);
    }

    @Override
    public String load(String key) {
        return cloudStorageService.downloadData(key);
    }
}
