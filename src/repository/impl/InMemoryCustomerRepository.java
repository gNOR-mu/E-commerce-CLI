package repository.impl;

import model.Customer;
import repository.CustomerRepository;

public class InMemoryCustomerRepository extends InMemoryAbstractRepository<Customer, Long> implements CustomerRepository {
}
