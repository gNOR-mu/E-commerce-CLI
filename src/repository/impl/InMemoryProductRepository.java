package repository.impl;

import model.Product;
import repository.ProductRepository;

public class InMemoryProductRepository extends InMemoryAbstractRepository<Product, Long> implements ProductRepository {
}
