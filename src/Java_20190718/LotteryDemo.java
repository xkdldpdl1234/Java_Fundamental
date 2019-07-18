package Java_20190718;

public class LotteryDemo {

	public static void main(String[] args) {
		//Math.random() => 0보다 크거나 같고 1보다 작은 양수를  Double 값으로 한다.
		// (int) => 캐스팅
		
		int[] lotto = new int[6]; 
			for (int i=0; i<lotto.length; i++) {
			//temp는 1보다 크거나 같고 45보다 작거나 같은 임의의 값
			//매번 새로 생성되어야 한다.
		
		double random = Math.random();
		int temp = (int)(random * 45) + 1;
		
		if(i==0) { // 첫번쨰 방은 무조건 임의의 값 temp를 저장한다.
			lotto[i] = temp;
		}else {
			//isExisted는 임의 값 temp와 이전 배열의 값을 비교했을때
			//동일한 값이 있는 경우는 true, 없으면 false
		boolean isExisted = false;
		// i==1 아래의 for loop는 1번 반복
		// i==2 아래의 for loop는 2번 반복
		// i==3 아래의 for loop는 3번 반복....
		
		for(int j=0; j<i; j++) {
			if(lotto[j]==temp) {
				isExisted = true;
				break;
			}
	} 
	if(!isExisted) { // 존재하지 않으면,
		lotto[i] = temp;
	}else {
		i--;// 이전 위치로 변경하면 for문에서 i++로
		    // 증가하기 때문에 원위치로 다시 시도할 수 있음.
	}
	System.out.printf(lotto[i] + ",");

}
}
	}
}
	

	
