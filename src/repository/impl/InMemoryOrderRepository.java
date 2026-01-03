package repository.impl;

import model.Order;
import model.Product;
import repository.OrderRepository;
import repository.ProductRepository;

public class InMemoryOrderRepository extends InMemoryAbstractRepository<Order, Long> implements OrderRepository {
}
