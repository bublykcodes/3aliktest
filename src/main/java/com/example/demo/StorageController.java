package com.example.demo;

import org.springframework.web.bind.annotation.*;

// Контролер для роботи з HTTP-запитами
@RestController
@RequestMapping("/api/storage")
public class StorageController {

    private final StorageProvider storageProvider;

    public StorageController() {
        // Ручне створення екземпляра CloudStorageProvider
        this.storageProvider = new CloudStorageServiceAdapter();
    }

    @PostMapping("/save")
    public String save(@RequestParam String key, @RequestParam String data) {
        storageProvider.save(key, data);
        return "Data saved successfully!";
    }

    @GetMapping("/load")
    public String load(@RequestParam String key) {
        return storageProvider.load(key);
    }
}
