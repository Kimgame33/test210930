package test;

import java.util.Calendar;
// �޼ҵ� ����
public class NowTime {
	Calendar check = Calendar.getInstance();
	int hour;
	int ampm;
	int minute;
	int second;
	//�ð� ����
	public NowTime() {
		hour = check.get(Calendar.HOUR_OF_DAY);
		ampm = check.get(Calendar.AM_PM);
		minute = check.get(Calendar.MINUTE);
		second = check.get(Calendar.SECOND);
		
		System.out.println("����ð�: "+((ampm == Calendar.AM) ? "���� " : "���� ") +
						hour +"�� "+minute+"�� "+second+"��");
	}
	//�ð� ����� ����
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
//�ð� ��� �� ���
	public static void main(String[] args) {
		NowTime nt = new NowTime();
		System.out.println(nt.printCalender());
	}

}
