package com.dabbawala.deliverylocation;

public interface AbstractDeliveryLocationService {

    public DeliveryLocation save(DeliveryLocation consumer);

    public DeliveryLocation getCustomerById(int consumerId);

//    public Collection<Consumer> getAllCustomers();

//    public Collection<Consumer> getAllConsumerOrders(int consumerId);
//
//    public Collection<Consumer> getAllConsumerOrdersByProviderId(int providerId);

}
