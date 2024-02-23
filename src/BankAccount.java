public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double com) {
        amount += com;
    }

    public void withdraw(double com) throws LimitException {
        if (com > amount) {
            throw new LimitException("Запрошенная сумма превышает баланс", amount);
        }
        amount -= com;
    }
}

