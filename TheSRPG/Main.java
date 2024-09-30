package TheSRPG;

import java.util.Random;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	Random r = new Random();
	Status s = null;
	Enemy e = null;
	Skill sk = null;
	String selNum = null;
	String act = null;
	String job = null;
	String name = null;
	int stageCnt;
	
	public void select()  throws InterruptedException{
		while (true) {
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println(" - 태애초 마을 - ");
			System.out.println("정신이 드시나요 용사님?");
			Thread.sleep(2000);
			System.out.println("혹시 용사님의 성함이 어떻게 되시나요?");
			name = in.nextLine();
			Thread.sleep(1000);
			System.out.println(name + " 용사님... 멋진 이름이시네요...");
			Thread.sleep(2000);
			System.out.println("떨어진 운석에서 나오는 몬스터를 잡아주실 수 있나요..?");
			System.out.println("1. 네 / 2. 아니요");
			System.out.print("입력 : ");
			String yN = in.nextLine();
			if (yN.equals("1")) {
				Thread.sleep(1000);
				System.out.println("그럼 부탁드릴게요 용사님...");
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println("직업을 선택하세요.");
				System.out.println("1. 검사 / 2. 법사 / 3. 궁수");
				selNum = in.nextLine();
				if(selNum.equals("1")) {
//			e = new Enemy();
					job = "검사";
					s.e = e;
					e.s = s;
					s.Start();
					Start();
				}else if(selNum.equals("2")) {
//			e = new Enemy();
					job = "법사";
					s.e = e;
					e.s = s;
					s.Start();
					Start();
				}else if(selNum.equals("3")) {
//			e = new Enemy();
					job = "궁수";
					s.e = e;
					e.s = s;
					s.Start();
					Start();
				}else if(selNum.equals("히든")) {
//				e = new Enemy();
					job = "히든";
					s.e = e;
					e.s = s;
					s.Start();
					Start();
				}else{
					System.out.println("직업을 골라주세요.");
				}
			}else {
				System.out.println("...네?");
				System.out.println("뭐라고 하셨는지 잘 안들려요 용사님");
				continue;
			}
		}
	}
	
	public void Start()  throws InterruptedException{
		for(int i=0; i<30; i++) {
			if (s.status[0] > 0) {
				if ((i+1) % 10 != 0) {
					Thread.sleep(500);
					System.out.println();
					System.out.println((i+1)+" 스테이지");
					e.EnemyS(r.nextInt(5)+10+i, r.nextInt(5+i)+i, i+1);
					System.out.println("야생의 " + e.eName + " 이(가) 나타났다 !!!");
					s.prt();
					battle();
				} else {
					Thread.sleep(500);
					System.out.println();
					System.out.println((i+1)+" 스테이지");
					e.EnemyS(s.status[0], s.status[2], i+1);
					bossBattle();
				}
			}else
				break;
		}
	}
	
	public void battle() throws InterruptedException{
		while(true) {
			System.out.println();
			System.out.println(e.eName + " || 체력 : " + e.HP + "  공격력 : " + e.STR + "  레벨 : " + e.LV);
			System.out.println("1. 공격 / 2. 스킬 / 3. 내 정보 보기 / 4. 도망");
			act = in.nextLine();
			if (act.equals("1")) {
				Thread.sleep(500);
				s.attack();
				if (e.HP <= 0) {
					Thread.sleep(1000);
					System.out.println(e.eName+" : 크아아악!!");
					Thread.sleep(1000);
					System.out.println("물리쳤습니다.");
					stageCnt ++;
					break;
				}else {
					Thread.sleep(1000);
					s.hit();
					Thread.sleep(1000);
					if (s.status[0] <= 0) {
						System.out.println();
						System.out.println(".....................");
						System.out.println("쥐우는 눈 앞이 깜깜해졌다 !");
						System.out.println(".....................");
						break;
					}else {
						System.out.println();
						System.out.println("쥐우 HP : ["+s.status[0] + " / " + s.maxHP + "] || 쥐우 MP : ["+s.status[1] + " / " + s.maxMP + "]");
					}
				}
			} else if (act.equals("2")){
				if (s.status[1] >= 10) {
					sk.Skills();
					if (sk.mSkillNum == null && sk.skillNum.equals("3") || sk.skillNum == null && sk.mSkillNum.equals("5")) 
						continue;
					else {
						Thread.sleep(500);
						if (e.HP <= 0) {
							Thread.sleep(1000);
							System.out.println(e.eName+" : 크아아악!!");
							Thread.sleep(1000);
							System.out.println("물리쳤습니다.");
							stageCnt ++;
							break;
						} else{
							Thread.sleep(1000);
							s.hit();
							Thread.sleep(1000);
							if (s.status[0] <= 0) {
								System.out.println();
								System.out.println(".....................");
								System.out.println("쥐우는 눈 앞이 깜깜해졌다 !");
								System.out.println(".....................");
								break;
							}else {
								System.out.println();
								System.out.println("쥐우 HP : ["+s.status[0] + " / " + s.maxHP + "] || 쥐우 MP : ["+s.status[1] + " / " + s.maxMP + "]");
							}
						}
					}
				}else {
					System.out.println("마나가 부족합니다");
					continue;
				}
			} else if (act.equals("3")) {
				s.prt();
			} else if (act.equals("4")) {
				System.out.println("도망에 성공했다 !");
				System.out.println("다음 스테이지로 넘어간다.");
				break;
			}

		}
		if(stageCnt == 5) {
			Thread.sleep(1000);
			System.out.println("레벨업!");
			s.setStatus();
			s.lvlUp();
			System.out.println();
			stageCnt = 0;
		}
	}
	
	public void bossBattle() throws InterruptedException{
		while(true) {
			System.out.println();
			System.out.println(" - 중간 보스 스테이지 - ");
			System.out.println(e.eName + " || 체력 : " + e.HP + "  공격력 : " + e.STR + "  레벨 : " + e.LV);
			System.out.println("1. 공격 / 2. 스킬 / 3. 내 정보 보기 / 4. 도망");
			act = in.nextLine();
			if (act.equals("1")) {
				Thread.sleep(500);
				s.attack();
				if (e.HP <= 0) {
					Thread.sleep(1000);
					System.out.println(e.eName+" : 크아아악!!");
					Thread.sleep(1000);
					System.out.println("물리쳤습니다.");
					stageCnt ++;
					break;
				}else {
					Thread.sleep(1000);
					s.hit();
					Thread.sleep(1000);
					if (s.status[0] <= 0) {
						System.out.println();
						System.out.println(".....................");
						System.out.println("쥐우는 눈 앞이 깜깜해졌다 !");
						System.out.println(".....................");
						break;
					}else {
						System.out.println();
						System.out.println("쥐우 HP : ["+s.status[0] + " / " + s.maxHP + "] || 쥐우 MP : ["+s.status[1] + " / " + s.maxMP + "]");
					}
				}
			} else if (act.equals("2")){
				if (s.status[1] >= 10) {
					sk.Skills();
					if (sk.mSkillNum == null && sk.skillNum.equals("3") || sk.skillNum == null && sk.mSkillNum.equals("5")) 
						continue;
					else {
						Thread.sleep(500);
						if (e.HP <= 0) {
							Thread.sleep(1000);
							System.out.println(e.eName+" : 크아아악!!");
							Thread.sleep(1000);
							System.out.println("물리쳤습니다.");
							stageCnt ++;
							break;
						} else{
							Thread.sleep(1000);
							s.hit();
							Thread.sleep(1000);
							if (s.status[0] <= 0) {
								System.out.println();
								System.out.println(".....................");
								System.out.println("쥐우는 눈 앞이 깜깜해졌다 !");
								System.out.println(".....................");
								break;
							}else {
								System.out.println();
								System.out.println("쥐우 HP : ["+s.status[0] + " / " + s.maxHP + "] || 쥐우 MP : ["+s.status[1] + " / " + s.maxMP + "]");
							}
						}
					}
				}else {
					System.out.println("마나가 부족합니다");
					continue;
				}
			} else if (act.equals("3")) {
				s.prt();
			} else if (act.equals("4")) {
				System.out.println("도망에 성공했다 !");
				System.out.println("다음 스테이지로 넘어간다.");
				break;
			}

		}
		if(stageCnt == 5) {
			Thread.sleep(1000);
			System.out.println("레벨업!");
			s.setStatus();
			s.lvlUp();
			System.out.println();
			stageCnt = 0;
		}
	}
	
