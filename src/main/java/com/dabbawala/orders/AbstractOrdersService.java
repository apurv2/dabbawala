package com.dabbawala.orders;

import java.util.Collection;

public interface AbstractOrdersService {

    public Orders save(Orders order);

    public Orders getByOrderId(int orderId);

    public Collection<Orders> getAllOrdersByProviderId(int providerId);

    public Collection<Orders> getAllOrdersByLocationForProvider(int providerId);
}
