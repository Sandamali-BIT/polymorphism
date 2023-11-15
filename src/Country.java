public class Country {
    void cricket(){}
}
class sriLanka extends Country{
    @Override
    void cricket() {
        System.out.println("Cricket is good.");
    }
}class India extends Country{
    @Override
    void cricket() {
        System.out.println("Cricket is so good.");
    }
}
class testC{
    public static void main(String[] args) {
        Country c,cr;
        c=new sriLanka();c.cricket();
        cr=new India();cr.cricket();
    }
}