package forTest;

import java.util.*;
import java.io.*;
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] info = reader.readLine().split(" ");

        int n = Integer.parseInt(info[0]);
        int m = Integer.parseInt(info[1]);

        int[][] data = new int[n][m];
        String[] line = null;

        for(int i=0; i<n; i++){
            line = reader.readLine().trim().split("\\s+");
            for(int j=0; j<m; j++){
                data[i][j] = Integer.parseInt(line[j]);
            }
        }
        System.out.println(Arrays.deepToString(data));
    }
}
