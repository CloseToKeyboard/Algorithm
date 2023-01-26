import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N은 홀수
		
		int[] nums = new int[N];
		int sum = 0;
		int max = -4000;
		int min = 4000;
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
			if (max < nums[i]) { max = nums[i]; }
			if (min > nums[i]) { min = nums[i]; }
		}
		
//		산술평균
		System.out.println(Math.round((double) sum / N));
		
//		중앙값
		int minIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
		System.out.println(nums[N / 2]);
		
//		최빈값
		
		
//		범위
		System.out.println(max - min);
	}
}
