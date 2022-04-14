public class StarApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        int saldototal = account.printStatements();
        System.out.print(saldototal);
    }
}
