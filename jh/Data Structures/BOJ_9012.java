package algorithm;

import java.util.Scanner;

public class BOJ_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String sen, result;
		int count;
		for(int tc = 0; tc < T; tc++) {
			sen = sc.next();
			count = 0;
			result = "YES";
			for(int i = 0; i < sen.length(); i++) {
				if(sen.charAt(i) == '(') {
					count++;
				}
				else if(sen.charAt(i) == ')')
					count--;
				if(count < 0) {
					result = "NO";
					break;
				}
			}
			if(count != 0)
				result = "NO";
			System.out.println(result);
		}
	}
}
