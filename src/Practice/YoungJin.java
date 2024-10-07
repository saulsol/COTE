package Practice;

class A {
    int a = 10;

    int c = 30;

    public A (){
        System.out.println("가");
    }

    public A(int x){
        System.out.println("나");
    }
}

class B extends A {
    int a = 20; 
    
    public B(){
        System.out.println("다");
    }
    
    public B(int x){
        super(x);
        System.out.println("라");
    }
}

public class YoungJin {
    public static void main(String[] args) {
        B b1 = new B();
        A b2 = new B(1);

        System.out.println(b1.a + b2.a + b2.c + b1.c);

    }

}
