package com.dabbawala.producer;

public interface AbstractProducerService {

    public Producer save(Producer consumer);

    public Producer getCustomerById(int consumerId);

//    public Collection<Consumer> getAllCustomers();

//    public Collection<Consumer> getAllConsumerOrders(int consumerId);
//
//    public Collection<Consumer> getAllConsumerOrdersByProviderId(int providerId);

}
