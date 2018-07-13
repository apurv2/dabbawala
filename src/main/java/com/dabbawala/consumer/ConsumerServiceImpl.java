package com.dabbawala.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements AbstractConsumerService {
    @Autowired
    ConsumerRepository consumerRepository;

    public Consumer save(Consumer consumer) {
        return consumerRepository.save(consumer);
    }

    public Consumer getCustomerById(int consumerId) {
        return null;
    }
}
