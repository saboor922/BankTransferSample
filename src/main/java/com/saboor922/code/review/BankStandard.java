package com.saboor922.code.review;

import java.util.HashMap;
import java.util.Map;

public class BankStandard {
    // Singleton implementation omitted for brevity's sake

    // map from account number to balance
    private Map<String, Integer> accounts = new HashMap<>();

    public int deposit(String account, int sum) throws IllegalArgumentException {
        if (sum < 0) {
            throw new IllegalArgumentException("sum cannot be negative");
        }
        return accounts.put(account, accounts.get(account) + sum);
    }

    public int withdraw(String account, int sum) {
        if (sum > accounts.get(account)) {
            return -1;
        }
        accounts.put(account, accounts.get(account) - sum);
        return sum;
    }
}
