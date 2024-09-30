package TheSRPG;

import java.util.Random;

public class Status {
	Random r = new Random();
	Enemy e = null;
	Main m = null;
	Skill sk = null;
	
	
	double maxHP = 0;
	double maxMP = 0;
	double attackDMG = 0;
	double[] status = {2,20,4,4,4,4};
	int[] addStatus = new int[6];
	String[] sname = {"HP","MP","STR","DEF","INT","LUK"};
//	status[0] = 20;
//	status[1] = 20;
//	status[2] = 4;
//	status[3] = 4;
//	status[4] = 4;
//	status[5] = 4;
	
//	double[] mageS = new double[6];
//	double[] archerS = new double[6];
	
	public void Start() {
		setStatus();
		
//		if (m.selNum.equals("1")) {
//			setStatus();
//		} else if (m.selNum.equals("2")) {
//			setStatus();
//		} else if (m.selNum.equals("3")) {
//			setStatus();
//		} else {
//			System.out.println("다시 선택");
//		}
	}
	
	public void setStatus() {
		if(m.selNum.equals("1")) {
			addStatus[0] = 1;
			addStatus[1] = 10;
			addStatus[2] = 6;
			addStatus[3] = 6;
			addStatus[4] = 1;
			addStatus[5] = 1;
			maxHP += addStatus[0];
			maxMP += addStatus[1];
			status[0] = maxHP;
			status[1] = maxMP;
			status[2] += addStatus[2];
			status[3] += addStatus[3];
			status[4] += addStatus[4];
			status[5] += addStatus[5];
		}else if(m.selNum.equals("2")) {
			addStatus[0] = 10;
			addStatus[1] = 30;
			addStatus[2] = 1;
			addStatus[3] = 1;
			addStatus[4] = 6;
			addStatus[5] = 1;
			maxHP += 10;
			maxMP += 30;
			status[0] = maxHP;
			status[1] = maxMP;
			status[2] += 1;
			status[3] += 1;
			status[4] += 6;
			status[5] += 1;
		}else if(m.selNum.equals("3")) {
			addStatus[0] = 15;
			addStatus[1] = 15;
			addStatus[2] = 3;
			addStatus[3] = 1;
			addStatus[4] = 1;
			addStatus[5] = 6;
			maxHP += 15;
			maxMP += 15;
			status[0] = maxHP;
			status[1] = maxMP;
			status[2] += 3;
			status[3] += 1;
			status[4] += 1;
			status[5] += 6;
		}else if(m.selNum.equals("히든")) {
			addStatus[0] = 999;
			addStatus[1] = 999;
			addStatus[2] = 999;
			addStatus[3] = 999;
			addStatus[4] = 999;
			addStatus[5] = 999;
			maxHP += 999;
			maxMP += 999;
			status[0] = maxHP;
			status[1] = maxMP;
			status[2] += 999;
			status[3] += 999;
			status[4] += 999;
			status[5] += 999;
		}
	}
	
	public void prt() {
		System.out.println(" - 내 정보 - ");
		for (int i = 0; i < status.length; i++ ) {
			System.out.println(sname[i] + " : " + status[i]);
		}
	}
	
	public void lvlUp() {
		for (int i = 0; i < status.length; i++ ) {
			System.out.println(sname[i] + " : " + (status[i]-addStatus[i]) + " > " + addStatus[i] + " 증가! = " + status[i]);
		}
	}
	
//	public void warriorLVUP() {
//		status[0] += 30;
//		status[1] += 10;
//		status[2] += 6;
//		status[3] += 6;
//		status[4] += 1;
//		status[5] += 1;
//	}
//	
//	public void mageLVUP() {
//		status[0] += 10;
//		status[1] += 30;
//		status[2] += 1;
//		status[3] += 1;
//		status[4] += 6;
//		status[5] += 1;
//	}
//	
//	public void archerLVUP() {
//		status[0] += 15;
//		status[1] += 15;
//		status[2] += 3;
//		status[3] += 1;
//		status[4] += 1;
//		status[5] += 6;
//	}
	
	public void attack() {
		System.out.println("공격 !");
		critical();
		e.HP -= attackDMG;
		System.out.println(e.eName + " 에게 "+attackDMG+"의 피해를 줌");
	}
	public void hit() {
		if(m.act.equals("2")) {
			if (sk.skillNum == null){
				e.DMG = e.STR - (e.STR * (status[3]/100));
			} else if(sk.skillNum.equals("2")) {
				e.DMG = 0;
			} else {
				e.DMG = e.STR - (e.STR * (status[3]/100));
			}
		}else {
			e.DMG = e.STR - (e.STR * (status[3]/100));
		}
		status[0] -= e.DMG;
		System.out.println(e.eName + " 의 공격으로 인해 "+e.DMG+"의 피해를 입음");
	}
	
	public void critical() {
		double cri = (r.nextInt(100)/status[5]);
		// 크리티컬이 안 뜰 때
		if(cri <= 1) {
			System.out.println("크리티컬 !");
			attackDMG = status[2] * (2 + (status[5]/100)) ; 
		}else {
			attackDMG = status[2];
		}
	}
	
	public void bossHit() {
		int bossAct = r.nextInt(2) + 1;
		if (bossAct == 1) {
			hit();
		} else {
			
		}
	}
	
}
