package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		int sum =0;
	    test:for (int i = 1 ; i<=10 ; i ++) {
	    	if(i==6) break test;
	    	sum += i;
					
	}
	    
		System.out.printf("구구단 총 합은 %d 입니다", sum);
		 	
		outter:for(int first =2; first<=9; first++) {
			for(int second = 1; second<=9;second++) {
				if(first==4 && second==8) break outter;
				System.out.printf("%d * %d = %d%n", first, second, first*second);
			}
			
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print("*");
			}
				System.out.println();
		
		}
		
		
	

	for(int first =9; first>=2; first--) {
		for(int second = 1; second <= 9;second++) {
			System.out.printf("%d * %d = %d%n", first, second, first*second);
			
		}
		
	}
	
}
	
}
