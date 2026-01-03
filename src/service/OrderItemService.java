package service;

import repository.OrderItemRepository;

public class OrderItemService {
    OrderItemRepository orderItemRepository;
    OrderService orderService;
    ProductService productService;

    public OrderItemService(OrderItemRepository orderItemRepository, OrderService orderService, ProductService productService) {
        this.orderItemRepository = orderItemRepository;
        this.orderService = orderService;
        this.productService = productService;
    }
}
