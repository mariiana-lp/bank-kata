import java.time.LocalDate;
import java.util.List;

public class Account {
    Movements movements = new Movements();

    void deposit(int amountOf) {
        movements.credit(amountOf, LocalDate.now() );
    }

    void withdraw(int amountOf){
        movements.debit(amountOf, LocalDate.now());
    }

    Integer printStatements(){
        return movements.getBalance();
    }

}
