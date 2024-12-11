package JAVA_GIBON.this_test;

public class Fruit {

    public String name;
    public String color;
    public double weight;
    public int count;


    public Fruit(String name, String color) {
        this.name = "이름: " + name;
        this.color = "색: "+ color;
    }

    public Fruit(String name, String color, double weight, int count) {
        this(name, color);
        this.weight = weight;
        this.count = count;
    }

    public Fruit getFruit(){
        return this;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", count=" + count +
                '}';
    }


    public static void main(String[] args) {
        Fruit fruit = new Fruit("포도", "보라", 5.5, 1);
        System.out.println(fruit == fruit.getFruit());
    }

}
