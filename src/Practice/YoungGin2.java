package Practice;

class A1 {
    public void f(){
        System.out.println("1");
    }

    public static void g(){
        System.out.println("2");
    }
}


class B1 extends A1 {
    public void f(){
        System.out.println("3");
    }
}


class C1 extends B1 {
    public static void g(){
        System.out.println("4");
    }
}
public class YoungGin2 {

    public static void main(String[] args) {

        A1 obj = new C1();

        obj.f();
        obj.g();


    }
}
