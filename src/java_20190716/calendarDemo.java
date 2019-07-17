package java_20190716;

public class calendarDemo {
	public static void main(String[] args) {
		// 달력 만들기
		//1. 1년 1월 1일은 월요일 , 1년은 365일, 윤년은 366일, 윤년은 4년마다 발생(100의 배수 제외/단 400배수는 적용)
		//2. 2019년 12월 25일은 무슨요일 (2018년까지의 총일수 + 11월까지의 총 일수 + 25일 )을 7로 나눈 나머지가 1이면 월요일
		
		
		int year = 2020;
		int month = 3;
		int day = 15;
		// preYear -> 2018 preMonth -> 2019년 11월 
		
		int preYear = year-1;
		int preMonth = month -1;
		int totalCount = 0;
		
		//2018년도까지 총일수 구하기
		
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		//2019년도 11월까지의 합
		totalCount +=   60;
		totalCount += day;
	
				
		int dayOfWeek = totalCount%7;		
		String message = null;
		if(dayOfWeek==1) {
			message = "월요일";
		}else if (dayOfWeek==2) {
			message = "화요일";
		}else if (dayOfWeek==3) {
			message = "수요일";
		}else if (dayOfWeek==4) {
			message = "목요일";
		}else if (dayOfWeek==5) {
			message = "금요일";
		}else if (dayOfWeek==6) {
			message = "토요일";
		}else if (dayOfWeek==0) {
			message = "일요일";
		}
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+message);
		
	   
				
		
	

	}

}
