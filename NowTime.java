package test;

import java.util.Calendar;
// 메소드 생성
public class NowTime {
	Calendar check = Calendar.getInstance();
	int hour;
	int ampm;
	int minute;
	int second;
	//시간 설정
	public NowTime() {
		hour = check.get(Calendar.HOUR_OF_DAY);
		ampm = check.get(Calendar.AM_PM);
		minute = check.get(Calendar.MINUTE);
		second = check.get(Calendar.SECOND);
		
		System.out.println("현재시간: "+((ampm == Calendar.AM) ? "오전 " : "오후 ") +
						hour +"시 "+minute+"분 "+second+"초");
	}
	//시간 결과값 설정
	protected String printCalender(){
		if(4<hour && hour<12){
			return "Good Morning";
		} else if(12<=hour && hour<18){
			return "Good Afternoon";
		} else if(18<=hour && hour<20){
			return "Good Evening";
		} else 
			return "Good Night";
	}
//시간 결과 값 출력
	public static void main(String[] args) {
		NowTime nt = new NowTime();
		System.out.println(nt.printCalender());
	}

}
