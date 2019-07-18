package java_20190717;

public class BreakDemo2 {
	public static void main(String[] args) {
		
		int sum =0;
	    for (int i = 1 ; i<=10 ; i ++) {
	    	if(i==6) continue ;
	    	sum += i;			
	}
	    
		System.out.printf("구구단 총 합은 %d 입니다", sum);
		 	
		outter:for(int first =2; first<=9; first++) {
			for(int second = 1; second<=9;second++) {
				if(second==5) continue outter;
				System.out.printf("%d * %d = %d%n", first, second, first*second);
				if(true) return;
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
