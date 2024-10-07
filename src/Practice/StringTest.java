package Practice;

public class StringTest {

    public static void modify(String s){
        s += " hi";
    }




    public static void main(String[] args) {
        String s = "jj";
        modify(s);


        System.out.println(s);
    }
}
