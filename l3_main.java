public class l3_main {
    public static void main(String[] args) {
        l3 l=new l3();
        l.deposit(7000);

        System.out.println(l.getNumber());
       l.withdrawr(600);

        System.out.println(l.getNumber());
   l.withdrawr(4000);
        System.out.println(l.getNumber());
    }
}
