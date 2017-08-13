package traders;

import model.Transaction;
import model.TransactionsDatas;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MainTraders {

    public static void main(String[] args) {

        TransactionsDatas td = new TransactionsDatas();

        List<Transaction> transactions = td.getTransactionList();

        transactions.forEach(System.out::println);

        System.out.println("\n 2011 all: ");
        getAllForYearINC(transactions, 2011)
                .forEach(System.out::println);

    }

    // Find all transactions in the given year and sort them by value (small to high);
    private static List<Transaction> getAllForYearINC(List<Transaction> all, int year){
        return
        all.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingDouble(Transaction::getValue))
                .collect(toList());
    }
}
