package service;

import repository.InventoryRepository;

public class InventoryService {
    InventoryRepository inventoryRepository;
    ProductService productService;

    public InventoryService(InventoryRepository inventoryRepository, ProductService productService) {
        this.inventoryRepository = inventoryRepository;
        this.productService = productService;
    }
}
