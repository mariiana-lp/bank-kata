import java.time.LocalDate;
import java.util.List;

public class Account {
    private List<Integer> credit;
    private List<Integer> debit;
    private List<Integer> balance;
    private List<LocalDate> date;

    void deposit(int amountOf) {
        credit.add(amountOf);
        date.add(LocalDate.now());
    }

    void withdraw(int amountOf){
        debit.add(amountOf);
        date.add(LocalDate.now());
    }



    String printStatements() {
            return "Account{" +
                    "credit=" + credit +
                    ", debit=" + debit +
                    ", balance=" + balance +
                    ", date=" + date +
                    '}';
    }

}
