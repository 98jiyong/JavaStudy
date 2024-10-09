package _15JavaOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyFoodAdm {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	MyFoodDto mf = new MyFoodDto();
	
	MyFoodAdm(){
		init();
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 등록 / 2. 삭제 / 3. 수정 / 4. 전체보기 (종료:q)");
			String selNum = sc.nextLine();
			if(selNum.equals("1")) {
				insert();
			}else if(selNum.equals("2")) {
				delete();
			}else if(selNum.equals("3")) {
				update();
			}else if(selNum.equals("4")) {
				select();
			}else if(selNum.equals("q")) {
				break;
			}else{
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
	private void init() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();	// 자원 반납
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	private void insert() {
		System.out.println("음식 이름을 입력해주세요.");
		String foodName = sc.nextLine();
		System.out.println("음식 카테고리를 입력해주세요.");
		String foodType = sc.nextLine();
		System.out.println("음식 가격을 입력해주세요.");
		int foodPrice = sc.nextInt();
		sc.nextLine();
		System.out.println("음식 별점을 입력해주세요.");
		double foodFavor = sc.nextDouble();
		sc.nextLine();
		mf.setName(foodName);
		mf.setType(foodType);
		mf.setPrice(foodPrice);
		mf.setFavor(foodFavor);
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system",
					"11111111");
			System.out.println("커넥션 자원 획득 성공");
			String sql = "insert into myfood values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mf.getName());
			pstmt.setString(2, mf.getType());
			pstmt.setInt(3, mf.getPrice());
			pstmt.setDouble(4, mf.getFavor());
			// 실행 후 리턴 값 가져오기
			int result  = pstmt.executeUpdate();
			if(result == 0) {
				conn.rollback();
			}else {
				conn.commit();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	private void delete() {
		System.out.println("삭제할 음식 이름을 입력해주세요.");
		String foodName = sc.nextLine();
		mf.setName(foodName);
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system",
					"11111111");
			System.out.println("커넥션 자원 획득 성공");
			String sql = "delete from myfood where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mf.getName());
			// 실행 후 리턴 값 가져오기
			int result  = pstmt.executeUpdate();
			if(result == 0) {
				conn.rollback();
			}else {
				conn.commit();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void update() {
		System.out.println("수정할 음식 이름을 입력해주세요.");
		String foodName = sc.nextLine();
		mf.setName(foodName);
		System.out.println("무엇을 수정하시겠습니까?");
		System.out.println("1. 카테고리 / 2. 가격 / 3. 별점");
		int selNum = sc.nextInt();
		sc.nextLine();
		if(selNum == 1) {
			System.out.println("수정할 카테고리를 입력해주세요.");
			String foodType = sc.nextLine();
			mf.setType(foodType);				
		}else if(selNum == 2) {
			System.out.println("수정할 가격을 입력해주세요.");
			int foodPrice = sc.nextInt();
			sc.nextLine();
			mf.setPrice(foodPrice);
		}else if(selNum == 3) {
			System.out.println("수정할 별점을 입력해주세요.");
			double foodFavor = sc.nextDouble();
			sc.nextLine();
			mf.setFavor(foodFavor);
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system",
					"11111111");
			System.out.println("커넥션 자원 획득 성공");
			if(selNum == 1) {
				String sql = "update myfood set type = ? where name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mf.getType());
			}else if(selNum == 2) {
				String sql = "update myfood set price = ? where name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, mf.getPrice());
			}else if(selNum == 3) {
				String sql = "update myfood set favor = ? where name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setDouble(1, mf.getFavor());
			}
			pstmt.setString(2, mf.getName());
			// 실행 후 리턴 값 가져오기
			int result  = pstmt.executeUpdate();
			if(result == 0) {
				conn.rollback();
			}else {
				conn.commit();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void select() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system",
					"11111111");
			System.out.println("커넥션 자원 획득 성공");
			String sql = "select * from myfood";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" +
			rs.getInt(3) + "\t" + rs.getDouble(4));
			}

		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
