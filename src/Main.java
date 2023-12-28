public class Main {
    public static void main(String[] args) {
    BankAccount OptimaBank = new BankAccount();
    OptimaBank.deposit(15000.0);
    while (true) {
        try {
            OptimaBank.withDraw(6000);
        } catch (LimitException e) {
            try {
                OptimaBank.withDraw((int)e.getRemainingAmount());
            } catch (LimitException el) {
                el.printStackTrace();
            }
            break;
     }
    }
  }
}