//	public void MainM() {
//		for(int i=0; i<10; i++) {
//			e.EnemyS(r.nextInt(5)+5+i, r.nextInt(10+i)+i, i+1);
//			
//			while(true) {				
//				if (e.HP <= 0) {
//					System.out.println("물리쳤습니다.");
//					break;
//				}else {
//					System.out.println(e.HP + " / " + e.DMG + " / " + e.LV);
//					System.out.println("1. 공격 / 2. 스킬 / 3. 도망");
//					String act = in.nextLine();
//					if (act.equals("1")) {
//						m.attack();
//						m.hit();
//						System.out.println(m.mHP);
//					} else if (act.equals("2")){
//						w.skillA();
//					} else if (act.equals("3")) {
//						break;
//					}
//				}
//			}
//		}
//	}
//	
//	public void MainA() {
//		for(int i=0; i<10; i++) {
//			e.EnemyS(r.nextInt(5)+5+i, r.nextInt(10+i)+i, i+1);
//			
//			while(true) {				
//				if (e.HP <= 0) {
//					System.out.println("물리쳤습니다.");
//					break;
//				}else {
//					System.out.println(e.HP + " / " + e.DMG + " / " + e.LV);
//					System.out.println("1. 공격 / 2. 스킬 / 3. 도망");
//					String act = in.nextLine();
//					if (act.equals("1")) {
//						a.attack();
//						a.hit();
//						System.out.println(a.aHP);
//					} else if (act.equals("2")){
//						a.skillA();
//					} else if (act.equals("3")) {
//						break;
//					}
//				}
//			}
//		}
//	}
	
}
