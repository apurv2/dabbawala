package com.dabbawala.menu;

public interface AbstractMenuService {

    public Menu save(MenuItem menuItem);

    public Menu getMenuItemById(int consumerId);

//    public Collection<Consumer> getAllCustomers();

//    public Collection<Consumer> getAllConsumerOrders(int consumerId);
//
//    public Collection<Consumer> getAllConsumerOrdersByProviderId(int providerId);

}
