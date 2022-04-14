import java.time.LocalDate;
import java.util.List;

public class Account {
    Movements movements = new Movements();

    void deposit(int amountOf, String date) {
        movements.credit(amountOf, date);
    }

    void withdraw(int amountOf, String date){
        movements.debit(amountOf, date);
    }

    Integer printStatements(){
        return movements.getBalance();
    }

}
