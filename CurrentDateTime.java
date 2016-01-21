package leson1;

public class CurrentDateTime {

	public static void main(String[] args) {
		long second=System.currentTimeMillis()/1000;
		int minuts=(int)second/60;
		int hour=minuts/60;
		int day=hour/24;
		System.out.println(day+":"+(hour-(day*24))+":"+(minuts-(hour*60))+":"+(second-(minuts*60)));
		System.out.println(minuts);
		System.out.println(hour);
		
	}

}
