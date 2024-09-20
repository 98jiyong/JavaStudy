package _08Class;

public class train_Obj {
	
	String tNum = null;
	String tType = null;
	String tTime = null;
	
	train_Obj(String tNum, String tTime){
		this.tNum = tNum;
		this.tTime = tTime;
		if(Integer.parseInt(tNum) % 2 == 1) {
			tType="무궁화";
		}else{
			tType = "새마을";
		}		
	}
	public void show() {
		if(tType.equals("새마을")) {
			tType+="*";
		}
		System.out.println(tNum + " : " + tType + " : " + tTime);
	}
}
