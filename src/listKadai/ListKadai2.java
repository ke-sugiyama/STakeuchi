package listKadai;

import java.util.ArrayList;
import java.util.Collections;

public class ListKadai2 {
	public static void main (String[] args) {

		// 変数宣言
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		// 数値の追加
		numberList.add(6);
		numberList.add(10);
		numberList.add(2);
		numberList.add(4);
		numberList.add(8);
		numberList.add(4);

		// 値の出力
		System.out.println("1個目 : " + numberList.get(0));
		System.out.println("2個目 : " + numberList.get(1));
		System.out.println("3個目 : " + numberList.get(2));
		System.out.println("4個目 : " + numberList.get(3));
		System.out.println("5個目 : " + numberList.get(4));
		System.out.println("6個目 : " + numberList.get(5));
		System.out.println("");

		// 昇順に並べ替え
		Collections.sort(numberList);

		// 値の出力
		System.out.println("ソート後");
		System.out.println("1個目 : " + numberList.get(0));
		System.out.println("2個目 : " + numberList.get(1));
		System.out.println("3個目 : " + numberList.get(2));
		System.out.println("4個目 : " + numberList.get(3));
		System.out.println("5個目 : " + numberList.get(4));
		System.out.println("6個目 : " + numberList.get(5));
		System.out.println("");

		// 数値の数
		System.out.println("リストの要素数 = " + numberList.size());
		System.out.println("");

		// 数値の削除
		numberList.clear();

		// 数値の数を出力
		System.out.println("消した後のリストの要素数 = " + numberList.size());


	}
}
