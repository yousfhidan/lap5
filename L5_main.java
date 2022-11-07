public class L5_main {
    public static void main(String[] args) {
        BankAccount in=new BankAccount();
        in.mastery(500);
    in.deposits(100);
    in.deposits(200);
    in.withdraws(500);

    System.out.println(in.getBalance());
    }
}
