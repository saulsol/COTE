package Practice;

public class BubbleSortTest {
    public static void main(String[] args) {
        // 이웃한 두 수를 비교하는 정렬
        // 오름차순 => 앞에가 크고 뒤에가 작으면 swap

        int [] array = {1, 8, 26, 11, 3, 6};
        int temp;

        for(int i=array.length-1; i>0; i--){
            for (int j=1; j<=i; j++){
                if(array[j] < array[j - 1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }



        for (int i : array) {
            System.out.print(i + " ");
        }



    }
}
