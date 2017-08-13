package traders;

import model.City;
import model.Trader;
import model.Transaction;
import model.TransactionsDatas;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

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
        System.out.println( getTradersNamesSorted(transactions));

        System.out.println("\nRAW: ");
        transactions = td.getTransactionList();
        transactions.forEach(System.out::println);

        System.out.println("\n5. Are any traders based in provided city? City: " +City.NOONEFORTEST);
        System.out.println(isTradersPresentFrom(transactions, City.NOONEFORTEST));

    }

    // Find all transactions in the given year and sort them by value (small to high);
    private static List<Transaction> getAllForYearINC(List<Transaction> all, int year) {
        return all.stream()
                        .filter(transaction -> transaction.getYear() == year)
                        .sorted(Comparator.comparingDouble(Transaction::getValue))
                        .collect(toList());
    }

    //2 “What are all the unique cities where the traders work?
    private static Set<City> getUniqueCities(List<Transaction> all) {
        return all.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(toSet());
    }

    //3.  Find all traders from provided city and sort them by name.
    private static List<Trader> getTradersFromCitySortedByName(List<Transaction> all, City city) {
    return all.stream()
            .map(Transaction::getTrader)
            .filter(tr -> tr.getCity().equals(city))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName))
            .collect(toList());
    }

    //4.  Return a string of all traders’ names sorted alphabetically.
    private static String getTradersNamesSorted(List<Transaction> all) {
    return all.stream()
            .map(t -> t.getTrader().getName())
            .distinct()
            .sorted()
            .reduce((a, b) -> a + " " + b  )
            .orElse("Empty");
    }

    //5.  Are any traders based in provided city?
    private static boolean isTradersPresentFrom(List<Transaction> all, City city){
        return all.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

/*


7.  What’s the highest value of all the transactions?

            8.  Find the transaction with the smallest value.*/

}
