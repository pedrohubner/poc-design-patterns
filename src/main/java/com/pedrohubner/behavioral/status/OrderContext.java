package com.pedrohubner.behavioral.status;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderContext {
    private OrderState orderState;

    public String sendOrderStatusNotification(Long orderId) {
        return orderState.notify(orderId);
    }
}
