package TheSRPG;

import java.util.Random;

public class Enemy {
	Random r = new Random();
	Status s = null;
	Skill sk = null;
	Main m = null;
	
	double HP;
	double STR;
	int LV;
	double DMG;
	String[] elements = {"fire","water","electric","grass"};
	String[] eNames = {"퐈이뤼","꿔부귀","피꼣츄","이상했어"};
	String element = null;
	String eName = null;
	int ran = 0;
	
	public void EnemyS(double HP, double STR, int LV){
		ran = r.nextInt(4);
		this.HP = HP;
		this.STR = STR;
		this.LV =  LV;
		element = elements[ran];
		eName = eNames[ran];
	}
	
}
