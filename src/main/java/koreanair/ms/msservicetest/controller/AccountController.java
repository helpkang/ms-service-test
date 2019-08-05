package koreanair.ms.msservicetest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    AccountService service;

    @GetMapping
    public Account getAccount(String name) {
        return service.getAccount(name);    
    }

    @PostMapping
    public Account createAccount(String name, int balance) {
         service.createAccount(name, balance);
         return service.getAccount(name);
    }

    @PostMapping("transfer")
    public List<Account> transfer(String from, String to, int amount) {
         service.transfer(from, to, amount);
         List<Account> list = new ArrayList<>();
         list.add(service.getAccount(from));
         list.add(service.getAccount(to));
         return list;
    }
    
}