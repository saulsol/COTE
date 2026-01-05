package forTest;

public class TimeComplex {
    public static void main(String[] args) {

        int n = 10;

        for (int i=0; i<n; i++){
            System.out.println("hi");
        }

        //-----------------------------------

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("hi");
            }
        }

        //------------------------------------


        for (int i = 1; i < n; i *= 2) {
            System.out.println("hi");
        }

        // ------------------------------------

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                System.out.println("hi");
            }
        }



    }
}
