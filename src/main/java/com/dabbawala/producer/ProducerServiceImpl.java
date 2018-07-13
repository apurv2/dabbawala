package com.dabbawala.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements AbstractProducerService {

    @Autowired
    ProducerRepository producerRepository;

    public Producer save(Producer producer) {
        return producerRepository.save(producer);
    }

    public Producer getCustomerById(int consumerId) {
        return null;
    }
}
