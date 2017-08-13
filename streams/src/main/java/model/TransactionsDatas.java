package model;

import java.util.ArrayList;
import java.util.List;

public class TransactionsDatas {

    public TransactionsDatas() {
    }

    public List<Transaction> getTransactionList() {

        List<Transaction> transactionList = new ArrayList<>();

        transactionList.add(new Transaction(2000, 300000.00,  new Trader("Ivan", City.CHERKASSY)));
        transactionList.add(new Transaction(2001, 10000.00, new Trader("Nikolay", City.KIEV)));
        transactionList.add(new Transaction(2011, 1212212.00, new Trader("Eugene" , City.ODESSA)));
        transactionList.add(new Transaction(2009, 877.00, new Trader("Oleh", City.KIEV)));
        transactionList.add(new Transaction(2003, 67777.00, new Trader( "Dmitry", City.KIEV)));
        transactionList.add(new Transaction(2003, 711233.00, new Trader( "Mikhail", City.KIEV)));
        transactionList.add(new Transaction(2003, 5555.00, new Trader( "Viktor", City.ODESSA)));
        transactionList.add(new Transaction(2011, 87655.00, new Trader( "Mikhail", City.ODESSA)));
        transactionList.add(new Transaction(2011, 909088.00, new Trader( "Ivan", City.KIEV)));
        transactionList.add(new Transaction(2003, 9087.00, new Trader( "Denis", City.CHERKASSY)));
        transactionList.add(new Transaction(2003, 654900.00, new Trader( "Roman", City.KIEV)));
        return transactionList;
    }
}
