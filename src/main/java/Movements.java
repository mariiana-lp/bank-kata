import java.time.LocalDate;

public class Movements {
    private Integer balance = 0;

    public int amountOf( int amount) {
        return amount;
    }

    public int credit(int amount, LocalDate date){
        this.balance = amount + this.balance;
        return this.balance;
    }

    public int debit(int amount, LocalDate date){
        this.balance = this.balance - amount;
        return this.balance;
    }

    public Integer getBalance() {
        return balance;
    }
}
