package _14IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
//		File file = new File("C:\\Workspace\\java_src\\JavaStudy2\\src\\_14IO\\word.txt");
//		boolean isExist = file.exists();
//		System.out.println(isExist);
//		System.out.println();
		
		try {
			File file = new File("C:\\Workspace\\word.txt");
			FileWriter writer = new FileWriter(file);
			FileReader reader = new FileReader(file);
			
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			BufferedReader bufferedReader = new BufferedReader(reader);
			bufferedWriter.write("apple \n");
			// 등록은 그러면 괄호안에 String으로 받아서 저장하면 되고
			// 검색은 
			// 저장 기준을 String + \n 으로 하고 
			bufferedWriter.write("my test \r");
			bufferedWriter.write("banana");
			bufferedWriter.flush();
			bufferedWriter.close();
			String s = "apple";
			for(int i=0; i<3; i++) {
				String result = bufferedReader.readLine();
				if(result.contains(s)) {
					System.out.println(result);
				}
			}
//			System.out.println(bufferedReader.readLine().contains("a"));
			FileReader reader1 = new FileReader(file);
			BufferedReader bufferedReader1 = new BufferedReader(reader1);
			int data;
			while((data = bufferedReader1.read()) != -1) {
				System.out.print((char)data);
			}
			bufferedReader1.close();
//			int data;
//			while((data = fileReader.read()) != -1) {
//				System.out.print((char)data);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		apple banana carrot diamond
//		pl aaacro imn
		
//		try {
//			FileInputStream fis = new FileInputStream("C:\\Workspace\\word.txt");
//			int data = fis.read();
//			System.out.println(data);
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		
	}
}
