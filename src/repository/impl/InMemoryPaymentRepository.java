package repository.impl;

import model.Payment;
import model.Product;
import repository.PaymentRepository;
import repository.ProductRepository;

public class InMemoryPaymentRepository extends InMemoryAbstractRepository<Payment, Long> implements PaymentRepository {
}
