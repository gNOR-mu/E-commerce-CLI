package model;

import java.time.LocalDateTime;

public class Order {
    Long id;
    Long customerId;
    Long paymentId;

    LocalDateTime creationDate;
    double total;
}
