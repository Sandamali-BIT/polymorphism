public class Friends {
    void travel(){}
}
class Nadee extends Friends{
    @Override
    void travel() {
        System.out.println("Let's go Nuwara-Eliya.");
    }
}
class Madu extends Friends{
    @Override
    void travel() {
        System.out.println("Let's go Kandy.");
    }
}
class testFriends{
    public static void main(String[] args) {
        Friends f;
        f=new Madu();f.travel();
        f=new Nadee();f.travel();
    }
}