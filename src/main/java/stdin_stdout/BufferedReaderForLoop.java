package stdin_stdout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The class takes a number between 2 and 20 (inclusive) and prints the 1st 10 multiples of this number.
 */
public class BufferedReaderForLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(2<=N && N<=20){
            for(int i=1; i<=10; i++){
                System.out.println(N + " x " + i + " = " +N*i);
            }
        }

        bufferedReader.close();
    }
}
