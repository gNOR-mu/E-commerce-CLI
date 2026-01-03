package service;

import repository.OrderRepository;

public class OrderService {
    OrderRepository orderRepository;
    CustomerService customerService;
    PaymentService paymentService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService, PaymentService paymentService) {
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.paymentService = paymentService;
    }
}
