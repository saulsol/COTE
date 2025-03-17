package Practice.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 클래스 정보 조회
        Class<?> clazz = Class.forName("Practice.reflection.Person");

        // 생성자 가져오기
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object obj = constructor.newInstance("John");

        // 메서드 가져오기
        Method method = clazz.getMethod("sayHello");

        // 메서드 실행
        method.invoke(obj); // Hello, my name is John
    }
}