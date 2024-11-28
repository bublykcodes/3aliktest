package com.example.demo;

// Сервіс для роботи із хмарним сховищем
public class CloudStorageService {
    public void uploadData(String identifier, String content) {
        // Логіка завантаження даних у хмару
        System.out.println("Uploading data to cloud with key: " + identifier);
    }

    public String downloadData(String identifier) {
        // Логіка завантаження даних із хмари
        System.out.println("Downloading data from cloud with key: " + identifier);
        return "Mocked data for key: " + identifier;
    }
}
