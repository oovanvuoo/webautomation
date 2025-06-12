package elements.testdata;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Account {
    public final String username;
    public final String password;

    public Account() {
        this.username = "";
        this.password = "";
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static final Account Acc1 = new Account("tkv001", ".Kmu#ccNd3evG34");
    public static final Account Acc2 = new Account("tkv002", ".Kmu#ccNd3evG34");

    public static List<Account> loadAccountsFromFile(String filename) {
        List<Account> accounts = new ArrayList<>();
        try {
            Path path = Paths.get(Account.class.getResource(filename).toURI());
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    accounts.add(new Account(parts[0].trim(), parts[1].trim()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }
}