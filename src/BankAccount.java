public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount += sum;
        System.out.println("положить деньги на счет - " + sum);
    }
    public void withDraw(int sum) throws LimitException{
        if (amount < sum ) {
            throw new LimitException("На вашем счету недостаточно средств: ", amount);
        }else {
            System.out.println("Вы можете снять со счета: " + sum);
            amount -= sum;
            System.out.println("Вы сняли со счета: " + sum);
        }
    }
}
