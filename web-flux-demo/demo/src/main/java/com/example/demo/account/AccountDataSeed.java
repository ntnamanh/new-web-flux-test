package com.example.demo.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nguyen Trung Nam Anh
 */

@Component
public class AccountDataSeed implements CommandLineRunner {

    private AccountRepository accountRepository;

    public AccountDataSeed(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    private List<Account> generateAccount() {
        Information information1 = new Information("Super","Bird",24,
                "693 Pham Van Bach","ntnamanhu@gmaik.com","0983909919");
        Information information2 = new Information("Nhat","Tan",20,
                "123 Truong Son","nhattan@gmaik.com","0913191919");
        Information information3 = new Information("Tu","Map",26,
                "456 Cong Hoa","TuMap@gmaik.com","09456161666");

        Account account1 = new Account("user1","1234567",information1);
        Account account2 = new Account("user2","1234567",information2);
        Account account3 = new Account("user3","1234567",information3);
        return Arrays.asList(account1,account2,account3);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Account> accountList = generateAccount();

//        accountRepository.deleteAll();

        accountList.forEach(account->{this.accountRepository.save(account);});
//        accountRepository.findAll().subscribe(account -> {
//            System.out.println(account.getUsername());
//        });
    }
}
