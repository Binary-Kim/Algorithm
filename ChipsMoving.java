import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//http://codeforces.com/contest/1213/problem/A
//A. Chips Moving

public class ChipsMoving {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int cnt0 = 0;
		int cnt1 = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] < 0) arr[i] *= -1;
			if(arr[i]%2 ==0) cnt0++;
			else cnt1++;
		}
		if(cnt0 < cnt1) System.out.println(cnt0);
		else System.out.println(cnt1);	
	}
}
