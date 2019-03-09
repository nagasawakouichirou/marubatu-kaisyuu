package marubatu1;

import java.util.Scanner;

public class Marubatu {
	public static void main(String[] args) {

		String mark[] = { " ", "O", "X" };


		//マスの作成
		int[][] atai;
		atai = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mark[atai[i][j]]);
				if (j == 2) {
					System.out.println();
					break;
				}
				System.out.print(" |");
			}
		}



		// ○✕の表示
		 String aikonn [] = {" ", "O", "X"};
		 Scanner sc = new Scanner(System.in);
		//プレイヤーの表示
	       for(int turn = 0; turn < 9 ; turn++){
         int player = turn%2+1;
         System.out.println("Player"+player+"の番です");

         //数字の入力

		 int tate,yoko;
		 System.out.println("縦の値の入力");
		 tate = sc.nextInt();
		 System.out.println("横の値の入力");
		 yoko = sc.nextInt();
		 System.out.println(aikonn[]);

		 if(tate<0 || yoko<0 || tate<=3 || yoko<=3 || tate == 0 || yoko == 0) {
			 System.out.println("もう一度入力");
		 }else {

			 }

		}


		 //if (number1 < 0 | number1 > 2) {
				//					System.out.println("もう一度数字を入れ直してください");
				//					continue;
				//				}
//	        for(int turn = 0; turn < size*size ; turn++){
//	            int player = turn%2+1;
//	            System.out.println("Player"+player+"の番です");

//	            int putX,putY;
//	            do{
//	                System.out.println("X座標を入力してください");
//	                putX = sc.nextInt();
//	                System.out.println("Y座標を入力してください");
//	                putY = sc.nextInt();
//	            }while(putX<0 || putY<0 || putX>=size || putY>=size || cell[putX][putY]!=0);
//	            cell[putX][putY] = player;



		//int[][] masu;
		//masu = new int [3][3];
		//		for (int i = 0; i < 3; i++) {
		//			for (int j = 0; j < 3; j++) {
		//				masu[i][j] = 0;
		//
		//			}
		//		}
		//		//0=空白
		//		//String mark[] = {" ", "O", "X"};
		//		//Scanner sc = new Scanner(System.in);
		//
		//		//for (int i = 0; i < 3; i++) {
		//			//for (int j = 0; j < 3; j++) {
		//				//System.out.print(masu[i][j]);
		//				//if (j == 2) {
		//					//continue;
		//				//}
		//				//if (masu[i][j] == 0) {
		//					System.out.print(" |");
		//				}
		//				System.out.println();
		//			}
		//
		//			boolean repeat = true;
		//			Scanner scan  = null;
		//			int m = 0;
		//			while (repeat) {
		//				int a;
		//				if (m % 2 == 0) {
		//					System.out.println("o" + "の番です");
		//					a = 1;
		//				} else {
		//					System.out.println("x" + "の番です");
		//					a = -1;
		//				}
		//				scan = new Scanner(System.in);
		//				System.out.println("たて");
		//				int number1 = scan.nextInt();
		//
		//				if (number1 < 0 | number1 > 2) {
		//					System.out.println("もう一度数字を入れ直してください");
		//					continue;
		//				}
		//				System.out.println("よこ");
		//				int number2 = scan.nextInt();
		//				if (number2 < 0 | number2 > 2) {
		//					System.out.println("もう一度数字を入れ直してください");
		//					continue;
		//				}
		//				if(masu[number1][number2] != 0) {
		//					System.out.println("すでに石が置いてあります。もう一度入力してください");
		//					continue;
		//
		//				}
		//
		//				masu[number1][number2] = a;
		//				for (int k = 0; k < 3; k++) {
		//					for (int l = 0; l < 3; l++) {
		//						if (masu[k][l] == 1) {
		//							System.out.print("o");
		//						} else if(masu[k][l] == -1){
		//							System.out.print("x");
		//						}else {
		//							System.out.print(masu[k][l]);
		//						}
		//						if (l == 2) {
		//							continue;
		//						}
		//						System.out.print(" |");
		//					}
		//					System.out.println();
		//				}
		//
		//				// 横の判定
		//
		//				int s = 0;
		//
		//				for([s][0] != 0);
		//
		//						for(int x=0; x<3; x++){
		//							if(masu[s][0] == 3) {
		//								System.out.println("◯の勝ちです");
		//							}else (masu[s][0] == -3) {
		//								System.out.println("✕の勝ちです");
		//							}
		//
		//							if (masu[s][0] != 0) {
		//							}
		//							if (masu[s][0] != 0) {
		//							}
		//							if (masu[s][0] != 0) {
		//							}
		//
		//							if (masu[s][3] == 3) {
		//								System.out.println('o' + "の勝ちです。");
		//								repeat = false;
		//							} else if (masu[s][3] == -3) {
		//								System.out.println('x' + "の勝ちです。");
		//								repeat = false;
		//							}
		//						}
		//
		//
		//						// 縦の判定
		//
		//						int s = 0;
		//						for(int x=0; x<3; x++){
		//							if(masu[x][s] == 3)s++;
		//
		//							if (masu[0][b] != 0) {
		//							}
		//							if (masu[1][b] != 0) {
		//							}
		//							if (masu[2][b] != 0) {
		//							}
		//
		//							if (masu[3][b] == 3) {
		//								System.out.println('o' + "の勝ちです。");
		//								repeat = false;
		//							} else if (masu[3][b] == -3) {
		//								System.out.println('x' + "の勝ちです。");
		//								repeat = false;
		//							}
		//						}
		//
		//						// 斜めの判定 1
		//						int s = 0;
		//
		//						for(int x=0; x<3; x++){
		//							if(masu[x][s] == 3)s++;
		//
		//
		//							if (masu[a2][b] != 0) {
		//							}
		//							if (masu[a2][b] != 0) {
		//							}
		//							if (masu[a2][b] != 0) {
		//							}
		//
		//							if (masu[a2][b] == 3) {
		//								System.out.println('o' + "の勝ちです。");
		//								repeat = false;
		//							} else if (masu[a2][b] == -3) {
		//								System.out.println('x' + "の勝ちです。");
		//								repeat = false;
		//							}
		//						}
		//						//ちがう
		//						// 斜めの判定 2
		//						int s = 0;
		//						for(int x=0; x<3; x++){
		//							if(masu[x][s] == 3)s++;
		//
		//							if (masu[0][2] != 0) {
		//							}
		//							if (masu[1][1] != 0) {
		//							}
		//							if (masu[2][0] != 0) {
		//							}
		//							if (masu[3][3] == 3) {
		//								System.out.println('o' + "の勝ちです。");
		//								repeat = false;
		//							} else if (masu[3][3] == -3) {
		//								System.out.println('x' + "の勝ちです。");
		//								repeat = false;
		//							}
		//
		//
		//							if (m==8) {
		//								System.out.println("あいこです。");
		//								repeat = false;
		//							}
		//							m++;
		//						}
		//						scan.close();
		//    }
	}
}
