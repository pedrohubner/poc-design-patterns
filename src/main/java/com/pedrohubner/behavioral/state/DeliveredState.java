package com.pedrohubner.behavioral.state;

public class DeliveredState implements OrderState {
    @Override
    public String notify(Long orderId) {
        return "Pedido " + orderId + " saiu para entrega!";
    }
}
