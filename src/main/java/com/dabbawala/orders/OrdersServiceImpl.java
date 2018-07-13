package com.dabbawala.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrdersServiceImpl implements AbstractOrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    public Orders save(Orders order) {

        return ordersRepository.save(order);
    }

    public Orders getByOrderId(int orderId) {
        return null;
    }

    @Override
    public Collection<Orders> getAllOrdersByProviderId(int providerId) {
        return ordersRepository.getAllOrdersByProducerId(providerId);
    }


    public Collection<Orders> getAllOrdersByLocationForProvider(int providerId) {
//        ordersRepository.get
        return null;


    }
}
