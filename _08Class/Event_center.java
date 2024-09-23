package _08Class;

import java.util.Scanner;

public class Event_center {
	
	Event_one[] elist = new Event_one[4];
	Scanner sc = new Scanner(System.in);
	int eCnt = 0;
	
	public void regEvent(){
		Event_one event = new Event_one();
		if(eCnt == elist.length) {
			System.out.println("더이상 등록할 수 없습니다.");
		}else {
			System.out.println("제목을 입력해주세요.");
			String eTitle = sc.nextLine();
			event.setTitle(eTitle);
			System.out.println("내용을 입력해주세요.");
			String eContent = sc.nextLine();
			event.setContent(eContent);
			for(int i=0; i<elist.length; i++) {
				if(elist[i] == null) {
					elist[i] = event;
					eCnt++;
					break;
				}
			}
		}
	}
	public void ovEvent() {
		while(true) {
			System.out.println("이벤트 리스트");
			for(int i=0; i<elist.length; i++) {
				if(elist[i] != null) {
					String eventTitle = elist[i].getTitle();
					System.out.println((i+1) + ". 제목 : " + eventTitle);
				}
			}
			System.out.println("총 " + eCnt + "개");
			System.out.println("자세히 보고 싶은 이벤트를 선택하세요.(나가기 : " + (eCnt+1) + ")");
			int detailNum = sc.nextInt();
			sc.nextLine();
			if(detailNum == (eCnt+1)) {
				break;
			}else {				
				detail(detailNum);
			}
		}
	}
	
	public void detail(int detailNum) {
		for(int i=0; i<elist.length; i++) {
			if(elist[i] != null) {
				String eventTitle = elist[i].getTitle();
				String eventContent = elist[i].getContent();
				if(detailNum == (i+1)) {
					System.out.println(eventTitle);
					System.out.println(eventContent);
					System.out.println();
					break;
				}
			}
		}
	}

}
