public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        System.out.println(bankAccount.getAmount());
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());

            } catch (LimitException e) {
                System.out.println(e.getMessage() + e.getRemainingAmount());
                break;
            }


        }



    }
}