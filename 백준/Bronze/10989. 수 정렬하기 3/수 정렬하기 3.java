import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;


public class Main {
	public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(br.readLine());
                
                int[] arr = new int[N];
                
                for(int i =0; i<N; i++)
                {
                        arr[i]= Integer.parseInt(br.readLine());
                }

                Arrays.sort(arr);

                StringBuilder sb = new StringBuilder();

                for(int i = 0; i<N; i++)
                {
                        sb.append(arr[i]).append('\n');
                }

                System.out.println(sb);
        }


}