package Practice;

public class SelectionSortTest {

    // 선택 정렬
    // 인덱스를 선정하여 배열에서 일일히 끝까지 도는 것
    // 오름차순 => 선정된 인덱스보다 작으면 바꾸기

    public static void main(String[] args) {
        int [] array = {1, 33, 26, 11, 3, 6};
        int temp;

        for(int i=0; i<array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    temp =  array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }



    }
}
