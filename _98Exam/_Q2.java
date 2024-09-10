package _98Exam;

public class _Q2 {

	public static void main(String[] args) {
		int[] jobTime ={40,32,4,16,5,8};
		int work_time = 4;
		int max_time = 0;
		int max_index = 0;
		for(int i=0; i<jobTime.length; i++) {
			if(jobTime[i] > max_time) {
				max_time = jobTime[i];
				max_index = i;
			}
		}
		for(int i=0;;i++) {
			if(jobTime[i%6] > 0) {
				jobTime[i%6] -= work_time;
				System.out.println((i%6) + "번째 사람 사용 중");				
			}
			if(jobTime[max_index] == 0) {
				break;
			}
		}
	}

}
