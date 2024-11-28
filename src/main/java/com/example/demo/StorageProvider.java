package com.example.demo;


public interface StorageProvider {
    void save(String key, String data);
    String load(String key);
}
