package loopKadai;

import java.util.ArrayList;

public class LoopKadai1 {
	public static void main (String[] args ) {
		// 変数の宣言
		int si;

		// 処理内容の記述
		for(si = 0; si < 5; si++)
			// 出力
			System.out.println("SIシステム株式会社");

		// 変数の宣言
		ArrayList<String> seasonList = new ArrayList<String>();

		// 文字列の追加
		seasonList.add("春");
		seasonList.add("夏");
		seasonList.add("秋");
		seasonList.add("冬");
		System.out.println("");

		// リストから値の取り出し、出力
		for(int i=0; i<1; ++i)
			System.out.println("1個目" + seasonList.get(0));
			System.out.println("2個目" + seasonList.get(1));
			System.out.println("3個目" + seasonList.get(2));
			System.out.println("4個目" + seasonList.get(3));
			System.out.println("");

		// 	九九の表を出力
		System.out.print("1の段 : ");
		{
			for(int number1=1, number2=1; number2<=9; number2++)
				System.out.print( (number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("2の段 : ");
		{
			for(int number1=2, number2=1; number2<=9; number2++)
				System.out.print( (number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("3の段 : ");
		{
			for(int number1=3, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("4の段 : ");
		{
			for(int number1=4, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("5の段 : ");
		{
			for(int number1=5, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("6の段 : ");
		{
			for(int number1=6, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("7の段 : ");
		{
			for(int number1=7, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("8の段 : ");
		{
			for(int number1=8, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

		System.out.print("9の段 : ");
		{
			for(int number1=9, number2=1; number2<=9; number2++)
				System.out.print((number1 * number2) + " ");
			System.out.println("");
		}

	}

}
