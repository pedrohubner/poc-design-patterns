package com.pedrohubner.behavioral.status;

public class OrderedState implements OrderState {
    @Override
    public String notify(Long orderId) {
        return "Pedido " + orderId + " foi confirmado!";
    }
}
