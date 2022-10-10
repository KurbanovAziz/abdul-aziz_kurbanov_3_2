public class BankAccount {
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void deposit(Double sum) {
        amount = sum;
    }

    public void withDraw(int sum) throws LimitException {
        amount -= sum;
        if (sum > amount) {
            throw new LimitException("Вы сняли весь остаток: " + amount + "\nТеперь ваш баланс равен: ", amount -= amount);
        }
    }
}
