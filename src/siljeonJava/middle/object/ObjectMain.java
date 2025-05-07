package siljeonJava.middle.object;

public class ObjectMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();

        String toString = child.toString();
        System.out.println(toString);
    }
}
