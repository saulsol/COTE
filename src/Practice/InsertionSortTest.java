package Practice;

public class InsertionSortTest {
    public static void main(String[] args) {
        int [] array = {1, 33, 26, 11, 3, 6};

        for (int i = 1; i < array.length; i++) {
           int temp = array[i], j;

           for(j=i-1; j>=0; j--){
                if(array[j] > temp){
                    array[j+1] = array[j];
                }else {
                    break;
                }

           }
            array[j + 1] = temp;


        }

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
