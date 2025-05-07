package siljeonJava.middle.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent {
    
    static {
        System.out.println("부모");
    }
    
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
