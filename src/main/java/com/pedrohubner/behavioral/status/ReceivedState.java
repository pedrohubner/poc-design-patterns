package com.pedrohubner.behavioral.status;

public class ReceivedState implements OrderState {
    @Override
    public String notify(Long orderId) {
        return "Pedido " + orderId + " entregue com sucesso";
    }
}
