package com.example.demo.account;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
