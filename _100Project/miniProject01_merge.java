package _100Project;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class miniProject01_merge {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("환영합니다.");
		// 플레이 인원수를 입력받아 받은 값 만큼 반복
		System.out.println("게임을 플레이 할 인원수를 설정해주세요.  (숫자 입력)");
		int userCnt = in.nextInt();
		in.nextLine();
		int[] userPoint = new int[userCnt]; // 점수를 저장할 배열
		double[] userSpeed = new double[userCnt]; // 속도를 저장할 배열
		double[] userCorrect = new double[userCnt]; // 정확도를 저장할 배열
		double[] userSpeedScore = new double[userCnt]; // 속도 점수
		double[] userCorrectScore = new double[userCnt]; // 정확도 점수
		double[] userTotalScore = new double[userCnt]; // 총 점수를 저장할 배열
		String[] userId = new String[userCnt]; // 아이디를 저장할 배열
		System.out.println("난이도 선택:");
		System.out.println("1번 기본 / 2번 심화");
		int level=in.nextInt();
		in.nextLine();
		// 20240822_원진호_조건문을 사용하여 난이도 선택
		if(level ==1) {
			// 진호님 만든 파일
			for(int i = 0; i < userCnt; i++) {
				int missCnt = 0; // 오답 카운트
				int score = 0; // 기본 점수
				
				String accTxt = "";
				double questionCnt = 0;
				double accSpeed = 0;
				System.out.println((i+1) + "번째 ID를 입력해주세요");
				userId[i] = in.nextLine();
				String[] korArr = {
						"연못", "강물", "해변", "고요", "바위", "은하수", "산길", "낙엽", "그림자", "사랑",
						"파랑", "노래", "봄바람", "눈꽃", "별빛", "바람결", "햇빛", "하얀", "푸른", "가슴",
						"달빛", "비밀", "가로등", "기억", "연기", "파도", "은빛", "물결", "바다", "나뭇잎",
						"낮", "구름", "길", "여울", "초록", "흰", "노을", "나비", "산책", "아침",
						"빛", "별", "하늘", "가을", "겨울", "봄", "여름", "밤하늘", "꿈", "기다림",
						"추억", "소리", "시간", "달", "하루", "웃음", "돌", "새", "작은", "낮잠",
						"바람", "눈물", "희망", "봄꽃", "고양이", "나무", "햇살", "미소", "초원", "바다새",
						"은하", "무지개", "고요함", "동산", "별님", "달님", "바람개비", "푸르름", "햇빛", "구름사이",
						"여명", "파도소리", "바다빛", "산등성", "고갯길", "아지랑이", "낙조", "별똥별", "해돋이", "산새",
						"풀잎", "꽃향기", "숲속", "돌담", "해오라기", "비바람", "가로수", "석양", "고향", "산들바람",
						"햇살밭", "꽃길", "고드름", "이슬", "바람꽃", "산골", "은빛", "모래사장", "물방울", "새소리",
						"강가", "별무리", "구름다리", "달빛사이", "은하수길", "고요한밤", "하얀구름", "푸른하늘", "햇살길", "아침햇살",
						"이른아침", "구름산", "바람소리", "달그림자", "물안개", "숲속길", "바람결", "고요한산", "별나라", "강둑",
						"작은섬", "바람산", "고요한숲", "햇살속", "별빛길", "나무숲", "바다길", "푸른산", "파란하늘", "구름바람",
						"고요한강", "별빛바람", "산속길", "달빛산", "바다속", "은빛파도", "구름사이길", "별빛속", "바람길", "산속물결",
						"고요한바다", "햇빛숲", "푸른초원", "바람숲", "구름숲", "달빛길", "바람길사이", "햇살속길", "산속고요", "강물소리",
						"푸른바람", "고요한바람", "별빛사이길", "구름사이바람", "바다속길", "햇빛속바람", "고요한길", "은빛길", "푸른숲길", "별빛고요",
						"달빛고요", "산속길사이", "구름속바람", "햇살고요", "별빛속길", "달빛속길", "고요한은빛길", "바람속고요", "산속바람결", "푸른바람길"
				};
				
//			System.out.println(Arrays.toString(signArr));
				// 20240822_원진호_문제를 푸는 횟수 반복
				for(int j = 0; j < 5; j++) {
					
					String korWord = ""; // korArr에서 무작위로 받을 값
					String gameTxt = ""; // korWord + signWord
					String missWord = "없음"; // 오타를 저장할 변수
					
					korWord = korArr[r.nextInt(korArr.length)];
					gameTxt = korWord;
					System.out.println(gameTxt);
					// 값을 받기전에 시간 
					long beforeTime = System.currentTimeMillis();
					String userTxt = in.nextLine(); // 값을 입력받을 변수
					// 값을 받은 후에 시간
					long afterTime = System.currentTimeMillis();
					// 20240822_원진호_타자속도 측정(값을 받기전에 시간과 받은 후의 시간 차이 계산)
					long secDiffTime = (afterTime - beforeTime)/1000;
					questionCnt++;
					accSpeed += secDiffTime;
					accTxt += gameTxt;
					// 20240822_원진호_점수 계산하는 기능
					if(userTxt.equals(gameTxt)) {
						score += 10;
					}else {
						missWord = "";
						score += 0;
					}
					// 20240822_원진호_오답 개수 카운트
					for(int k = 0; k < gameTxt.length(); k++) {
						if(userTxt.charAt(k) != gameTxt.charAt(k)) {
							missCnt++;
							missWord += userTxt.charAt(k) + " ";
						}
					}
					userSpeed[i] = Math.round((accSpeed / questionCnt) * 10) / 10.0; // 소수점 3자리까지 끊어쓰기
					userCorrect[i] = Math.round(((1 - (double) missCnt / accTxt.length()) * 100) * 10) / 10.0; // 소수점 3자리까지 끊어쓰기
					userPoint[i] =  score; // 점수
					System.out.print("타이핑 시간 : "+secDiffTime + "초 / ");
					System.out.print("오타 : " + missWord + " / ");
					System.out.print("현재 점수 : "+ score);
					System.out.println("\n");
				}
				
			}
		}else {
			// 지용님 만든 파일
			for(int i = 0; i < userCnt; i++) {
				int missCnt = 0; // 오답 카운트
				int score = 0; // 기본 점수
				
				String accTxt = "";
				double questionCnt = 0;
				double accSpeed = 0;
				System.out.println((i+1) + "번째 ID를 입력해주세요");
				userId[i] = in.nextLine();
				String[] korArr = {
						"연못", "강물", "해변", "고요", "바위", "은하수", "산길", "낙엽", "그림자", "사랑",
						"파랑", "노래", "봄바람", "눈꽃", "별빛", "바람결", "햇빛", "하얀", "푸른", "가슴",
						"달빛", "비밀", "가로등", "기억", "연기", "파도", "은빛", "물결", "바다", "나뭇잎",
						"낮", "구름", "길", "여울", "초록", "흰", "노을", "나비", "산책", "아침",
						"빛", "별", "하늘", "가을", "겨울", "봄", "여름", "밤하늘", "꿈", "기다림",
						"추억", "소리", "시간", "달", "하루", "웃음", "돌", "새", "작은", "낮잠",
						"바람", "눈물", "희망", "봄꽃", "고양이", "나무", "햇살", "미소", "초원", "바다새",
						"은하", "무지개", "고요함", "동산", "별님", "달님", "바람개비", "푸르름", "햇빛", "구름사이",
						"여명", "파도소리", "바다빛", "산등성", "고갯길", "아지랑이", "낙조", "별똥별", "해돋이", "산새",
						"풀잎", "꽃향기", "숲속", "돌담", "해오라기", "비바람", "가로수", "석양", "고향", "산들바람",
						"햇살밭", "꽃길", "고드름", "이슬", "바람꽃", "산골", "은빛", "모래사장", "물방울", "새소리",
						"강가", "별무리", "구름다리", "달빛사이", "은하수길", "고요한밤", "하얀구름", "푸른하늘", "햇살길", "아침햇살",
						"이른아침", "구름산", "바람소리", "달그림자", "물안개", "숲속길", "바람결", "고요한산", "별나라", "강둑",
						"작은섬", "바람산", "고요한숲", "햇살속", "별빛길", "나무숲", "바다길", "푸른산", "파란하늘", "구름바람",
						"고요한강", "별빛바람", "산속길", "달빛산", "바다속", "은빛파도", "구름사이길", "별빛속", "바람길", "산속물결",
						"고요한바다", "햇빛숲", "푸른초원", "바람숲", "구름숲", "달빛길", "바람길사이", "햇살속길", "산속고요", "강물소리",
						"푸른바람", "고요한바람", "별빛사이길", "구름사이바람", "바다속길", "햇빛속바람", "고요한길", "은빛길", "푸른숲길", "별빛고요",
						"달빛고요", "산속길사이", "구름속바람", "햇살고요", "별빛속길", "달빛속길", "고요한은빛길", "바람속고요", "산속바람결", "푸른바람길"
				};
				
				String[] signArr = new String[180];
				String sign = "~?!@#$%^&*()-_+=[]{}<>";
				String word2 = "";
				// 특수문자 배열에 집어넣기
				// 20240822_정지용_랜덤으로 특수문자를 중복없이 뽑아오는 기능_수정완료
				for(int j = 0; j < signArr.length; j++) {
					for(int k = 0; k < 3; k++) {
						char t_sign = sign.charAt(r.nextInt(sign.length()));
						if(k == 0) {						
							word2 += sign.charAt(r.nextInt(sign.length()));
						}
						for(int l = 0; l < word2.length(); l++) {
							if(word2.charAt(l) == t_sign) {							
								if(k != 0) {
									k--;
									break;	
								}
								break;
							}
							if(l == word2.length() - 1) {
								word2 += t_sign;
							}
							if(word2.length() == 3) {
								break;
							}
						}
					}
					signArr[j] = word2;
					word2 = "";
				}
//			System.out.println(Arrays.toString(signArr));
				for(int j = 0; j < 5; j++) {
					
					String korWord = ""; // korArr에서 무작위로 받을 값
					String signWord = ""; // signArr에서 무작위로 받을 값
					String gameTxt = ""; // korWord + signWord
					String randomGameTxt = "";
					String missWord = "없음"; // 오타를 저장할 변수
					
					korWord = korArr[r.nextInt(korArr.length)];
					signWord = signArr[r.nextInt(signArr.length)];
					gameTxt = korWord + signWord;
					// 게임 문자 랜덤으로 조합
					// 20240822_정지용_게임문자열을 중복없이 랜덤으로 뽑아오는 기능_수정완료
					for(int k = 0; k < gameTxt.length(); k++) {
						char t_txt = gameTxt.charAt(r.nextInt(gameTxt.length())); // 첫번째 쓸 변수
						char r_txt = gameTxt.charAt(r.nextInt(gameTxt.length())); // 두번째부터 쓸 변수
						if(randomGameTxt.length() == 0) {
							randomGameTxt += t_txt;
//						System.out.println("첫 단어 : " + randomGameTxt);
						}
//					System.out.println(gameTxt);
						for(int l = 0; l < randomGameTxt.length(); l++) {
//						System.out.println("문자 : " + r_txt);
							if(randomGameTxt.charAt(l) != r_txt) {
//							System.out.println(randomGameTxt.charAt(l) + " 문자가 다름 " + r_txt);
							}else {
								if(k != 0) {
//								System.out.println("같은 랜덤 수 : " + r_txt);
//								System.out.println(randomGameTxt);
									k--;
									break;	
								}
								break;
							}
							if(l == randomGameTxt.length() - 1) {
								randomGameTxt += r_txt;
//							System.out.println(randomGameTxt);
							}
							if(randomGameTxt.length() == gameTxt.length()) {
								break;
							}
						}
					}
					System.out.println(randomGameTxt);
					long beforeTime = System.currentTimeMillis();
					String userTxt = in.nextLine(); // 값을 입력받을 변수
					long afterTime = System.currentTimeMillis();
					long secDiffTime = (afterTime - beforeTime)/1000;
					questionCnt++;
					accSpeed += secDiffTime;
					accTxt += gameTxt;
					// 20240822_정지용_점수 계산
					if(userTxt.equals(randomGameTxt)) {
						score += 10;
					}else {
						missWord = "";
						score += 0;
					}
					// 20240822_정지용_오답 개수 카운트
					for(int k = 0; k < randomGameTxt.length(); k++) {
						if(userTxt.charAt(k) != randomGameTxt.charAt(k)) {
							missCnt++;
							missWord += userTxt.charAt(k) + " ";
						}
					}
					// 20240822_정지용_ 플레이유저의 타자속도, 정확도, 점수 계산 
					userSpeed[i] = Math.round((accSpeed / questionCnt) * 10) / 10.0; // 소수점 3자리까지 끊어쓰기
					userCorrect[i] = Math.round(((1 - (double) missCnt / accTxt.length()) * 100) * 10) / 10.0; // 소수점 3자리까지 끊어쓰기
					userPoint[i] =  score; // 점수
					System.out.print("타이핑 시간 : "+secDiffTime + "초 / ");
					System.out.print("오타 : " + missWord + " / ");
					System.out.print("현재 점수 : "+ score);
					System.out.println("\n");
				}
				
			}
		}
		
		// 20240822_정지용_타자속도 점수 환산
		for(int i = 0; i < userCnt; i++) {
			if(userSpeed[i] < 2) {
				userSpeedScore[i] = 100 * 0.2;
			}else if(userSpeed[i] < 4) {
				userSpeedScore[i] = 80 * 0.2;
			}else if(userSpeed[i] < 6) {
				userSpeedScore[i] = 60 * 0.2;
			}else if(userSpeed[i] < 8) {
				userSpeedScore[i] = 40 * 0.2;
			}else if(userSpeed[i] < 10) {
				userSpeedScore[i] = 20 * 0.2;
			}else {
				userSpeedScore[i] = 0;
			}
		}
		// 20240822_정지용_정확도 점수 환산
		for(int i = 0; i < userCnt; i++) {
			userCorrectScore[i] = Math.round((userCorrect[i] * 0.3) * 10) / 10.0;
		}
		// 20240822_정지용_총점 계산 (점수 * 0.5) + 속도 환산점수 + 정확도 환산점수
		for(int i = 0; i < userCnt; i++) {
			userTotalScore[i] = Math.round(((userPoint[i] * 0.5) + userSpeedScore[i] + userCorrectScore[i]) * 100) / 100.0;			
		}
		// 20240822_원진호_순위를 매기기 위한 반복문
		int [] ranking = new int[userCnt];
		double max_num = 0;
		int max_index = 0;
		int x = 0;
		for(int i = 0; i < userCnt; i++) {
			if(userTotalScore[i] > max_num) {
				max_num = userTotalScore[i];
				max_index = i;
			}
			if(i == userCnt - 1) {
				ranking[x] = max_index;
				userTotalScore[max_index] = 0;
				max_num = 0;
				max_index = 0;
				x++;
				i = -1;
			}
			if(x == userCnt) {
				break;
			}
		}
//		System.out.println(Arrays.toString(ranking)); // 랭킹 확인
		// 20240822_원진호_총점이 0이 되버려서 다시 원상복구 작업
		for(int i = 0; i < userCnt; i++) {
			userTotalScore[i] = Math.round(((userPoint[i] * 0.5) + userSpeedScore[i] + userCorrectScore[i]) * 100) / 100.0;			
		}
		// 결과
		System.out.println("총점은 (점수 + 속도 + 정확도)의 환산값 입니다.");
		System.out.println("이름   총점   점수   속도   정확도");
		System.out.println("---------------------------");
		for(int i = 0; i < userCnt; i++) {			
			System.out.println(userId[ranking[i]] + "   " + userTotalScore[ranking[i]] + 
					"  " + userPoint[ranking[i]] + "   " + userSpeed[ranking[i]] + 
					"   " + userCorrect[ranking[i]]);
		}
	}

}
