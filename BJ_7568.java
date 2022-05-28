package 백준;

import java.util.Scanner;

public class BJ_7568 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(); // 사람 수 입력
		
		int arr[][] = new int[n][3]; // 사람 수 만큼 몸무게, 키, 등수 배열 생성
		
		for(int i=0;i<n;i++) { // 몸무게와 키 입력
			arr[i][0]= input.nextInt();
			arr[i][1]= input.nextInt();
		}
		
		int count; 
		for(int i=0;i<arr.length;i++) { 
			count =0;
			for(int j=0;j<arr.length;j++) { 
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) { // 기준으로 삼은 사람보다 키와 몸무게가 큰 사람을 만나면 
					count++; //카운트 증가
				}
			}
			
			arr[i][2]=count+1; 
		}
		
		for(int i=0;i<arr.length;i++) { // output
			System.out.print(arr[i][2]+" ");
		}
	}

 
	}

