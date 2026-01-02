package model;

import enums.PaymentsMethod;

import java.time.LocalDateTime;

public class Payment {
    Long id;

    PaymentsMethod method;
    LocalDateTime payday;
    boolean paid;
}
