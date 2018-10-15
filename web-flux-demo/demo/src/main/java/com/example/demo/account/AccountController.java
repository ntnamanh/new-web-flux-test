package com.example.demo.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController("/account")
@EnableWebFlux
public class AccountController {

    private AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping
    public void getAllAccount() {
   //     Flux<Account> findAll = accountRepository.findAll();
//        findAll.subscribe(account -> {
//            return account.getPassword();
////            System.out.println(account.getUsername()+"\n"+ account.getPassword());
//        });

//        findAll.subscribe(account -> {
//            System.out.println(account.getUsername());
//        });
        System.out.println("ahihi");
    }

}
