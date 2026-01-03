package repository.impl;

import model.OrderItem;
import repository.OrderItemRepository;

public class InMemoryOrderItemRepository extends InMemoryAbstractRepository<OrderItem, Long> implements OrderItemRepository {
}
