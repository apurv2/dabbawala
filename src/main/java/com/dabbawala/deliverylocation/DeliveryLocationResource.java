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
package com.dabbawala.deliverylocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@RestController
class DeliveryLocationResource {
    @Autowired
    AbstractDeliveryLocationService consumerService;

//    @CrossOrigin
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/consumers/new")
//    public DeliveryLocation createNewConsumer(@RequestBody DeliveryLocation consumer) {
//        return consumerService.save(consumer);
//    }

//    @CrossOrigin
//    @GetMapping(value = "/consumers/{id}")
//    public DeliveryLocation getCustomerById(@PathVariable int consumerId) {
//        return consumerService.getCustomerById(consumerId);
//    }

}
