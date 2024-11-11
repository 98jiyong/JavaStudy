package TheSRPG;

import java.util.Scanner;

public class Skill {
	Scanner in = new Scanner(System.in);
	Main m = null;
	Status s = null;
	Enemy e = null;
	double mana = 10;
	String skillNum = null;
	String mSkillNum = null;
	
	public void Skills() throws InterruptedException {
		if(m.selNum.equals("1")) {
			wSkill();
		}else if(m.selNum.equals("2")) {
			mSkill();
		}else if(m.selNum.equals("3")) {
			aSkill();
		}
		
//		int skill = in.nextInt();
//		in.nextLine();
//		if (skill == 1) {
//			wSkill1();
//		}
	}
	
	public void wSkill() {
		System.out.println("1. 공격스킬 / 2. 방어스킬 / 3. 이전으로");
		skillNum = in.nextLine();
		if(skillNum.equals("1")) {
			wSkill1();
		}else if(skillNum.equals("2")) {
			wSkill2();
		}else if(skillNum.equals("3")) {
			
		}else {
			System.out.println("손이 미끄러져 턴을 잃어버렸다 !");
		}
	}
	public void mSkill() {
		System.out.println("1. 물 / 2. 불 / 3. 풀 / 4. 전기 / 5. 이전 메뉴");
		mSkillNum = in.nextLine();
		if(mSkillNum.equals("1")) {
			mSkill1();
		}else if(mSkillNum.equals("2")) {
			mSkill2();
		}else if(mSkillNum.equals("3")) {
			mSkill3();
		}else if(mSkillNum.equals("4")) {
			mSkill4();
		}else if(mSkillNum.equals("5")) {
			
		}else {
			System.out.println("손이 미끄러져 턴을 잃어버렸다 !");
		}
	}
	
	public void aSkill() {
		System.out.println("1. 공격스킬 / 2. 회피스킬 / 3. 이전 메뉴");
		skillNum = in.nextLine();
		if(skillNum.equals("1")) {
			aSkill1();
		}else if(skillNum.equals("2")) {
			aSkill2();
		}else if(skillNum.equals("3")) {
			
		}else {
			System.out.println("손이 미끄러져 턴을 잃어버렸다 !");
		}
	}
	
	public void wSkill1() {
		System.out.println("슬래시 블러스트 !");
		System.out.println("몬스터에게 "+(s.status[2]*1.5)+"의 피해를 줌");
		e.HP -= s.status[2]*1.5;
		s.status[1] -= mana;
	}
	
	public void wSkill2() {
		System.out.println("카운터 스트라이크 !");
		System.out.println("피해를 무효화하고 대미지의 1.5배를 돌려줌");
		e.HP -= e.STR * 1.5;
		s.status[1] -= mana;
	}
	
	public void mSkill1() {
		System.out.println("물대포 !!!");
		if (e.element.equals("fire")) {
			System.out.println("물은 불에 강해 !");
			e.HP -= 4*s.status[4];
			System.out.println(4*s.status[4]+"대미지 !");
		} else if (e.element.equals("electric")) {
			System.out.println("물은 전기에 약해 !");
			e.HP -= 1*s.status[4];
			System.out.println(1*s.status[4]+"대미지 !");
		} else {
			e.HP -= 2*s.status[4];
			System.out.println(2*s.status[4]+"대미지 !");
		}
		s.status[1] -= mana;
	}
	
	public void mSkill2() {
		System.out.println("화염방사 !!!");
		if (e.element.equals("grass")) {
			System.out.println("불은 풀에 강해 !");
			e.HP -= 4*s.status[4];
			System.out.println(4*s.status[4]+"대미지 !");
		} else if (e.element.equals("water")) {
			System.out.println("불은 물에 약해 !");
			e.HP -= 1*s.status[4];
			System.out.println(1*s.status[4]+"대미지 !");
		} else {
			e.HP -= 2*s.status[4];
			System.out.println(2*s.status[4]+"대미지 !");
		}
		s.status[1] -= mana;
	}
	
	public void mSkill3() {
		System.out.println("잎날가르기 !!!");
		if (e.element.equals("electric")) {
			System.out.println("풀은 전기에 강해 !");
			e.HP -= 4*s.status[4];
			System.out.println(4*s.status[4]+"대미지 !");
		} else if (e.element.equals("fire")) {
			System.out.println("풀은 불에 약해 !");
			e.HP -= 1*s.status[4];
			System.out.println(1*s.status[4]+"대미지 !");
		} else {
			e.HP -= 2*s.status[4];
			System.out.println(2*s.status[4]+"대미지 !");
		}
		s.status[1] -= mana;
	}
	
	public void mSkill4() {
		System.out.println("100만 볼트 !!!");
		if (e.element.equals("water")) {
			System.out.println("전기는 물에 강해 !");
			e.HP -= 4*s.status[4];
			System.out.println(4*s.status[4]+"대미지 !");
		} else if (e.element.equals("grass")) {
			System.out.println("전기는 풀에 약해 !");
			e.HP -= 1*s.status[4];
			System.out.println(1*s.status[4]+"대미지 !");
		} else {
			e.HP -= 2*s.status[4];
			System.out.println(2*s.status[4]+"대미지 !");
		}
		s.status[1] -= mana;
	}
	
	public void aSkill1() {
		System.out.println("일점사격 !");
		e.HP -= s.status[2]*1.5;
		s.status[1] -= mana;
	}
	
	public void aSkill2() {
		System.out.println("구르기 !");
		System.out.println("공격을 회피하고 LUK의 2배를 돌려줌");
		System.out.println((s.status[5]*0.5) + "대미지 !");
		e.HP -= s.status[5] * 0.5;
		s.status[1] -= mana;
	}
	
	
	
	
}
