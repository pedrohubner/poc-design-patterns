package com.pedrohubner.behavioral.status;

import lombok.extern.java.Log;

@Log
public class StatusApp {
    public static void main(String[] args) {
        getOrderStatus();
    }

    private static void getOrderStatus() {
        var order = new OrderContext(new OrderedState());
        log.info(order.sendOrderStatusNotification(1L));
    }
}
