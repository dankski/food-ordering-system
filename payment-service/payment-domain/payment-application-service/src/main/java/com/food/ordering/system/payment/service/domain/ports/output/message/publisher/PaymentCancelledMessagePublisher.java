package com.food.ordering.system.payment.service.domain.ports.output.message.publisher;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.event.PaymentCanceledEvent;

public interface PaymentCancelledMessagePublisher extends DomainEventPublisher<PaymentCanceledEvent> {
}
