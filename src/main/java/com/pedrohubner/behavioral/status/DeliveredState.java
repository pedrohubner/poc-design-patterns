package com.pedrohubner.behavioral.status;

public class DeliveredState implements OrderState {
    @Override
    public String notify(Long orderId) {
        return "Pedido " + orderId + " saiu para entrega!";
    }
}
