package com.bank.Banking.Application.Controller;

import com.bank.Banking.Application.Model.Bank;
import com.bank.Banking.Application.Model.TransferDTO;
import com.bank.Banking.Application.Repository.BankRepo;
import com.bank.Banking.Application.Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/openAc")
    public List<Bank> openingAccount(@RequestBody List<Bank> bank) {
        return bankService.openingAccount(bank);
    }

    @PostMapping("/deposit")
    public Bank deposit(@RequestParam String acNumber, double deposit) {
        return bankService.deposit(acNumber, deposit);
    }

    @PostMapping("/withdraw")
    public Bank withdraw(@RequestParam String acNumber, double withdraw) {
        return bankService.withdraw(acNumber, withdraw);
    }

    @PostMapping("/transfer")
    public TransferDTO transfer(@RequestParam String sender, String reciver, double amount) {
        return bankService.transfer(sender, reciver, amount);
    }

    @GetMapping("/getAll")
    public List<Bank> getAll() {
        return bankService.getAll();
    }

    @GetMapping("/getByAcNumber")
    public Bank getByAcNumber(@RequestParam String AcNumber) {
        return bankService.getByAcNumber(AcNumber);
    }


}
