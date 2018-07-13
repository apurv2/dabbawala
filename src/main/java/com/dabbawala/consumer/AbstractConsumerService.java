package com.dabbawala.consumer;

import org.springframework.stereotype.Service;

public interface AbstractConsumerService{

    public Consumer save(Consumer consumer);

    public Consumer getCustomerById(int consumerId);

//    public Collection<Consumer> getAllCustomers();

//    public Collection<Consumer> getAllConsumerOrders(int consumerId);
//
//    public Collection<Consumer> getAllConsumerOrdersByProviderId(int providerId);

}
