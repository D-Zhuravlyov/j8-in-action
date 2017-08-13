package traders;

import model.City;
import model.Trader;
import model.Transaction;
import model.TransactionsDatas;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MainTraders {

    public static void main(String[] args) {

        TransactionsDatas td = new TransactionsDatas();

        List<Transaction> transactions = td.getTransactionList();

        System.out.println("\nRAW: ");
        transactions.forEach(System.out::println);

        System.out.println("\n2011 all: ");
        getAllForYearINC(transactions, 2011)
                .forEach(System.out::println);

        System.out.println("\nRAW: ");
        transactions = td.getTransactionList();
        transactions.forEach(System.out::println);

        System.out.println("\nUnique cities: ");
        getUniqueCities(transactions)
                .forEach(System.out::println);

        System.out.println("\nRAW: ");
        transactions = td.getTransactionList();
        transactions.forEach(System.out::println);

        System.out.println("\nFind all traders from Kiev and sort them by name.: ");
        getTradersFromCitySortedByName(transactions, City.KIEV)
                .forEach(System.out::println);

        System.out.println("\nRAW: ");
        transactions = td.getTransactionList();
        transactions.forEach(System.out::println);

        System.out.println("\n4.  Return a string of all traders’ names sorted alphabetically.: ");
        getTradersNamesSorted(transactions).forEach(System.out::println);


    }

    // Find all transactions in the given year and sort them by value (small to high);
    private static List<Transaction> getAllForYearINC(List<Transaction> all, int year) {
        return all.stream()
                        .filter(transaction -> transaction.getYear() == year)
                        .sorted(Comparator.comparingDouble(Transaction::getValue))
                        .collect(toList());
    }

    //2 “What are all the unique cities where the traders work?
    private static List<City> getUniqueCities(List<Transaction> all) {
        return all.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(toList());
    }

    //3.  Find all traders from Kiev and sort them by name.
    private static List<Trader> getTradersFromCitySortedByName(List<Transaction> all, City city) {
    return all.stream()
            .map(Transaction::getTrader)
            .filter(tr -> tr.getCity().equals(city))
            .sorted(Comparator.comparing(Trader::getName))
            .collect(toList());
    }

    //4.  Return a string of all traders’ names sorted alphabetically.
    private static List<String> getTradersNamesSorted(List<Transaction> all) {
    return all.stream()
            .map(Transaction::getTrader)
            .map(Trader::getName)
            .distinct()
            .sorted()
            .collect(toList());
    }

/*


5.  Are any traders based in Milan?

            6.  Print all transactions’ values from the traders living in Cambridge.

7.  What’s the highest value of all the transactions?

            8.  Find the transaction with the smallest value.*/

}
