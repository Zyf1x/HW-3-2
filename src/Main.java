public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);

        System.out.println("Ваш баланс: " + account.getAmount());

        try {
            while (true) {
                account.withdraw(6000);
                System.out.println("Снято 6000 com. Остаток средств: " + account.getAmount());
            }
        } catch (LimitException e) {
            System.out.println("Не достаточно средств: " + e.getMessage() + ". Остаток средств: " + e.getRemainingAmount());
        }
    }
}