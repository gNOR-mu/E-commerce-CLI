package repository.impl;

import model.Order;
import repository.OrderRepository;

public class InMemoryOrderItemRepository extends InMemoryAbstractRepository<Order, Long> implements OrderRepository {
}
