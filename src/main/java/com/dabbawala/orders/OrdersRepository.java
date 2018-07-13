/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dabbawala.orders;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface OrdersRepository extends org.springframework.data.repository.Repository<Orders, Integer> {

    Orders save(Orders order);

    @Query("SELECT orders FROM Orders orders WHERE orders.id =:orderId")
    @Transactional(readOnly = true)
    Collection<Orders> getByOrderId(@Param("orderId") int orderId);

    @Query("SELECT orders FROM Orders orders inner join fetch orders.producer WHERE orders.producer.id =:producerId")
    @Transactional(readOnly = true)
    Collection<Orders> getAllOrdersByProducerId(@Param("producerId") int producerId);

//    @Query("SELECT order FROM Order order inner join fetch order.producer " +
//            "inner join  fetch order.deliveryLocation  WHERE order.producer.id =:producerId")
//    @Transactional(readOnly = true)
//    Collection<Orders> getAllOrdersByLocationForProviderId(@Param("producerId") int producerId);
}
