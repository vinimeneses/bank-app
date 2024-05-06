package net.javaguides.bankingapp.service;

import net.javaguides.bankingapp.dto.AccountDto;
import net.javaguides.bankingapp.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
}
