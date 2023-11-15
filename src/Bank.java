public class Bank {
    void bankInterest(){}
}
class BOC extends Bank{
    void bankInterest(){
        System.out.println("5%");
    }
}
class PB extends Bank{
    void bankInterest(){
        System.out.println("6%");
    }
}
class HNB extends Bank{
    void bankInterest(){
        System.out.println("7%");
    }
}
class Test{
    public static void main(String[] args) {
        Bank b;
        b=new BOC();b.bankInterest();
        b=new HNB();b.bankInterest();
        b=new PB();b.bankInterest();
    }
}