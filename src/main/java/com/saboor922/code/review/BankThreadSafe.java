package com.saboor922.code.review;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankThreadSafe {
    // Singleton implementation omitted for brevity's sake

    // map from account number to balance
    private Map<String, Integer> accounts = new ConcurrentHashMap<>();

    public int deposit(String account, int sum) throws IllegalArgumentException {
        if (sum < 0) {
            throw new IllegalArgumentException("sum cannot be negative");
        }
        synchronized (account) {
            return accounts.put(account, accounts.get(account) + sum);
        }
    }

    public int withdraw(String account, int sum) {
        synchronized (account) {
            if (sum > accounts.get(account)) {
                return -1;
            }
            accounts.put(account, accounts.get(account) - sum);
            return sum;
        }
    }
}
