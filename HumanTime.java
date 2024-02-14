package ivprep;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HumanTime {

	public static void main(String[] args) {
		int timeIp = 359999;
		String[] timeArr = new String[] {"00", "00", "00"};
		int r = timeIp, q = 0;
		for(int i = 2; i >= 1; i--) {
			q = r % 60;
			timeArr[i] = (q<10)?"0"+q:""+q;
			r = r/60;
			if(r<=0) break;
		}
		if(r>0) {
			timeArr[0] = (r<10)?"0"+r:""+r;
		}
		
		String timeDisp =  Stream.of(timeArr).collect(Collectors.joining(":"));
		System.out.println(timeDisp);
    }
}
