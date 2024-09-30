package TheSRPG;

public class Game {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		Main m = new Main();
		Status s = new Status();
		Skill sk = new Skill();
		Enemy e = new Enemy();
		
		
		m.e = e;
		e.m = m;
		e.sk = sk;
		sk.e = e;
		sk.m = m;
		m.sk = sk;
		s.sk =sk;
		sk.s = s;
		m.s = s;
		s.m = m;
		
		System.out.println("The Pocket of Legends . . . ");
		Thread.sleep(1000);
		System.out.println("난 태애초 마을에 살고 있는 용사다.");
		Thread.sleep(2000);
		System.out.println("어느 날 길을 가다가 머리에 운석이 하나 '쾅' 하고 떨어졌는데...");
		Thread.sleep(2500);
		System.out.println();
		System.out.println("    O\r\n");
		Thread.sleep(250);
		System.out.println("　     O\r\n");
		Thread.sleep(250);
		System.out.println("　    　　 O\r\n");
		Thread.sleep(250);
		System.out.println("　　    　　 o\r\n");
		Thread.sleep(250);
		System.out.println("　　    　　 　o\r\n");
		Thread.sleep(250);
		System.out.println("　　　    　　 o\r\n");
		Thread.sleep(250);
		System.out.println("　　    　　　o\r\n");
		Thread.sleep(250);
		System.out.println("　    　　　 。\r\n");
		Thread.sleep(250);
		System.out.println("　    　　 。\r\n");
		Thread.sleep(250);
		System.out.println("　    　　.\r\n");
		Thread.sleep(250);
		System.out.println("　    　　.\r\n");
		Thread.sleep(250);
		System.out.println("　    　 　.\r\n");
		Thread.sleep(250);
		System.out.println("　　    　  .\r\n");
		Thread.sleep(250);
		System.out.println("　　    　 　.");
		Thread.sleep(1500);
		System.out.println("");
		Thread.sleep(250);
		System.out.println("         '쾅'");
		Thread.sleep(1500);
		System.out.print("         털썩");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1500);
		System.out.println();
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1500);
		System.out.println();
		System.out.println("..나요..");
		Thread.sleep(2000);
		System.out.println("..들리..나..");
		Thread.sleep(3000);
		System.out.println();
		System.out.println("           |   \r\n"
						 + "  　　╲　　　　|　　　　 ╱   \r\n"
						 + "　╲　　　╲　  |     ╱    ╱\r\n"
						 + "　　╲　　　╲　 |    ╱   ╱ \r\n"
						 + "　　  ╲    혹시...　　　╱   \r\n"
						 + "-　- -　　제 목소리가　　-　-　-  \r\n"
						 + "　　╱　   들리시나요?　　╲   \r\n"
						 + "　╱　　/  /  |  ╲     ╲    \r\n"
						 + "　　╱　　　/　 |　　╲      ╲ \r\n"
						 + "　/　　　/　  |　　　╲        \r\n"
						 + "　　　　　　　");
		System.out.println("..............................");
		
		m.select();
	}

}
